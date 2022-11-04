package no.mobilprog.leaguehelper

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.adapter.PatchNotesAdapter
import no.mobilprog.leaguehelper.data.Datasource

class SearchFragment : Fragment () {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }
}