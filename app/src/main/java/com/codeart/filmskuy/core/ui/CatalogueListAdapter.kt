package com.codeart.filmskuy.core.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codeart.filmskuy.R
import com.codeart.filmskuy.core.domain.model.CatalogueModel
import com.codeart.filmskuy.core.utils.IMAGE_URL_BASE_PATH
import com.codeart.filmskuy.databinding.ItemListCatalogueBinding
import java.util.ArrayList

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class CatalogueListAdapter : RecyclerView.Adapter<CatalogueListAdapter.ListViewHolder>(){

    private var listData = ArrayList<CatalogueModel>()
    var onItemClick: ((CatalogueModel) -> Unit)? = null

    fun setData(newListData: List<CatalogueModel>?) {
        if (newListData == null) return
        listData.clear()
        listData.addAll(newListData)
        notifyDataSetChanged()
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemListCatalogueBinding.bind(itemView)
        fun bind(data: CatalogueModel) {
            with(binding) {
                val imageSize = itemView.context.getString(R.string.size_url_image_list)
                val urlImage = "$IMAGE_URL_BASE_PATH$imageSize${data.posterPath}"
                Glide.with(itemView.context)
                    .load(urlImage)
                    .placeholder(R.drawable.loading)
                    .into(imageFilm)
                ratingFilm.text = data.voteAverage.toString()
                titleFilm.text = data.entry
                yearFilm.text = data.date
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_catalogue, parent, false))

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount() = listData.size
}