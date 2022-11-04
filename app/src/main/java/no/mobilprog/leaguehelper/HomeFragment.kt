package no.mobilprog.leaguehelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.adapter.PatchNotesAdapter
import no.mobilprog.leaguehelper.data.Datasource

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myDataset = Datasource().loadPatchNotes()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_patchnotes)
        recyclerView.adapter = this.context?.let { PatchNotesAdapter(it, myDataset) }

        recyclerView.setHasFixedSize(true)

    }


}