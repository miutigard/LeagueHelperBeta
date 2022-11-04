package no.mobilprog.leaguehelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import no.mobilprog.leaguehelper.model.Champion

class specificChampionFragment : Fragment() {
    private val args: specificChampionFragmentArgs by navArgs()
    private val championList = Champion.getChampions()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specific_champion, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val championNameTextView = view.findViewById<TextView>(R.id.championNameTextView)
        val championImageImageView = view.findViewById<ImageView>(R.id.championImageView)

        championNameTextView.text = championList[args.championId].championName
        championImageImageView.setImageResource(championList[args.championId].championImage)
    }
}