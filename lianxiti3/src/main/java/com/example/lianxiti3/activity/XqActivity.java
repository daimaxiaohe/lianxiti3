package com.example.lianxiti3.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lianxiti3.R;
import com.example.lianxiti3.api.ShowApi;
import com.example.lianxiti3.bean.XqBean;
import com.example.lianxiti3.mvp.contract.IContract;
import com.example.lianxiti3.mvp.presenter.ShowPresenter;
import com.stx.xhb.xbanner.XBanner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class XqActivity extends AppCompatActivity implements IContract.View {
    @BindView(R.id.xbanner)
    XBanner xBanner;
    @BindView(R.id.webview)
    WebView webView;
    private Unbinder bind;
    private ShowPresenter showPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xq);
        bind = ButterKnife.bind(this);
        initView();
        initData();
    }

    /**
     * 操作视图的方法
     */
    private void initView() {
        showPresenter = new ShowPresenter(this);
    }

    /**
     * 操作数据的方法
     */
    private void initData() {
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        HashMap<String,String> map = new HashMap<>();
        map.put("commodityId",id);
        showPresenter.showweb(ShowApi.XQ_API,map);
    }

    /**
     * 成功的方法
     * @param object
     */
    @Override
    public void success(Object object) {
        if (object!=null){
            XqBean xqBean = (XqBean) object;
            final List<String> list = Arrays.asList(xqBean.getResult().getPicture().split(","));
            xBanner.setData(list,null);
            xBanner.setmAdapter(new XBanner.XBannerAdapter() {
                @Override
                public void loadBanner(XBanner banner, Object model, View view, int position) {
                    Glide.with(XqActivity.this).load(list.get(position)).into((ImageView) view);
                }
            });
            webView.loadData(xqBean.getResult().getDetails(),"Text/Html","UTF-8");
        }
    }

    /**
     * 失败
     * @param error
     */
    @Override
    public void fail(String error) {
        if (error!=null){

        }
    }

    /**
     *
     * 销毁的方法
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (bind!=null){
            bind.unbind();
        }
    }
}
