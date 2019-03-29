package com.example.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;

/**
 * Author : Create by Linxinyuan on 2019/03/19
 * Email : linxinyuan@lizhi.fm
 * Desc : android dev
 */
public class MainPresenter extends BasePresenter{
    @Override
    public void onCreate(LifecycleOwner owner) {
        super.onCreate(owner);
    }

    @Override
    public void onDestory(LifecycleOwner owner) {
        super.onDestory(owner);
    }

    @Override
    public void onAny(LifecycleOwner owner, Lifecycle.Event event) {
        super.onAny(owner, event);
    }
}
