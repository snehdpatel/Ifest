package com.tirthcshahgmail.ifest15;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class EventListAdapter extends BaseAdapter {
    String[] name;
    Context context;
    private static LayoutInflater inflater = null;
    static int tab=0,column=0;

    public EventListAdapter(Event list, String[] name) {
        // TODO Auto-generated constructor stub
        this.name = name;
        context = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return name.length;
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
        TextView name, description, time, venue;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder = new Holder();
        View rowView;
        Log.d("reached","reached");
        rowView = inflater.inflate(R.layout.single_schedule_list_desig, null);
        holder.name = (TextView) rowView.findViewById(R.id.textN);
        holder.description = (TextView) rowView.findViewById(R.id.textDesc);
        holder.time = (TextView) rowView.findViewById(R.id.time1);
        holder.venue = (TextView) rowView.findViewById(R.id.venueloc);
        holder.name.setText(name[position]);
        int tab = 0,column = 0;
        boolean found=false;
        for(int i =0;i<4;i++){
            for(int j =0;j<MainIntent.Name[i].length;j++) {
                if (name[position].equals(MainIntent.Name[i][j])) {
                    tab=i;
                    column=j;
                    holder.venue.setText(MainIntent.Location[i][j]);
                    holder.time.setText(MainIntent.Time[i][j]);
                    holder.description.setText(Tab11.Value[i][j]);

                    found=true;
                    break;
                }
            }
            if(found)
                break;
        }
        final int finalTab = tab;
        final int finalColumn = column;
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent i = new Intent(context, MainIntent.class);
                i.putExtra("Tab", finalTab);

                i.putExtra("Event_no", finalColumn);
                context.startActivity(i);
            }
        });
        return rowView;
    }

}