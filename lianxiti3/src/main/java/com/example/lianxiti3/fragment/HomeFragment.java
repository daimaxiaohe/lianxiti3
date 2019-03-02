package com.example.lianxiti3.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lianxiti3.R;
import com.example.lianxiti3.activity.BylistActivity;
import com.example.lianxiti3.activity.XqActivity;
import com.example.lianxiti3.adapter.ShowCarAdapter;
import com.example.lianxiti3.api.ShowApi;
import com.example.lianxiti3.bean.ShowCarBean;
import com.example.lianxiti3.mvp.contract.IContract;
import com.example.lianxiti3.mvp.presenter.ShowPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class HomeFragment extends Fragment implements IContract.View, ShowCarAdapter.OnItemClick, CompoundButton.OnCheckedChangeListener {
    @BindView(R.id.rv)
    RecyclerView recyclerView;
    @BindView(R.id.check)
    CheckBox check;
    @BindView(R.id.price)
    TextView price;
    @BindView(R.id.selment)
    Button selment;

    private Unbinder bind;
    private ShowPresenter showPresenter;
    private ShowCarAdapter showCarAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, container, false);
        bind = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initData();
    }

    /**
     * 操作视图
     *
     * @param view
     */
    private void initView(View view) {
        showPresenter = new ShowPresenter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        showCarAdapter = new ShowCarAdapter(getActivity());
        showCarAdapter.setOnItemClick(this);
        recyclerView.setAdapter(showCarAdapter);
        check.setOnCheckedChangeListener(this);
        selment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), BylistActivity.class));
            }
        });
    }

    /**
     * 操作数据
     */
    private void initData() {
        showPresenter.showcar(ShowApi.SHOWCAR_API);
    }

    /**
     * c成功的方法
     *
     * @param object
     */
    @Override
    public void success(Object object) {
        if (object!=null){
            ShowCarBean showCarBean = (ShowCarBean) object;
            showCarAdapter.setList(showCarBean.getResult());
        }
    }

    /**
     * 失败的方法
     *
     * @param error
     */
    @Override
    public void fail(String error) {
        if (error!=null){
            Log.i("hpp",error+"");
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (bind != null) {
            bind.unbind();
            bind = null;
        }
    }

    /**
     * 条目点击事件
     * @param id
     */
    @Override
    public void Onclick(String id) {
        Intent intent = new Intent(getActivity(), XqActivity.class);
        intent.putExtra("id",id);
        startActivity(intent);
    }

    /**
     * 全选反选  计算总价
     * @param buttonView
     * @param isChecked
     */
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        double listprice = showCarAdapter.setprice(isChecked);
        price.setText("￥："+listprice+"");
    }
}
