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
import no.mobilprog.leaguehelper.model.PatchNotes

class PatchNotesAdapter (
    private val items: List<PatchNotes>,
    private val clickListener: View.OnClickListener
) : RecyclerView.Adapter<PatchNotesAdapter.PatchNotesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatchNotesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_patchnotes, parent, false)

        return PatchNotesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PatchNotesViewHolder, position: Int) {
        val currentPatchNotes = items[position]

        holder.bind(currentPatchNotes, clickListener)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PatchNotesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val patchNotesNameView: TextView = view.findViewById(R.id.patchnotes_title)
        private val patchNotesImageView: ImageView = view.findViewById(R.id.patchnotes_image)

        fun bind(item: PatchNotes, clickListener: View.OnClickListener) {
            // Fills the views with the given data
            patchNotesImageView.setImageResource(item.patchNotesImage)
            patchNotesNameView.text = item.patchNotesName

            // Sets the onClickListener
            itemView.setOnClickListener(clickListener)
        }
    }
}