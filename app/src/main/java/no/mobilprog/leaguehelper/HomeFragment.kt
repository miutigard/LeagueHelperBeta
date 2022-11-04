package no.mobilprog.leaguehelper

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import no.mobilprog.leaguehelper.adapter.PatchNotesAdapter
import no.mobilprog.leaguehelper.model.PatchNotes

class HomeFragment : Fragment() {

    private val patchNotesList = PatchNotes.getPatchNotes()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val patchNotesRecyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_patchnotes)

        patchNotesRecyclerView.adapter = PatchNotesAdapter(patchNotesList) {
            val position = patchNotesRecyclerView.getChildAdapterPosition(it)

            val clickedPatchNotes = patchNotesList[position]

            val navController = this.findNavController()
            val action = HomeFragmentDirections.actionHomeFragmentToSpecificPatchNotesFragment()

            action.patchNotesId = clickedPatchNotes.patchNotesId

            navController.navigate(action)
        }

        patchNotesRecyclerView.layoutManager = GridLayoutManager(context, 1)
    }


}