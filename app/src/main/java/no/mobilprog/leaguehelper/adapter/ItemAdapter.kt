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
import no.mobilprog.leaguehelper.model.Item

class ItemAdapter (
    private val items: List<Item>,
    private val clickListener: View.OnClickListener
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)

        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = items[position]

        holder.bind(currentItem, clickListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val itemImageView: ImageView = view.findViewById(R.id.items_image)

        fun bind(item: Item, clickListener: View.OnClickListener) {
            // Fills the views with the given data

            itemImageView.contentDescription = item.itemName
            itemImageView.setImageResource(item.itemImage)

            // Sets the onClickListener
            itemView.setOnClickListener(clickListener)
        }
    }
}