package com.tirthcshahgmail.ifest15;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Calendar;

public class CustomAdapter extends BaseAdapter {
    int tab;
    int x = 0;
    String[] result;
    Context context;
    private static LayoutInflater inflater = null;

    public CustomAdapter(MainActivity mainActivity, String[] prgmNameList, int tabNo) {
        tab = tabNo;
        // TODO Auto-generated constructor stub
        result = prgmNameList;
        context = mainActivity;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {
        TextView tv, time, venue, sideTime;
        TextView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Log.d("m",result[position]);
        String[] a = MainIntent.Time[tab][position].split(" - ");
        String[] start = a[0].split(":");
        String[] end = a[1].split(":");
        // TODO Auto-generated method stub
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.single_schedule_list_design, null);
        holder.tv = (TextView) rowView.findViewById(R.id.textName);
        holder.time = (TextView) rowView.findViewById(R.id.time);
        holder.venue = (TextView) rowView.findViewById(R.id.venue);
        holder.img = (TextView) rowView.findViewById(R.id.textDesc1);
        holder.tv.setText(result[position]);
        holder.img.setText(Tab11.Value[tab][position]);
        holder.venue.setText(MainIntent.Location[tab][position]);
        holder.time.setText(MainIntent.Time[tab][position]);
        int startMin = Integer.parseInt(start[1]);
        int startHour = Integer.parseInt(start[0]);
        int endHour = Integer.parseInt(end[0]);
        int endMin = Integer.parseInt(end[1]);
        holder.sideTime = (TextView) rowView.findViewById(R.id.view);
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH)+1, min = c.get(Calendar.MINUTE), day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);


        Log.d("time",month+" "+day+" "+hour+" "+min+" ");

        if (month < 10) {

            holder.sideTime.setBackgroundColor(Color.parseColor("#D9C0C0C0"));
        } else if (month == 10) {
            if (day < tab + 23) {
                holder.sideTime.setBackgroundColor(Color.parseColor("#D9C0C0C0"));

            } else if (day == tab + 23) {
                if (hour < startHour) {
                    holder.sideTime.setBackgroundColor(Color.parseColor("#D9C0C0C0"));

                } else {
                    if (hour < endHour || (hour == endHour && endMin > min)) {
                        holder.sideTime.setBackgroundColor(Color.parseColor("#d93ab2ed"));
                    } else {
                        holder.sideTime.setBackgroundColor(Color.parseColor("#D9252525"));
                    }

                }
            } else {
                holder.sideTime.setBackgroundColor(Color.parseColor("#D9252525"));

            }

        } else {
            holder.sideTime.setBackgroundColor(Color.parseColor("#D9252525"));

        }


        holder.tv.setText(result[position]);

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent i = new Intent(context, MainIntent.class);
                i.putExtra("Tab", tab);
                i.putExtra("Event_no", position);
                context.startActivity(i);
            }
        });
        return rowView;
    }

}