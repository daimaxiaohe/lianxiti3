package com.example.lianxiti3.mvp.presenter;

import com.example.lianxiti3.mvp.contract.IContract;
import com.example.lianxiti3.mvp.model.ShowModel;
import com.example.lianxiti3.utils.RetrofitCallBack;

import java.util.HashMap;

public class ShowPresenter extends IContract.IPresenter {
    private IContract.View view;
    private ShowModel showModel;

    public ShowPresenter(IContract.View view) {
        this.view = view;
        showModel = new ShowModel();
    }

    @Override
    public void showcar(String uri) {
        if (showModel!=null){
            showModel.showcar(uri, new RetrofitCallBack() {
                @Override
                public void success(Object object) {
                    if (view!=null){
                        view.success(object);
                    }
                }

                @Override
                public void fail(String error) {
                    if (view!=null){
                        view.fail(error);
                    }
                }
            });
        }
    }

    /**
     * 详情页
     * @param uri
     * @param map
     */
    @Override
    public void showweb(String uri, HashMap<String, String> map) {
        if (showModel!=null){
            showModel.showweb(uri, map, new RetrofitCallBack() {
                @Override
                public void success(Object object) {
                    if (view!=null){
                        view.success(object);
                    }
                }

                @Override
                public void fail(String error) {
                    if (view!=null){
                        view.fail(error);
                    }
                }
            });
        }
    }

    /**
     * 查询订单
     * @param uri
     * @param map
     */
    @Override
    public void bystatus(String uri, HashMap<String, String> map) {
            if (showModel!=null){
                showModel.bystatus(uri, map, new RetrofitCallBack() {
                    @Override
                    public void success(Object object) {
                        if (view!=null){
                            view.success(object);
                        }
                    }

                    @Override
                    public void fail(String error) {
                        if (view!=null){
                            view.fail(error);
                        }
                    }
                });
            }
    }
}
