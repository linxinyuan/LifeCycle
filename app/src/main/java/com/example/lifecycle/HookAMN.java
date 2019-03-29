package com.example.lifecycle;

/**
 * Author : Create by Linxinyuan on 2019/03/29
 * Email : linxinyuan@lizhi.fm
 * Desc : android dev
 */
public class HookAMN {
    public static void hookActivityManagerServer() {
        try {
            //获取getDefault静态字段
            Object gD = RefInvoke.getStaticFieldObject("android.app.ActivityManagerNative", "gDefault");
            //获取实例类字段
            Object rawIActivityManager = RefInvoke.getFieldObject("android.util.Singleton", gD, "mInstance");
            //设置动态代理
            Class<?> 
        }catch (Exception e){

        }
    }
}
