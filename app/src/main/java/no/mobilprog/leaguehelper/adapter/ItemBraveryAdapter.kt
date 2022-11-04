package no.mobilprog.leaguehelper.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.R
import no.mobilprog.leaguehelper.model.Item

class ItemBraveryAdapter (
    private val items: List<Item>,
    private val clickListener: View.OnClickListener
) : RecyclerView.Adapter<ItemBraveryAdapter.ItemBraveryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemBraveryViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)

        return ItemBraveryViewHolder(itemView)
    }

    private val itemsListRandomized = items.shuffled()

    override fun onBindViewHolder(holder: ItemBraveryViewHolder, position: Int) {
        val randomItem = itemsListRandomized[position]

        holder.bind(randomItem, clickListener)
    }

    private val limit: Int = 6

    override fun getItemCount(): Int {
        return if (items.size > limit) 6 else items.size
    }

    class ItemBraveryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
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