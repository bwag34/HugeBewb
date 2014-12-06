package com.blankexample.brian.self_destructingmessage;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Brian on 11/30/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "UP7JHekNxJS5ouxRUvEV2cK8rFjLm7eONsEMWerI", "HOoiSTZwk0SL7eJWsialmK2GNHmpJaJYDYDypvQj");

    }
}
