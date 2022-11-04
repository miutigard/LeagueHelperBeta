package no.mobilprog.leaguehelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.adapter.ChampionsAdapter
import no.mobilprog.leaguehelper.data.Datasource
import no.mobilprog.leaguehelper.model.Champion

class ChampionFragment : Fragment() {

    private val championList = Champion.getChampions()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_champion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val championRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_champions)

        championRecyclerView.adapter = ChampionsAdapter(championList) {
            val position = championRecyclerView.getChildAdapterPosition(it)

            val clickedChampion = championList[position]

            Toast.makeText(view.context, clickedChampion.championName, Toast.LENGTH_SHORT).show()
        }

        championRecyclerView.layoutManager = GridLayoutManager(context, 3)
    }

}