package com.tjwogns.presentation

import android.animation.Animator
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.ViewGroup
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.model.BreedViewType
import com.tjwogns.presentation.base.BaseRecyclerViewAdapter
import com.tjwogns.presentation.base.BaseViewHolder
import com.tjwogns.presentation.databinding.ItemBreedDetailLayoutBinding
import com.tjwogns.presentation.databinding.ItemBreedLayoutBinding
import com.tjwogns.presentation.helper.UiHelper

class BreedAdapter(context: Context)
    : BaseRecyclerViewAdapter<BreedSnippet, BaseViewHolder<BreedSnippet, *>>() {

    init {
        this.onItemClickListener = object: OnItemClickListener<BreedSnippet> {
            override fun onItemClick(data: BreedSnippet, position: Int, view: View) {
                data.changeViewType()

                // add flip animation
                val flipAnimator = UiHelper.flipView(context, view)

                view.postDelayed({
                    notifyItemChanged(position)
                },1000)

                flipAnimator.start()
            }
        }
    }

    override fun getItemId(position: Int): Long {
        return items[position].hashCode().toLong()
    }
    override fun getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<BreedSnippet, *> {
        return when(viewType) {
            BreedViewType.NORMAL.type -> BreedViewHolder(parent)
            BreedViewType.DETAIL.type -> BreedDetailViewHolder(parent)
            else -> BreedViewHolder(parent)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].viewType.type
    }

    fun setItems(items: List<BreedSnippet>) {
        this.items.clear()
        this.items.addAll(items)

        notifyDataSetChanged()
    }

    class BreedViewHolder(parent: ViewGroup)
        : BaseViewHolder<BreedSnippet, ItemBreedLayoutBinding>(parent, R.layout.item_breed_layout) {

        override fun bind(data: BreedSnippet) {
            binding.vh = this
            binding.breed = data.breed
            binding.executePendingBindings()
        }

    }

    class BreedDetailViewHolder(parent: ViewGroup)
        : BaseViewHolder<BreedSnippet, ItemBreedDetailLayoutBinding>(parent, R.layout.item_breed_detail_layout) {

        override fun bind(data: BreedSnippet) {
            binding.vh = this
            binding.breed = data.breed
            binding.executePendingBindings()
        }
    }
}
