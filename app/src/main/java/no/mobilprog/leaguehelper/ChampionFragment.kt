package no.mobilprog.leaguehelper

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.adapter.ChampionsAdapter
import no.mobilprog.leaguehelper.model.Champion

class ChampionFragment : Fragment() {

    private val championList = Champion.getChampions()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_champion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val championRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_champions)

        championRecyclerView.adapter = ChampionsAdapter(championList) {
            val position = championRecyclerView.getChildAdapterPosition(it)

            val clickedChampion = championList[position]

            val navController = this.findNavController()
            val action = ChampionFragmentDirections.actionChampionFragmentToSpecificChampionFragment()

            action.championId = clickedChampion.championId

            navController.navigate(action)
        }

        championRecyclerView.layoutManager = GridLayoutManager(context, 3)
    }

}