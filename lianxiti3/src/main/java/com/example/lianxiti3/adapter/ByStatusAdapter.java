package com.example.lianxiti3.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lianxiti3.R;
import com.example.lianxiti3.bean.ByStatus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ByStatusAdapter extends RecyclerView.Adapter<ByStatusAdapter.MyHolder> {

    private Context context;
    private List<ByStatus.OrderListBean> listBeans;

    public ByStatusAdapter(Context context) {
        this.context = context;
        listBeans = new ArrayList<>();
    }

    //赋值的方法
    public void setListBeans(List<ByStatus.OrderListBean> listBeans) {
        if (listBeans != null) {
            this.listBeans = listBeans;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.bystatus_item, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        if (listBeans!=null&&listBeans.size()>0){
            myHolder.numbername.setText(listBeans.get(i).getOrderId());

            myHolder.staRv.setAdapter(new ByShowAdapter(context,listBeans.get(i).getDetailList()));
        }
    }

    @Override
    public int getItemCount() {
        return listBeans.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.number)
        TextView number;
        @BindView(R.id.numbername)
        TextView numbername;
        @BindView(R.id.data_time)
        TextView dataTime;
        @BindView(R.id.sta_rv)
        RecyclerView staRv;
        @BindView(R.id.price)
        TextView price;
        @BindView(R.id.cancle)
        Button cancle;
        @BindView(R.id.payment)
        Button payment;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            staRv.setLayoutManager(new LinearLayoutManager(context));
        }
    }
}
