package com.tirthcshahgmail.ifest15;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Winners extends AppCompatActivity {

    private ArrayList<EventWinners> eventWinners = new ArrayList<EventWinners>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winners);

        final ProgressDialog loading = ProgressDialog.show(this, "Please wait!", "Fetching", false, false);
        String url = "http://parikhabhi007.pythonanywhere.com/results";

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("RESPONSE IS " + response);
                processJSON(response);
                ListView lv = (ListView) findViewById(R.id.winnerList);
                lv.setAdapter(new WinnerAdapter(getApplicationContext(),eventWinners));
                loading.dismiss();
            }
        },
        new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("Error in fetch")
				Toast.makeText(getApplicationContext(), error.getMessage().toString(), Toast.LENGTH_LONG).show();
				loading.dismiss();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void processJSON(String response) {

        try {
            Log.d("response", response);
            JSONObject jsonObject = new JSONObject(response);
            JSONArray ja = jsonObject.getJSONArray("results");
            for (int i = 0; i < ja.length(); i++) {
                JSONObject jo = ja.getJSONObject(i);
                String eventName = jo.getString("EventName");
                String participantName = jo.getString("Participant");
                String collegeName = jo.getString("CollegeName");
                String position = jo.getString("Position");

                eventWinners.add(new EventWinners(eventName,participantName, collegeName,position));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}