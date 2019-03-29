package com.example.lifecycle;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * Author : Create by Linxinyuan on 2019/03/25
 * Email : linxinyuan@lizhi.fm
 * Desc : android dev
 */
public class MainViewModel extends ViewModel {
    MutableLiveData<String> mLiveData = new MutableLiveData<>();

    public void setLiveData(MutableLiveData l){
        this.mLiveData = l;
    }

    public MutableLiveData getLiveData(){
        return mLiveData;
    }
}
