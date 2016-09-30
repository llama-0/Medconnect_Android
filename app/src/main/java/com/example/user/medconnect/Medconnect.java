package com.example.user.medconnect;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by user on 30.09.2016.
 */

public class Medconnect extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
