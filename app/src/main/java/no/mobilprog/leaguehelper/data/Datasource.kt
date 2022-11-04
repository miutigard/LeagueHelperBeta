package no.mobilprog.leaguehelper.data

import no.mobilprog.leaguehelper.R
import no.mobilprog.leaguehelper.model.Champion
import no.mobilprog.leaguehelper.model.PatchNotes

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

    //Champions
    fun loadChampions(): List<Champion> {
        return listOf<Champion>(
            Champion(R.string.ahri, R.drawable.ahri),
            Champion(R.string.aphelios, R.drawable.aphelios),
            Champion(R.string.bard, R.drawable.bard),
            Champion(R.string.braum, R.drawable.braum),
            Champion(R.string.draven, R.drawable.draven),
            Champion(R.string.graves, R.drawable.graves),
            Champion(R.string.jinx, R.drawable.jinx),
            Champion(R.string.lucian, R.drawable.lucian),
            Champion(R.string.olaf, R.drawable.olaf),
            Champion(R.string.rakan, R.drawable.rakan),
            Champion(R.string.sett, R.drawable.sett),
            Champion(R.string.sona, R.drawable.sona),
            Champion(R.string.syndra, R.drawable.syndra),
            Champion(R.string.thresh, R.drawable.thresh),
            Champion(R.string.vex, R.drawable.vex),
            Champion(R.string.xayah, R.drawable.xayah),
            Champion(R.string.yuumi, R.drawable.yuumi)
        )
    }
}