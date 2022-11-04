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
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.adapter.ItemAdapter
import no.mobilprog.leaguehelper.adapter.ItemBraveryAdapter
import no.mobilprog.leaguehelper.model.Champion
import no.mobilprog.leaguehelper.model.Item

class ultimateBraveryResultFragment : Fragment() {

    private val itemList = Item.getItems()
    private val championList = Champion.getChampions()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ultimate_bravery_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_items_bravery_result)
        val backButton = view.findViewById<ImageButton>(R.id.imageButton)

        val championNameTextView = view.findViewById<TextView>(R.id.textViewUltimateChampName)
        val championImageImageView = view.findViewById<ImageView>(R.id.imageViewUltimateBraveryResult)
        val randomChamp = championList.random()

        championNameTextView.text = randomChamp.championName
        championImageImageView.setImageResource(randomChamp.championImage)

        backButton.setOnClickListener{
            val navController = it.findNavController()
            val action = ultimateBraveryResultFragmentDirections.actionUltimateBraveryResultToUltimateFragment()
            navController.navigate(action)
        }

        itemRecyclerView.adapter = ItemBraveryAdapter(itemList) {
            val position = itemRecyclerView.getChildAdapterPosition(it)
            val currentItem = itemList[position]
        }

        itemRecyclerView.layoutManager = GridLayoutManager(context, 6)
    }
}