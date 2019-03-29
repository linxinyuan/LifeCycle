package com.example.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import static android.arch.lifecycle.Lifecycle.Event.ON_ANY;
import static android.arch.lifecycle.Lifecycle.Event.ON_CREATE;
import static android.arch.lifecycle.Lifecycle.Event.ON_DESTROY;

/**
 * Author : Create by Linxinyuan on 2019/03/19
 * Email : linxinyuan@lizhi.fm
 * Desc : android dev
 */
public interface IPresenter extends LifecycleObserver {

    @OnLifecycleEvent(ON_CREATE)
    void onCreate(LifecycleOwner owner);

    @OnLifecycleEvent(ON_DESTROY)
    void onDestory(LifecycleOwner owner);

    @OnLifecycleEvent(ON_ANY)
    void onAny(LifecycleOwner owner, Lifecycle.Event event);
}
