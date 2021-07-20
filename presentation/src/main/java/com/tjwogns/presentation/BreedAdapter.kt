package com.tjwogns.presentation

import android.view.ViewGroup
import com.tjwogns.domain.model.Breed
import com.tjwogns.presentation.base.BaseRecyclerViewAdapter
import com.tjwogns.presentation.base.BaseViewHolder
import com.tjwogns.presentation.databinding.ItemBreedLayoutBinding

class BreedAdapter(): BaseRecyclerViewAdapter<Breed, BreedAdapter.BreedViewHolder>() {

    override fun getItemId(position: Int): Long {
        return items[position].hashCode().toLong()
    }
    override fun getViewHolder(parent: ViewGroup, viewType: Int): BreedViewHolder {
        return BreedViewHolder(parent)
    }

    fun setItems(items: List<Breed>) {
        this.items.clear()
        this.items.addAll(items)

        notifyDataSetChanged()
    }

    class BreedViewHolder(parent: ViewGroup)
        : BaseViewHolder<Breed, ItemBreedLayoutBinding>(parent, R.layout.item_breed_layout) {

        override fun bind(data: Breed) {
            binding.vh = this
            binding.breed = data
            binding.executePendingBindings()
        }

    }

}
