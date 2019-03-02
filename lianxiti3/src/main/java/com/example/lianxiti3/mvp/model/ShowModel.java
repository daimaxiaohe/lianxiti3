package com.example.lianxiti3.mvp.model;

import android.annotation.SuppressLint;

import com.example.lianxiti3.bean.ByStatus;
import com.example.lianxiti3.bean.ShowCarBean;
import com.example.lianxiti3.bean.XqBean;
import com.example.lianxiti3.mvp.contract.IContract;
import com.example.lianxiti3.utils.RetrofitCallBack;
import com.example.lianxiti3.utils.RetrofitUtil;

import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class ShowModel implements IContract.IModle {

    @SuppressLint("CheckResult")
    @Override
    public void showcar(String uri, final RetrofitCallBack callBack) {
        RetrofitUtil.getInstance().getservice()
                .showcar(uri)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ShowCarBean>() {
                    @Override
                    public void accept(ShowCarBean showCarBean) throws Exception {
                            if (callBack!=null){
                                callBack.success(showCarBean);
                            }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (callBack!=null){
                            callBack.fail(throwable.getMessage());
                        }
                    }
                });
    }
    /**
     * 详情
     * @param uri
     * @param map
     * @param callBack
     */
    @SuppressLint("CheckResult")
    @Override
    public void showweb(String uri, HashMap<String, String> map, final RetrofitCallBack callBack) {
        RetrofitUtil.getInstance().getservice()
                .showxq(uri,map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<XqBean>() {
                    @Override
                    public void accept(XqBean xqBean) throws Exception {
                        if (callBack!=null){
                            callBack.success(xqBean);
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (callBack!=null){
                            callBack.fail(throwable.getMessage());
                        }
                    }
                });
    }

    /**
     * 查询订单
     * @param uri
     * @param map
     * @param callBack
     */
    @SuppressLint("CheckResult")
    @Override
    public void bystatus(String uri, HashMap<String, String> map, final RetrofitCallBack callBack) {
        RetrofitUtil.getInstance().getservice()
                .bystatus(uri,map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ByStatus>() {
                    @Override
                    public void accept(ByStatus byStatus) throws Exception {
                        if (callBack!=null){
                            callBack.success(byStatus);
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (callBack!=null){
                            callBack.fail(throwable.getMessage());
                        }
                    }
                });
    }
}
