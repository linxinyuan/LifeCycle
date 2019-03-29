package com.example.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/**
 * Author : Create by Linxinyuan on 2019/03/29
 * Email : linxinyuan@lizhi.fm
 * Desc : android dev
 */
public class RemoteService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return new MyAidl();
    }

    private class MyAidl extends IMyAidlInterface.Stub{

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }
    }
}
