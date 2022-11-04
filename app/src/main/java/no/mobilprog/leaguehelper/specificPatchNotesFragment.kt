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
import no.mobilprog.leaguehelper.adapter.PatchNotesAdapter
import no.mobilprog.leaguehelper.model.Champion
import no.mobilprog.leaguehelper.model.PatchNotes

class specificPatchNotesFragment : Fragment() {
    private val args: specificPatchNotesFragmentArgs by navArgs()
    private val patchNotesList = PatchNotes.getPatchNotes()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specific_patch_notes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val backButton = view.findViewById<ImageButton>(R.id.imageButton)
        val patchNotesTextView = view.findViewById<TextView>(R.id.patchNotesTextView)
        val patchNotesImageView = view.findViewById<ImageView>(R.id.patchNotesImageView)

        patchNotesTextView.text = patchNotesList[args.patchNotesId].patchNotesName
        patchNotesImageView.setImageResource(patchNotesList[args.patchNotesId].patchNotesImage)

        backButton.setOnClickListener{
            val navController = it.findNavController()
            val action = specificPatchNotesFragmentDirections.actionSpecificPatchNotesFragmentToHomeFragment()
            navController.navigate(action)
        }
    }
}