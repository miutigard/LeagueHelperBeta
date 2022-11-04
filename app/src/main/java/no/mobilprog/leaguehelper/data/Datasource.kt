package no.mobilprog.leaguehelper.data

import no.mobilprog.leaguehelper.R
import no.mobilprog.leaguehelper.model.Champion
import no.mobilprog.leaguehelper.model.PatchNotes
import no.mobilprog.leaguehelper.model.Summoner

class Datasource {

    fun loadSummoner(): List<Summoner> {
        return listOf<Summoner>(
            Summoner(R.string.patchnotes2021),
            Summoner(R.string.patchnotes2020),
            Summoner(R.string.patchnotes2019),
            Summoner(R.string.patchnotes2018)
        )
    }
}