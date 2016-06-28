package com.example.satchinc.simplechat;

import android.app.Application;

import com.example.satchinc.simplechat.Models.Message;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by satchinc on 6/28/16.
 */


public class ChatApplication extends Application {
    final String APP_ID = "93bd0b59a90d46b1999e484431b83f41";
    final String server = "https://simplechatclient.herokuapp.com/parse/";
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Message.class);


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(APP_ID) // should correspond to APP_ID env variable
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server(server).build());

    }
}
