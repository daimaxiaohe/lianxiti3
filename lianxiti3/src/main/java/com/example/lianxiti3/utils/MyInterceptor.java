package com.example.lianxiti3.utils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class MyInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder builder = request.newBuilder();
        Request builder1 = builder.addHeader("userId", "105").addHeader("sessionId", "1551490125350105").build();
        Response response = chain.proceed(builder1);
        return response;
    }
}
