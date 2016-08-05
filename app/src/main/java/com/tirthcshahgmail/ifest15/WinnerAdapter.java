package com.tirthcshahgmail.ifest15;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sneh on 21/10/15.
 */
public class WinnerAdapter extends BaseAdapter {

    ArrayList<EventWinners> eventWinners;
    Context context;
    private static LayoutInflater inflater=null;

    public WinnerAdapter(Context Winner, ArrayList<EventWinners> eventWinners) {
        this.eventWinners = eventWinners;
        context=Winner;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return eventWinners.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder
    {
        TextView event;
        TextView winner1;
        TextView co1;
        TextView position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.winner_item, null);

        holder.event = (TextView) rowView.findViewById(R.id.event);
        holder.winner1 = (TextView) rowView.findViewById(R.id.winner1);
        holder.co1 = (TextView) rowView.findViewById(R.id.co1);
        holder.position = (TextView) rowView.findViewById(R.id.position1);

        holder.event.setText(eventWinners.get(position).event);
        holder.winner1.setText(eventWinners.get(position).participantName);
        holder.co1.setText(eventWinners.get(position).collegeName);
        holder.position.setText(eventWinners.get(position).position);

        if(position%3==0){
            holder.event.setVisibility(View.VISIBLE);
        } else{
            holder.event.setVisibility(View.GONE);
        }

        return rowView;
    }
}