package com.example.lianxiti3.mvp.contract;

import com.example.lianxiti3.utils.RetrofitCallBack;

import java.util.HashMap;

public interface IContract {
    abstract class IPresenter{
        public abstract void showcar(String uri);
        public abstract void showweb(String uri,HashMap<String,String> map);
        public abstract void bystatus(String uri,HashMap<String,String> map);
    }
    //接口
    interface IModle{
        void showcar(String uri, RetrofitCallBack callBack);
        void showweb(String uri,HashMap<String,String> map,RetrofitCallBack callBack);
        void bystatus(String uri,HashMap<String,String> map,RetrofitCallBack callBack);
    }
    //
    interface View{
        void success(Object object);
        void fail(String error);
    }
}
