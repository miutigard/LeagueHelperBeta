package no.mobilprog.leaguehelper.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.R
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

    private val limit: Int = 6

    override fun getItemCount(): Int {
        return if (items.size > limit) 6 else items.size
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val itemImageView: ImageView = view.findViewById(R.id.items_image)

        fun bind(item: Item, clickListener: View.OnClickListener) {

            itemImageView.contentDescription = item.itemName
            itemImageView.setImageResource(item.itemImage)

            itemView.setOnClickListener(clickListener)
        }
    }
}