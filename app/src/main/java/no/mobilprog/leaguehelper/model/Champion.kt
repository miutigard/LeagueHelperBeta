package no.mobilprog.leaguehelper.model

import no.mobilprog.leaguehelper.R

data class Champion(val championName: String, val championImage: Int) {

    companion object {
        fun getChampions(): List<Champion> {
            return listOf(
                Champion("Ahri", R.drawable.ahri),
                Champion("Aphelios", R.drawable.aphelios),
                Champion("Bard", R.drawable.bard),
                Champion("Braum", R.drawable.braum),
                Champion("Draven", R.drawable.draven),
                Champion("Graves", R.drawable.graves),
                Champion("Jinx", R.drawable.jinx),
                Champion("Lucian", R.drawable.lucian),
                Champion("Olaf", R.drawable.olaf),
                Champion("Rakan", R.drawable.rakan),
                Champion("Sett", R.drawable.sett),
                Champion("Sona", R.drawable.sona),
                Champion("Syndra", R.drawable.syndra),
                Champion("Thresh", R.drawable.thresh),
                Champion("Vex", R.drawable.vex),
                Champion("Xayah", R.drawable.xayah),
                Champion("Yuumi", R.drawable.yuumi),
            )
        }
    }
}