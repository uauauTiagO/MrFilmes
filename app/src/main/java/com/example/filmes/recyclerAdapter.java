/*package com.example.filmes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder>{

    private ArrayList<Historico> historicoList;

    public recyclerAdapter(ArrayList<Historico> historicoList)
    {
        this.historicoList = historicoList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nomeTxT;
        private TextView diaTxT;


        public MyViewHolder(final View view){
            super(view);
            nomeTxT = view.findViewById(R.id.lbnome);
            diaTxT = view.findViewById(R.id.lbDia);

        }
        @NonNull
        @Override
        public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_view2,parent,false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
            String name = historicoList.get(position).getNome();
            int dia = historicoList.get(position).getDia();
            holder.nomeTxT.setText(name);
            holder.diaTxT.setText(String.valueOf(dia));
        }

        @Override
        public int getItemCount() {
            return historicoList.size();
        }
    }
    }*/

