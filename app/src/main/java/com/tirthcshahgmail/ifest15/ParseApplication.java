package com.tirthcshahgmail.ifest15;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
/**
 * Created by sneh on 21/10/15.
 */


public class ParseApplication extends Application {

    String YOUR_APPLICATION_ID = "Mlb6JCJVV7hjv9DRVvioxfTxcsGls59q3fL7bfV0";
    String YOUR_CLIENT_KEY = "vDRVicXXiKVHb0jG2kMBbmS4gbZXZJ2Y8pl16Qnb";

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
        ParseInstallation.getCurrentInstallation().saveInBackground();

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }
}
