package com.example.lianxiti3.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lianxiti3.R;
import com.example.lianxiti3.activity.Main2Activity;
import com.example.lianxiti3.adapter.ByStatusAdapter;
import com.example.lianxiti3.adapter.TabAdapter;
import com.example.lianxiti3.api.ShowApi;
import com.example.lianxiti3.bean.ByStatus;
import com.example.lianxiti3.mvp.contract.IContract;
import com.example.lianxiti3.mvp.presenter.ShowPresenter;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class HomeTwoFragment extends Fragment implements IContract.View {
    /*@BindView(R.id.tab)
    TabLayout tabLayout;
    @BindView(R.id.viewpage)
    ViewPager viewPager;*/
    @BindView(R.id.rv)
    RecyclerView recyclerView;
    private Unbinder bind;
    private TabAdapter tabAdapter;
    private ShowPresenter showPresenter;
    private ByStatusAdapter byStatusAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hometwo,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bind = ButterKnife.bind(this, view);
        initView(view);
        initData();
    }
    /**
     *操作视图
     * @param view
     */
    private void initView(View view) {
        /*tabAdapter = new TabAdapter(((Main2Activity)getActivity()).getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);*/
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        byStatusAdapter = new ByStatusAdapter(getActivity());
        recyclerView.setAdapter(byStatusAdapter);
        showPresenter = new ShowPresenter(this);
        HashMap<String,String> map = new HashMap<>();
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

    //销毁

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (bind!=null){
            bind.unbind();
        }
    }

    @Override
    public void success(Object object) {
        if (object!=null){
            ByStatus byStatus = (ByStatus) object;
            byStatusAdapter.setListBeans(byStatus.getOrderList());
        }
    }

    @Override
    public void fail(String error) {
        if (error!=null){

        }
    }
}
