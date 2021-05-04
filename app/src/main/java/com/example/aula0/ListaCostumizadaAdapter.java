package com.example.aula0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaCostumizadaAdapter extends BaseAdapter {

    List<String> ListaNomes;
    LayoutInflater inflater;

    public ListaCostumizadaAdapter(Context contexto, List<String> ListaNomes) {
        this.ListaNomes = ListaNomes;
        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return ListaNomes.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaNomes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        String nome = ListaNomes.get(position);
        ViewHolder holder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.lista_customizada_row, null );
            holder = new ViewHolder();
            holder.imgPerfil = (ImageView)convertView.findViewById(R.id.imgPerfil);
            holder.txvNome= (TextView)convertView.findViewById(R.id.txvNome);
            holder.txvCodigo = (TextView) convertView.findViewById(R.id.txvCodigo);
            holder.btnExcluir = (Button) convertView.findViewById(R.id.btnExcluir);

            convertView.setTag(holder);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.txvNome.setText(nome);
        holder.txvCodigo.setText(String.valueOf(position+ 1) );
        holder.btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListaNomes.remove(position);
                ListaCustomizada.adapter.notifyDataSetChanged();
            }
        });

        return convertView;


    }


    static class ViewHolder{
    ImageView imgPerfil;
    TextView txvNome;
    TextView txvCodigo;
    Button btnExcluir;

    }
}
