package com.example.scrollleftdelete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AreaInfoAdapter extends RecyclerView.Adapter<AreaInfoAdapter.ViewHolder> {
    private Context mContext;
    private List<String> mList;
    public AreaInfoAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }
    @Override
    public void onBindViewHolder(@NonNull AreaInfoAdapter.ViewHolder holder, int position) {
//        holder.itemChooseNumber.setText(mList.get(position));

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @NonNull
    @Override
    public AreaInfoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AreaInfoAdapter.ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_list_app, parent, false));
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        private View viewBackground;
        private TextView itemChooseNumber;
        private TextView itemAreaInfo;


        private ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
