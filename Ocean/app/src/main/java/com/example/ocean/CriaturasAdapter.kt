package com.example.ocean

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CriaturasAdapter (
    private val itens: List<Criatura>
        ) : RecyclerView.Adapter<CriaturasAdapter.ViewHolder>(){

            class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
                fun bindView(item: Criatura){
                    val tvNome = itemView.findViewById<TextView>(R.id.tvNome);
//                    val ivCriatura = itemView.findViewById<ImageView>(R.id)
                }
            }
        }
}