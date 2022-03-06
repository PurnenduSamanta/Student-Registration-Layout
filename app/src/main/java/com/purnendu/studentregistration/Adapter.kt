package com.purnendu.studentregistration


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(private val c: Context, private val subjectName: ArrayList<String>) :
    RecyclerView.Adapter<Adapter.MyBookmarkHolder>() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(this.c)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyBookmarkHolder {
        val myView: View = layoutInflater.inflate(R.layout.single_card_view, parent, false)
        return MyBookmarkHolder(myView)
    }

    override fun onBindViewHolder(holder: MyBookmarkHolder, position: Int) {

        holder.subject.text=subjectName[position]
    }

    override fun getItemCount(): Int {
        return subjectName.size
    }

    class MyBookmarkHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var subject: TextView = itemView.findViewById(R.id.subjectName)


    }

}