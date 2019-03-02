package com.example.lianxiti3.fragment.tabfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lianxiti3.R;
import com.example.lianxiti3.api.ShowApi;
import com.example.lianxiti3.mvp.contract.IContract;
import com.example.lianxiti3.mvp.presenter.ShowPresenter;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabOneFragment extends Fragment implements IContract.View {
    @BindView(R.id.rv)
    RecyclerView recyclerView;

    private ShowPresenter showPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tabone,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
        initView(view);
        initData();
    }
    /**
     *操作视图
     * @param view
     */
    private void initView(View view) {
        showPresenter = new ShowPresenter(this);
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("status","0");
        map.put("page","1");
        map.put("count","5");
        showPresenter.bystatus(ShowApi.ORDERLIST_API,map);
    }

    /**
     * 操作数据
     */
    private void initData() {

    }
    //成功
    @Override
    public void success(Object object) {
        if (object!=null){

        }
    }

    @Override
    public void fail(String error) {
        if (error!=null){

        }
    }
}
