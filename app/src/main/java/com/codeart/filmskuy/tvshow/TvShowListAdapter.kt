package com.codeart.filmskuy.tvshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codeart.filmskuy.R
import com.codeart.filmskuy.core.domain.model.TvShowModel
import com.codeart.filmskuy.core.utils.IMAGE_URL_BASE_PATH
import com.codeart.filmskuy.databinding.ItemListCatalogueBinding
import java.util.ArrayList

/**
 * Created by wahyu_septiadi on 17, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class TvShowListAdapter : RecyclerView.Adapter<TvShowListAdapter.ListViewHolder>() {

    private var listData = ArrayList<TvShowModel>()
    var onItemClick: ((TvShowModel) -> Unit)? = null

    fun setData(newListData: List<TvShowModel>?) {
        if (newListData == null) return
        listData.clear()
        listData.addAll(newListData)
        notifyDataSetChanged()
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemListCatalogueBinding.bind(itemView)
        fun bind(data: TvShowModel) {
            with(binding) {
                val imageSize = itemView.context.getString(R.string.size_url_image_list)
                val urlImage = "$IMAGE_URL_BASE_PATH$imageSize${data.posterPath}"
                Glide.with(itemView.context)
                    .load(urlImage)
                    .placeholder(R.drawable.loading)
                    .into(imageFilm)
                ratingFilm.text = data.voteAverage.toString()
                titleFilm.text = data.name
                yearFilm.text = data.firstAirDate
            }
        }

        init {
            binding.root.setOnClickListener {
                onItemClick?.invoke(listData[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_catalogue, parent, false)
        )

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount() = listData.size
}