package com.example.lianxiti3.api;

import com.example.lianxiti3.bean.ByStatus;
import com.example.lianxiti3.bean.ShowCarBean;
import com.example.lianxiti3.bean.XqBean;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ShowApiService {
    //查询购物车
    @GET
    Observable<ShowCarBean> showcar(@Url String uri);
    //详情页面
    @GET
    Observable<XqBean> showxq(@Url String uri,@QueryMap HashMap<String,String> map);
    //查询订单页面
    @GET
    Observable<ByStatus> bystatus(@Url String uri,@QueryMap HashMap<String,String> map);
}
