package com.tirthcshahgmail.ifest15;

/**
 * Created by sneh on 24/9/15.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab22 extends Fragment {

    ListView lv;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.contact_list,container,false);

        lv=(ListView) root.findViewById(R.id.contactList);
        context=getActivity();

        Bundle extras = getActivity().getIntent().getExtras();
        int event_no = extras.getInt("Event_no");
        int tab=extras.getInt("Tab");
        lv.setAdapter(new ContactListAdapter(context,MainIntent.contactName[tab][event_no],MainIntent.call[tab][event_no]));

        return root;
    }
}
