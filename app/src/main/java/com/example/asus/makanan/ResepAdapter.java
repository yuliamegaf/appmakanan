package com.example.asus.makanan;

/**
 * Created by ASUS on 05/10/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by diazauliafahmi on 10/3/17.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepHolder> {

    private Context ctx;
    ArrayList<Resep> dataResep;

    public ResepAdapter(Context ctx, ArrayList<Resep> dataResep) {
        this.ctx = ctx;
        this.dataResep = dataResep;
    }


    @Override
    public ResepHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View resepView = inflater.inflate(R.layout.resep_single, parent, false);
        return new ResepHolder(resepView);

    }

    @Override
    public void onBindViewHolder(ResepHolder holder, int position) {
        holder.txtJudul.setText(dataResep.get(position).getJudul());
        holder.txtSummary.setText(dataResep.get(position).getSummary());
        //holder.txtResep.setText(dataResep.get(position).getResep());
        //holder.txtGambar.setText(dataResep.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return dataResep.size();
    }


    public class ResepHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView txtJudul, txtSummary, txtResep, txtGambar;

        public ResepHolder(View itemView) {
            super(itemView);
            txtJudul    = (TextView) itemView.findViewById(R.id.txt_judul);
            txtSummary  = (TextView) itemView.findViewById(R.id.txt_summary);
            txtResep    = (TextView) itemView.findViewById(R.id.txt_resep);
            //txtSummary  = (TextView) itemView.findViewById(R.id.txt_summary);
            //txtGambar   = (TextView) itemView.findViewById(R.id.txt_gambar);

            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            //passdata(v);
            Intent intent = new Intent(v.getContext(), ResepDetail.class);
            intent.putExtra("txt_gambar", dataResep.get(position).getGambar());
            intent.putExtra("txt_resep", dataResep.get(position).getResep());
            intent.putExtra("txt_judul", dataResep.get(position).getJudul());
            v.getContext().startActivity(intent);
            //Toast.makeText(itemView.getContext(), "Test", Toast.LENGTH_LONG).show();
        }

    }

    /*public void passdata(View v) {
        //Toast.makeText(v.getContext(), "Test", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(v.getContext(), ResepDetail.class);
        intent.putExtra("txt_judul", "Makanan Anjing");
        intent.putExtra("txt_gambar", "adsad");
        intent.putExtra("txt_resep", "ansad,sadsa,sad,sad,,sdas,ad,s");
        v.getContext().startActivity(intent);

    }*/
}
