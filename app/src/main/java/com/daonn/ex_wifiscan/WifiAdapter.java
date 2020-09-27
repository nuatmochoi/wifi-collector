package com.daonn.ex_wifiscan;

import android.view.LayoutInflater;
import android.net.wifi.ScanResult;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.nuardor.wificollector.R;
import org.nuardor.wificollector.WifiData;

import java.util.List;


public class WifiAdapter extends RecyclerView.Adapter<WifiAdapter.MyViewHolder> {

    private List<ScanResult> items;

    public WifiAdapter(List<ScanResult> items){
        this.items=items;
    }



    @NonNull
    @Override
    public WifiAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.wifi_item , parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        ScanResult item=items.get(position);
        holder.setItem(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvWifiName;
        public TextView tvBSSID;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvWifiName=itemView.findViewById(R.id.tv_wifiName);
            tvBSSID=itemView.findViewById(R.id.tv_BSSID);

        }
        public void setItem(ScanResult item){

            tvWifiName.setText(item.SSID);
            tvBSSID.setText(item.BSSID);

        }
    }
}