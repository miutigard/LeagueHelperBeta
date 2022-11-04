package no.mobilprog.leaguehelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.adapter.ChampionsAdapter
import no.mobilprog.leaguehelper.data.Datasource

class ChampionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_champion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myDataset = Datasource().loadChampions()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_champions)
        recyclerView.adapter = this.context?.let { ChampionsAdapter(it, myDataset) }

        recyclerView.layoutManager = GridLayoutManager(context, 3)

    }

}