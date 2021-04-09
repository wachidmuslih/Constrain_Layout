package com.example.constrainlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //Deklarasi variabel dengan jenis data context
    Context mContext;
    //Deklarasi variabel dengan jenis data Layout inflater

    LayoutInflater inflater;
    //Deklarasi variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arraylist;

    public ListViewAdapter(Home_Activity home_activity) {

    }

    @Override
    //Fungsi getCount () mengembalikan jumlah item yang akan ditampilkan dalam List
    public int getCount() {
        //mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }

    //Fungsi ini digunakan untuk mendapatkan data item yang terkait dengan posisi
    // tertentu dalam kumpulan data untuk mendapatkan data yang sesuai dari Lokasi
    // tertentu dalam pengumpulan data item.
    @Override
    public Object getItem(int i) {
        //mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }
    //Fungsi mengembalikan "nilai" dari posisi item ke adaptor.
    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //deklarasi variabel dengan jenis data ViewHolder
        final ViewHolder holder;

        //Membuat kondisi apakah view null atau tidak
        if (view == null)
        {
            //membuat objek view holder
            holder = new ViewHolder ();

            //Mengatur Layout untuk menampilkan item
            view = inflater.inflate(R.layout.item_listview, null);
        }
        else
        {
            //mengatur holder untuk mengembalikan nilai dari view tag.
            holder = (ViewHolder)view.getTag();
        }
        // set item ke TextViews
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());
        //mengembalikan nilai ke variabel view
        return view;
    }
}

//Membuat class untuk mendeklarasikan tempat untuk meletakkon isi kedolom Listview
class ViewHolder{
    //Membuat class untuk mendeklarasikan tempat untuk meletakkon isi kedolom Listview
    TextView name;
}