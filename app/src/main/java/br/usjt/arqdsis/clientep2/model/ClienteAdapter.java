package br.usjt.arqdsis.clientep2.model;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by arqdsis on 28/09/2016.
 */
public class ClienteAdapter extends BaseAdapter {

    Context context;
    Cliente[] clientes;

    public ClienteAdapter(Activity context, Cliente[] clientes) {
        this.context = context;
        this.clientes = clientes;

    }

    @Override
    public int getCount() { //qtos elementos tem na lista
        return clientes.length;
    }

    @Override
    //traz posicao do cliente
    public Object getItem(int i) {
        if (i >= 0 && i < clientes.length)
            return clientes[i];
        else
            return null;
    }

    @Override
//retorna o id do item
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //retorna view que forma a linha
        return null;
    }
}
