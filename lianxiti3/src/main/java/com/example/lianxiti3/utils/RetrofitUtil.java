package com.example.lianxiti3.utils;

import com.example.lianxiti3.api.ShowApi;
import com.example.lianxiti3.api.ShowApiService;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {
    private static volatile RetrofitUtil instance;
    private final Retrofit retrofit;

    private RetrofitUtil(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                //设置拦截器
                .addInterceptor(new MyInterceptor())
                .addNetworkInterceptor(new MyInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(ShowApi.BASE_API)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }
    public static RetrofitUtil getInstance(){
        if (instance==null){
            synchronized (RetrofitUtil.class){
                if (instance==null){
                    instance = new RetrofitUtil();
                }
            }
        }
        return instance;
    }

    public ShowApiService getservice(){
        return retrofit.create(ShowApiService.class);
    }
}
