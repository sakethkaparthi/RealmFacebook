package com.example.saketh.realmbase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saketh on 21-01-2017.
 */

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private ArrayList<String> headerList, footerList;
    private Context mContext;

    public RecyclerAdapter(ArrayList<String> headerList, ArrayList<String> footerList, Context mContext) {
        this.headerList = headerList;
        this.footerList = footerList;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.infoTextView.setText(headerList.get(position));
        holder.subTextView.setText(footerList.get(position));
    }

    @Override
    public int getItemCount() {
        return headerList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView infoTextView, subTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            infoTextView = (TextView) itemView.findViewById(R.id.info_text);
            subTextView = (TextView) itemView.findViewById(R.id.sub_text);
        }
    }
}
