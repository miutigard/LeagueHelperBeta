package no.mobilprog.leaguehelper.data

import no.mobilprog.leaguehelper.R
import no.mobilprog.leaguehelper.model.Champion
import no.mobilprog.leaguehelper.model.PatchNotes
import no.mobilprog.leaguehelper.model.Summoner

class Datasource {

    //Patchnotes
    fun loadPatchNotes(): List<PatchNotes> {
        return listOf<PatchNotes>(
            PatchNotes(R.string.patchnotes2021, R.drawable.patchnotes1221),
            PatchNotes(R.string.patchnotes2020, R.drawable.patchnotes1220),
            PatchNotes(R.string.patchnotes2019, R.drawable.patchnotes1219),
            PatchNotes(R.string.patchnotes2018, R.drawable.patchnotes1218)
        )
    }

    fun loadSummoner(): List<Summoner> {
        return listOf<Summoner>(
            Summoner(R.string.patchnotes2021),
            Summoner(R.string.patchnotes2020),
            Summoner(R.string.patchnotes2019),
            Summoner(R.string.patchnotes2018)
        )
    }
}