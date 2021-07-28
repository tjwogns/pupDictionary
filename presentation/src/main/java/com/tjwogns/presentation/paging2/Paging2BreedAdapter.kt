package com.tjwogns.presentation.paging2

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.tjwogns.domain.model.BreedSnippet
import com.tjwogns.domain.model.BreedViewType
import com.tjwogns.presentation.R
import com.tjwogns.presentation.base.BasePagedListAdapter
import com.tjwogns.presentation.base.BaseViewHolder
import com.tjwogns.presentation.databinding.ItemPaging2BreedDetailLayoutBinding
import com.tjwogns.presentation.databinding.ItemPaging2BreedLayoutBinding
import com.tjwogns.presentation.helper.UiHelper
import com.tjwogns.presentation.normal.NormalBreedAdapter

class Paging2BreedAdapter(context: Context) : BasePagedListAdapter<BreedSnippet, BaseViewHolder<BreedSnippet, *>>(DiffCallback){

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
            BreedViewType.NORMAL.type -> NormalBreedAdapter.BreedViewHolder(parent)
            BreedViewType.DETAIL.type -> NormalBreedAdapter.BreedDetailViewHolder(parent)
            else -> NormalBreedAdapter.BreedViewHolder(parent)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].viewType.type
    }

    class BreedViewHolder(parent: ViewGroup)
        : BaseViewHolder<BreedSnippet, ItemPaging2BreedLayoutBinding>(parent,
        R.layout.item_paging2_breed_layout
    ) {

        override fun bind(data: BreedSnippet) {
            binding.vh = this
            binding.breed = data.breed
            binding.executePendingBindings()
        }

    }

    class BreedDetailViewHolder(parent: ViewGroup)
        : BaseViewHolder<BreedSnippet, ItemPaging2BreedDetailLayoutBinding>(parent,
        R.layout.item_paging2_breed_detail_layout
    ) {

        override fun bind(data: BreedSnippet) {
            binding.vh = this
            binding.breed = data.breed
            binding.executePendingBindings()
        }
    }

    companion object {
        val DiffCallback = object : DiffUtil.ItemCallback<BreedSnippet>() {
            override fun areContentsTheSame(oldItem: BreedSnippet, newItem: BreedSnippet): Boolean {
                if (oldItem.breed.id != newItem.breed.id) return false
                return true
            }

            override fun areItemsTheSame(oldItem: BreedSnippet, newItem: BreedSnippet): Boolean {
                return oldItem.breed.id == newItem.breed.id
            }
        }
    }


}