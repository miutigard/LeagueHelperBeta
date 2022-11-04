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
    private val context: Context,
    private val dataset: List<Champion>
) : RecyclerView.Adapter<ChampionsAdapter.ChampionsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampionsViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_champions, parent, false)

        return ChampionsViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ChampionsViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size

    class ChampionsViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.champions_title)
        val imageView: ImageView = view.findViewById(R.id.champions_image)
    }
}