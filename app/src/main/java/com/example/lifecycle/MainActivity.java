package com.example.lifecycle;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends RxAppCompatActivity {

    private IPresenter mPersenter;
    private MainViewModel mViewModel;

    @Override
    @SuppressLint("CheckResult")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPersenter = new MainPresenter();
        getLifecycle().addObserver(mPersenter);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mViewModel.getLiveData().observe(this, new Observer() {
            @Override
            public void onChanged(@Nullable Object o) {

            }
        });

        Observable.just("1")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnDispose(new Action() {
                    @Override
                    public void run() throws Exception {

                    }
                })
                .compose(this.<String>bindToLifecycle())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {

                    }
                });

        Intent intent = new Intent();
        intent.setAction("com.example.lifecycle.RemoteService");
        intent.setPackage("com.example.lifecycle");
        bindService(intent, mConnection, BIND_AUTO_CREATE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private IMyAidlInterface2 myAidlInterface2;

    //创建连接
    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //获取远程服务Binder的代理
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };
}
