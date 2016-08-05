package com.tirthcshahgmail.ifest15;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Arrays;


public class Event extends ActionBarActivity {
    ListView lv;
    EventListAdapter listAdapter;
    static String[] name = {"i.Decipher","i.Quiz", "Arduino Mela", "i.Code","Blind C", "i.Papyrus ", "Inaugural", "i.Ganith","i.Bot - Line Follower", "i.App - Category 1", "i.Biz", "i.Database - Elim.", "i.Electro - Elim.", "Treasure Hunt", "i.Maze", "i.Cube", "i.Intelligence","i.Bot - Robo Race", "i.App - Category 2", "i.Database - Finals ", "i.Electro - Finals", "i.Crypt", "i.Rubble", "Closing Ceremony", "DJ"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Arrays.sort(name);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        lv= (ListView) findViewById(R.id.eventList);
        listAdapter=new EventListAdapter(this,name);
        lv.setAdapter(listAdapter);
    }
}
