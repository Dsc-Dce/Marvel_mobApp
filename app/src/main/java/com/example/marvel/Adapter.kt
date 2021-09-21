package com.example.marvel

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card.view.*

class Adapter(val context: Context, val items:ArrayList<AllDataClass>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    //for inflating desired view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.card,parent,false))
    }
    //populating elements
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int){
        var item=items[position]
        holder.c.tv_L1.text=item.L1
        holder.c.tv_L2.text=item.L2
        holder.c.tv_L3.text = item.L3
        holder.c.iv_img.setImageResource(item.img)
        //button to go to the link
        holder.c.bt_KM.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse(item.L4))
            startActivity(context,i,null)
        }
    }

    class ViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        var c=view.card
    }

    override fun getItemCount(): Int {
        return items.size
    }
}