package com.tjwogns.presentation.normal

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.model.BreedViewType
import com.tjwogns.presentation.R
import com.tjwogns.presentation.base.BaseRecyclerViewAdapter
import com.tjwogns.presentation.base.BaseViewHolder
import com.tjwogns.presentation.databinding.ItemNormalBreedDetailLayoutBinding
import com.tjwogns.presentation.databinding.ItemNormalBreedLayoutBinding
import com.tjwogns.presentation.helper.UiHelper

class NormalBreedAdapter(context: Context)
    : BaseRecyclerViewAdapter<BreedSnippet, BaseViewHolder<BreedSnippet, *>>() {

    init {
        this.onItemClickListener = object: OnItemClickListener<BreedSnippet> {
            override fun onItemClick(data: BreedSnippet, position: Int, view: View) {
                data.changeViewType()

                // add flip animation
                val flipAnimator = UiHelper.flipView(context, view)

                view.postDelayed({
                    notifyItemChanged(position)
                },500)

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
        : BaseViewHolder<BreedSnippet, ItemNormalBreedLayoutBinding>(parent,
        R.layout.item_normal_breed_layout
    ) {

        override fun bind(data: BreedSnippet) {
            binding.vh = this
            binding.breed = data.breed
            binding.executePendingBindings()
        }

    }

    class BreedDetailViewHolder(parent: ViewGroup)
        : BaseViewHolder<BreedSnippet, ItemNormalBreedDetailLayoutBinding>(parent,
        R.layout.item_normal_breed_detail_layout
    ) {

        override fun bind(data: BreedSnippet) {
            binding.vh = this
            binding.breed = data.breed
            binding.executePendingBindings()
        }
    }
}
