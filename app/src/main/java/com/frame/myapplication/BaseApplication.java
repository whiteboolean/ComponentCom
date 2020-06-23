package com.frame.myapplication;

import android.app.Application;

import com.billy.cc.core.component.CC;


public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CC.enableVerboseLog(true);
        CC.enableDebug(true);
        CC.enableRemoteCC(true);
    }
}
