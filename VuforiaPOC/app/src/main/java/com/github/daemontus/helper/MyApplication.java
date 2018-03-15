package com.github.daemontus.helper;

import android.app.Application;

/**
 * Created by jamamwitwit on 12/03/2018.
 */

public class MyApplication extends Application {

    private static MyApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static MyApplication getContext() {
        return mContext;
    }
}