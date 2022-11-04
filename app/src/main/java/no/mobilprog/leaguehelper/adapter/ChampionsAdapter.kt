package no.mobilprog.leaguehelper.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.R
import no.mobilprog.leaguehelper.model.Champion

class ChampionsAdapter (
    private val items: List<Champion>,
    private val clickListener: View.OnClickListener
) : RecyclerView.Adapter<ChampionsAdapter.ChampionsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_champions, parent, false)

        return ChampionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChampionsViewHolder, position: Int) {
        val currentChampion = items[position]

        holder.bind(currentChampion, clickListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ChampionsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val championNameView: TextView = view.findViewById(R.id.champions_title)
        private val championImageView: ImageView = view.findViewById(R.id.champions_image)

        fun bind(item: Champion, clickListener: View.OnClickListener) {
            // Fills the views with the given data
            championImageView.setImageResource(item.championImage)
            championNameView.text = item.championName

            // Sets the onClickListener
            itemView.setOnClickListener(clickListener)
        }
    }
}