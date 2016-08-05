package com.tirthcshahgmail.ifest15;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.jaunt.Document;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;
import com.jaunt.component.Label;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button submit = (Button) findViewById(R.id.submit);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText ph_no = (EditText) findViewById(R.id.ph_no);
        final EditText email = (EditText) findViewById(R.id.email);
        final CheckBox app = (CheckBox) findViewById(R.id.app);
        final UserAgent userAgent = new UserAgent();
        final Document[] doc = new Document[1];

        /*if(!isOnline()) {
            Intent i = new Intent(getApplicationContext(), No_connection.class);
            startActivity(i);
        }*/

        try{
            Toast.makeText(getApplicationContext(), "Trying to visit",Toast.LENGTH_SHORT).show();
            userAgent.visit("http://ieee.daiict.ac.in/ifest15/#register");
            System.out.println(userAgent.doc.innerHTML());
        }
        catch(JauntException e){
            System.out.println(e);
        }

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    doc[0] = userAgent.doc;
                    Toast.makeText(getApplicationContext(), (CharSequence) doc[0],Toast.LENGTH_LONG).show();
                    doc[0].fillout("Your Full Name", String.valueOf(name.getText()));       //fill out the component labelled 'Username:' with "tom"
                    doc[0].fillout("Phone No.", String.valueOf(ph_no.getText()));    //fill out the component labelled 'Password:' with "secret"
                    doc[0].fillout("Email", String.valueOf(email.getText()));
                    if(app.isChecked())
                        doc[0].choose(Label.RIGHT, "i.App");//choose the component right-labelled 'Remember me'.
                    userAgent.doc.submit();                          //submit the form
                }
                catch(JauntException e){
                    System.out.println(e);
                }
            }
        });

    }

    public boolean isOnline(){
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if(info != null && info.isConnected())
            return true;
        else
            return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
