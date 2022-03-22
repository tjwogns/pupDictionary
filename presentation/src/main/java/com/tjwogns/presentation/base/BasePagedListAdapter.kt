package com.tjwogns.presentation.base

import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

abstract class BasePagedListAdapter<D : Any, VH : BaseViewHolder<D, ViewDataBinding>>(private val DF: DiffUtil.ItemCallback<D>) : PagedListAdapter<D, VH>(DF) {

    protected val items = mutableListOf<D>()

    var onItemClickListener: OnItemClickListener<D>? = null

    interface OnItemClickListener<D> {
        fun onItemClick(data: D, position: Int, view: View)
    }

    abstract fun getViewHolder(parent: ViewGroup, viewType: Int): VH

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return getViewHolder(parent, viewType).apply {
            onItemClickListener?.let { listener ->
                itemView.setOnClickListener {
                    listener.onItemClick(getItem(bindingAdapterPosition), bindingAdapterPosition, itemView)
                }
            }
        }
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int  = items.size

    override fun getItem(position: Int): D = items[position]
}