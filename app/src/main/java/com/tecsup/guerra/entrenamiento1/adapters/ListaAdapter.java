package com.tecsup.guerra.entrenamiento1.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.tecsup.guerra.entrenamiento1.R;
import com.tecsup.guerra.entrenamiento1.models.Lista;
import java.util.List;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ViewHolder>{

    private List<Lista> lista;

    public void setLista(List<Lista> lista) {
        this.lista = lista;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pictureImage1;
        TextView nombre1;
        TextView direccion1;
        TextView lugar1;
        TextView telefono1;


        public ViewHolder(View itemView) {
            super(itemView);
            pictureImage1=itemView.findViewById(R.id.picture_image);
            nombre1=itemView.findViewById(R.id.nombre);
            direccion1=itemView.findViewById(R.id.direccion);
            lugar1=itemView.findViewById(R.id.lugar);
            telefono1=itemView.findViewById(R.id.telefono);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false);
        ViewHolder viewHolder=new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       Lista listar=lista.get(position);

        holder.nombre1.setText(listar.getNombre());
        holder.direccion1.setText(listar.getDireccion());
        holder.lugar1.setText(listar.getLugar());
        holder.telefono1.setText(String.valueOf(listar.getTelefono()));


       int resID=holder.itemView.getContext().getResources().getIdentifier(listar.getPicture(),"drawable",holder.itemView.getContext().getPackageName());
       holder.pictureImage1.setImageResource(resID);
       //holder.pictureImage.setImageResource(R.drawable.gatonegro);// esto seria no dinamico
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


}
