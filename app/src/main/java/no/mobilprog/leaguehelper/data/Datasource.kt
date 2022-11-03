package no.mobilprog.leaguehelper.data

import no.mobilprog.leaguehelper.R
import no.mobilprog.leaguehelper.model.PatchNotes

class Datasource {

    fun loadPatchNotes(): List<PatchNotes> {
        return listOf<PatchNotes>(
            PatchNotes(R.string.patchnotes2021, R.drawable.patchnotes1221),
            PatchNotes(R.string.patchnotes2020, R.drawable.patchnotes1220),
            PatchNotes(R.string.patchnotes2019, R.drawable.patchnotes1219),
            PatchNotes(R.string.patchnotes2018, R.drawable.patchnotes1218)
        )
    }
}