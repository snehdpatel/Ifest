package com.tirthcshahgmail.ifest15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainContact extends AppCompatActivity {
ListView lv;
    ContactUsListAdapter adapter;
    String[] contactName={"Abhishek Parikh","Sahil Jain","Raj Suvariya","Khyati Mahajan","Nidhi Vyas","Nilay Shrimali"};
    String[] contactNumber={"+91 94295 20590","+91 81285 52048","+91 90998 09050","+91 97272 47344","+91 87588 34909","+91 70462 95423"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contect);

        lv= (ListView) findViewById(R.id.mainContact);
        adapter=new ContactUsListAdapter(this,contactName,contactNumber);

        lv.setAdapter(adapter);
    }
}
