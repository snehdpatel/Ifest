package com.tirthcshahgmail.ifest15;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainIntent extends ActionBarActivity {

    // Declaring Your View and Variables

    Toolbar toolbar;
    ViewPager pager;





    public static String[][][] contactName = {{{"Dhaval Panjwani","Saurav Pratihar","Anuj Bhavsar","Jaymil Koshiya","Parth Chauhan"},{},{"Vyas Utsav","Parth Panchal","Suparshva Mehta","Aayush Kapadia"}},
            {{"Nishit Chhatrala ","Harsh Thakkar ","Vivek Dalsaniya","Hiral Parmar "},{"Keval Shah","Jinesh Shah"},{},{"Yash Indrawat","Tejasv Gupta","Ashwin Kirtane","Shubham Chaturvedi"}},
            {{"Vaidehi Darji","Pratish Anand","Saumil Patel","Sai Teja Vasireddy","Akash Koradia"},{"Jaya Mundra","Komal Falodiya","Deepali  Verma"},{"Pinakin Shethna","Keya mehta","Shreyns Gandhi","Rashmi Wilson"},{"Harshit Patel","Manish Berwani","Divyesh Savaliya","Akshat Dua"},{"Anurag Reddy","Shivang Agarwal"},{"Madhuri Jain","Amisha Singla","Sujith Royal","Malveeka Bhandari","Aarsee Aeron"},{"Dhruv Bhutani","Dhaval Vora","Rishab Singla"},{"Kartik Sankhla","Sheetal Kumari","Sumit Singh"},{"Prerak Dholakiya","Bhagyesh Vikani","Smit Popat"}},
            {{"Vaidehi Darji","Pratish Anand","Saumil Patel","Sai Teja Vasireddy","Akash Koradia"},{"Jaya Mundra","Komal Falodiya","Deepali  Verma"},{"Harshit Patel","Manish Berwani","Divyesh Savaliya","Akshat Dua"},{"Anurag Reddy","Shivang Agarwal"},{"Sakshi Mangal","Mahima Achhpal","Nidhi Pitroda"},{"Shubhranshu Jha","Kevin Vegda","Aniket Gajjar"},{"Siddharth Dalmia","Soham Darji","Dhruv Saliya","Dakshal Shah","Divyaraj Masani"},{},{}}};





            /*{"Pragnesh Patel",},
            {"Siddharth Bhutiya (Dota)","Shri Ram Hansda (CS)","Mohit Rami","Vaibhav Gamit","Dhruman Daxini","Sachin Gohel","Heaven Patel","Yogesh Sankhla"},



            ,*/





public static    String[][][] call = {{{"9408728111","9033399314","9426682544","9574959597","9998109590"},{},{"9510872145","9712916367","8866430401","7046446180"}},
        {{"8460770916 ","8866821682 ","9909502843","8866306370"},{"9712436065","9429674258"},{},{"7383744402","9726724162","9574110030","8696142923"}},
        {{"9974048310","9727126986","8347479891","8712734037","7043311200"},{"8511514627","8128243454","9662588388"},{"8401444752","7600070199","8905686446","9925256413"},{"9173975131","9408723979","-","-"},{"7567817779","9904784795"},{"9601032344","7048336371","9016798379","9898353184","9925567522"},{"9624162970","8460311660","8128244506"},{"8758282617","7567008033","9726722286"},{"9227631074","9408885950","7405181629"}},
        {{"9974048310","9727126986","8347479891","8712734037","7043311200"},{"8511514627","8128243454","9662588388"},{"9173975131","9408723979","-","-"},{"7567817779","9904784795"},{"8128245490","9601033422","9714184001"},{"8238336119","7405587871","9099939989"},{"9971799250","+91 88661 35733","+91 88663 16641","+91 97245 60980","+91 90333 99902"},{},{}}};





public static int[][] ix = {{R.mipmap.decipher,R.mipmap.bkgnd,R.mipmap.code},{R.mipmap.blind,R.mipmap.bkgnd,R.mipmap.bkgnd,R.mipmap.bkgnd},{R.mipmap.bot,R.mipmap.app,R.mipmap.bizz,R.mipmap.bkgnd,R.mipmap.electro,R.mipmap.treasure,R.mipmap.maze,R.mipmap.bkgnd,R.mipmap.intelligence},{R.mipmap.bot,R.mipmap.app,R.mipmap.bkgnd,R.mipmap.electro,R.mipmap.bkgnd,R.mipmap.iquizfinal,R.mipmap.irubble,R.mipmap.bkgnd,R.mipmap.dj}};




            /*{"8460073837"},
            {"8866195514","7600640861","9974790510","7600713770","9624041498","8460473244","8460657990","7048181374"},



            {"8238336119","7405587871","9099939989"},

            };*/
    //String[] Time = {"14:00 - 17:00","14:30 - 17:00 ","10:00 - 12:00","11:00 - 13:00"," 1: 9:00 - 12:00 2:9:00 - 12:00 ","NULL ","14:00 - 15:00","R1:  14:30 - 16:30  R2: 11:00 - 13:00 ","R1: 14:30 - 16:30 R2: 12:00 - 13:00","20:30 - 22:00 ","20:30 - 22:30"," 14:30 - 18:00","NULL","NULL","20:30 - 22:30","NULL","19:30 - 20:30","15:00 - 16:30","16:30 - 19:00","NULL"," 17:00 - 19:00 "};
    static String[][] Name = {{"i.Decipher", "Arduino Mela", "i.Code"}, {"Blind C", "i.Papyrus ", "Inaugural", "i.Ganith"}, {"i.Bot - Line Follower", "i.App - Category 1", "i.Biz", "i.Database - Elim.", "i.Electro - Elim.", "Treasure Hunt", "i.Maze", "i.Cube", "i.Intelligence"}, {"i.Bot - Robo Race", "i.App - Category 2", "i.Database - Finals ", "i.Electro - Finals", "i.Crypt","i.Quiz", "i.Rubble", "Closing Ceremony", "DJ"}};
    //static String[][] Tags = {{"Fun", "Technical", "Technical"}, {"Technical", "Technical", "Technical", "Technical"}, {"Technical", "Technical", "Technical", "Technical", "Technical", "Fun", "Technical", "Technical", "Technical"}, {"Technical", "Technical", "Technical", "Technical", "Technical", "Fun", "Fun", "Fun"}};
    static String[][] Time = {{"21:00 - 00:00","14:00 - 17:00","21:00 - 23:59"},{      "14:30 - 17:00","14:30 - 18:00","18:00 - 20:00","20:30 - 22:00"},{"9:00 - 12:00","10:00 - 12:00","11:00 - 13:00","14:30 - 16:30","14:30 - 16:30","17:00 - 19:00","19:30 - 20:30","20:30 - 22:30","20:30 - 22:30"},{"09:00 - 12:00","10:00 - 12:00","11:00 - 13:00","12:30 - 13:00","13:00 - 15:00","15:00 - 16:30","16:30 - 19:00","19:00 - 21:00","21:00 - 23:59"}};
    static String[][] Location = {{"LAB","LAB","LAB"},{"LAB","CEP","LT","LT"},{"LT","CEP","CEP","LAB","LT","CAFE","LT","CAFE","Cafe"},{"LT","LT","LAB","LAB","LT","LT","LT","LT","Cafe"}};
    static String[] Date = {"22/10/2015","23/10/2015 ","24/10/2015","25/10/2015"};
    static String[][] Prize = {{"2000","Exhibition","5000"},{"3000","6000","","3500"},{"2500","4000","7000","4000","3500","5000","3000","2500","3500"},{"2500","2000","4000","3500","3000","3000","4000","",""}};
    ViewPagerAdapter1 adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"About","Co-ordinators"};
    int Numboftabs =2;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8), (int)(height*0.8));*/

        setContentView(R.layout.activity_main_intent);

        /*FadingActionBarHelper helper = new FadingActionBarHelper()
                .actionBarBackground(R.drawable.ic_launcher)
                .headerLayout(R.layout.header)
                .contentLayout(R.layout.activity_main_intent);
        setContentView(helper.createView(this));
        helper.initActionBar(this);*/

        Bundle extras = getIntent().getExtras();
        int event_no = extras.getInt("Event_no");
        int tab = extras.getInt("Tab");
