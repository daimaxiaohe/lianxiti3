package com.example.lianxiti3.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lianxiti3.R;
import com.example.lianxiti3.bean.ShowCarBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowCarAdapter extends RecyclerView.Adapter<ShowCarAdapter.MyHolder> {
    private Context context;
    private List<ShowCarBean.ResultBean> list;

    public ShowCarAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();
    }

    //赋值的方法
    public void setList(List<ShowCarBean.ResultBean> list) {
        if (list!=null) {
            this.list = list;
        }
        notifyDataSetChanged();
    }
    private double price=0.0;
    //全选  反选
    public double setprice(boolean ischeck){
        price=0.0;
        for (ShowCarBean.ResultBean resultBean : list) {
            resultBean.setBtncheck(ischeck);
            if (resultBean.isBtncheck()){
                price += resultBean.getPrice()*resultBean.getCount();
            }
        }
        notifyDataSetChanged();
        return price;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.showcar_item, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {
        if (list!=null&&list.size()>0){
            myHolder.img.setImageURI(list.get(i).getPic());
            myHolder.num.setText(list.get(i).getCount()+"");
            myHolder.price.setText(list.get(i).getPrice()+"");
            myHolder.checkbtn.setChecked(list.get(i).isBtncheck());
            myHolder.name.setText(list.get(i).getCommodityName());
            //详情页面
            myHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClick!=null){
                        onItemClick.Onclick(list.get(i).getCommodityId());
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
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
        @BindView(R.id.checkbtn)
        CheckBox checkbtn;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
    //接口
    public interface OnItemClick{
        void Onclick(String id);
    }
    public OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }
}
