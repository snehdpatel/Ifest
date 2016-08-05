package com.tirthcshahgmail.ifest15;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tirth Shah on 08-10-2015.
 */
public class ContactListAdapter extends BaseAdapter {

    String [] name,number;
    Context context;
    private static LayoutInflater inflater=null;
    public ContactListAdapter(Context mainIntent, String[] name,String[] number) {
        // TODO Auto-generated constructor stub
        this.name =name;
        this.number=number;
        context=mainIntent;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

    public class Holder
    {
        TextView name;
        TextView number;
        ImageView image;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.single_contact_item, null);
        holder.name=(TextView) rowView.findViewById(R.id.contactName);
        holder.number=(TextView) rowView.findViewById(R.id.contactNumber);
        holder.image= (ImageView) rowView.findViewById(R.id.contactImage);
        holder.name.setText(name[position]);
        holder.number.setText(number[position]);
        final String dial1 = "tel:"+number[position];
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse(dial1);
                Intent callIntent = new Intent(Intent.ACTION_CALL, number);
                context.startActivity(callIntent);
            }
        });

        return rowView;
    }

}