/*
        String[] Name = {"I-Maze","I-Database","I-Ganith"};
        String[] Prize = {"10000","20000","30000"};
        String[] Time = {"8.30 to 9.30", "14.00 to 16.00", "10.00 to 14.00"};
        String[] Location = {"CEP-106","CEP-110","LAB-007"};
        String[] Date = {"14/10/2015","15/10/2015","15/10/2015"};*/

        TextView name = (TextView) findViewById(R.id.text);
        TextView prize = (TextView) findViewById(R.id.textView10);
        TextView time = (TextView) findViewById(R.id.venueloc);
        TextView date = (TextView) findViewById(R.id.textView3);
        TextView location = (TextView) findViewById(R.id.time1);
        ImageView iv = (ImageView) findViewById(R.id.iv);

        //name.setText(Name[event_no]);
        prize.setText(Prize[tab][event_no]);
        time.setText(Time[tab][event_no]);
        location.setText(Location[tab][event_no]);
        date.setText(Date[tab]);

        prize.setTextColor(Color.parseColor("#e3f2fd"));
        time.setTextColor(Color.parseColor("#e3f2fd"));
        date.setTextColor(Color.parseColor("#e3f2fd"));
        location.setTextColor(Color.parseColor("#e3f2fd"));



        Typeface face = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");
        //name.setTypeface(face); //name.setTextSize();
        prize.setTypeface(face);
        time.setTypeface(face);
        location.setTypeface(face);
        date.setTypeface(face);

        Intent i1 = new Intent(this, Tab11.class);
        i1.putExtra("Event_no", event_no);

        Intent i2 = new Intent(this, Tab22.class);
        i2.putExtra("Event_no", event_no);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(Name[tab][event_no]);

        //CoordinatorLayout.DefaultBehavior(v.Behavior.class);
        //iv.setBackgroundColor(getResources().getColor(R.color.ColorPrimary));
        iv.setBackgroundResource(ix[tab][event_no]);
        adapter =  new ViewPagerAdapter1(getSupportFragmentManager(),Titles, Numboftabs);

        // Assigning ViewPiew and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width
        tabs.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
        //tabs.getLayoutParams().width = ViewGroup.LayoutParams.WRAP_CONTENT;


    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();



        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
            //Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
            //startActivityForResult(myIntent,0);
        finish();
        return true;
        //}

        //return super.onOptionsItemSelected(item);
    }
}