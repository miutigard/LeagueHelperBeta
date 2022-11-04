package no.mobilprog.leaguehelper.model

import no.mobilprog.leaguehelper.R

data class PatchNotes(val patchNotesId: Int, val patchNotesName: String, val patchNotesImage: Int) {

    companion object {
        fun getPatchNotes(): List<PatchNotes> {
            return listOf(
                PatchNotes(0,"Patch 12.21 Notes", R.drawable.patchnotes1221),
                PatchNotes(1,"Patch 12.20 Notes", R.drawable.patchnotes1220),
                PatchNotes(2,"Patch 12.19 Notes", R.drawable.patchnotes1219),
                PatchNotes(3,"Patch 12.18 Notes", R.drawable.patchnotes1218)
            )
        }
    }
}