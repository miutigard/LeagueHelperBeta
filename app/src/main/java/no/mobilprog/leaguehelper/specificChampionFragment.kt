package no.mobilprog.leaguehelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.adapter.ChampionsAdapter
import no.mobilprog.leaguehelper.adapter.ItemAdapter
import no.mobilprog.leaguehelper.model.Champion
import no.mobilprog.leaguehelper.model.Item

class specificChampionFragment : Fragment() {
    private val args: specificChampionFragmentArgs by navArgs()
    private val championList = Champion.getChampions()
    private val itemList = Item.getItems()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specific_champion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backButton = view.findViewById<ImageButton>(R.id.imageButton)
        val championNameTextView = view.findViewById<TextView>(R.id.championNameTextView)
        val championImageImageView = view.findViewById<ImageView>(R.id.championImageView)

        championNameTextView.text = championList[args.championId].championName
        championImageImageView.setImageResource(championList[args.championId].championImage)

        backButton.setOnClickListener{
            val navController = it.findNavController()
            val action = specificChampionFragmentDirections.actionSpecificChampionFragmentToChampionFragment()
            navController.navigate(action)
        }

        val itemRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_items)

        itemRecyclerView.adapter = ItemAdapter(itemList) {
            val position = itemRecyclerView.getChildAdapterPosition(it)
            val clickedItem = itemList[position]

            Toast.makeText(view.context, clickedItem.itemName, Toast.LENGTH_SHORT).show()
        }

        itemRecyclerView.layoutManager = GridLayoutManager(context, 6)
    }
}