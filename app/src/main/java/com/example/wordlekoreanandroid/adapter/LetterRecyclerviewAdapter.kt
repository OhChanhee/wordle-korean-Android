package com.example.wordlekoreanandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wordlekoreanandroid.R

class LetterRecyclerviewAdapter : RecyclerView.Adapter<LetterRecyclerviewAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.letter_item,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }

    class Holder(itemView: View): RecyclerView.ViewHolder(itemView){

    }
}