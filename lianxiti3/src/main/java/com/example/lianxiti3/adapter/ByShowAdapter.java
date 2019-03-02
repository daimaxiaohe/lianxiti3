package com.example.lianxiti3.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lianxiti3.R;
import com.example.lianxiti3.bean.ByStatus;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ByShowAdapter extends RecyclerView.Adapter<ByShowAdapter.MyHolder> {

    private Context context;
    private List<ByStatus.OrderListBean.DetailListBean> list;

    public ByShowAdapter(Context context, List<ByStatus.OrderListBean.DetailListBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.byshow_item, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        if (list.size()>0){
            String[] split = list.get(i).getCommodityPic().split(",");
            myHolder.img.setImageURI(split[0]);
            myHolder.name.setText(list.get(i).getCommodityName());
            myHolder.num.setText(list.get(0).getCommodityCount());
        }
    }

    @Override
    public int getItemCount() {
        return list != null ? 0 : list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img)
        SimpleDraweeView img;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.price)
        TextView price;
        @BindView(R.id.add)
        TextView add;
        @BindView(R.id.num)
        TextView num;
        @BindView(R.id.duce)
        TextView duce;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
