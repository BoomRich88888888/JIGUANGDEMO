package com.example.jiguangdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * 创建日期：2018/7/28 on 15:15
 * 作者: 郭大莹
 * QQ:1064821651
 */
public class ExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
