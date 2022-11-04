package no.mobilprog.leaguehelper.model

import no.mobilprog.leaguehelper.R

data class Champion(val championId: Int, val championName: String, val championImage: Int) {

    companion object {
        fun getChampions(): List<Champion> {
            return listOf(
                Champion(0,"Ahri", R.drawable.ahri),
                Champion(1,"Aphelios", R.drawable.aphelios),
                Champion(2,"Bard", R.drawable.bard),
                Champion(3,"Braum", R.drawable.braum),
                Champion(4,"Draven", R.drawable.draven),
                Champion(5,"Graves", R.drawable.graves),
                Champion(6,"Jinx", R.drawable.jinx),
                Champion(7,"Lucian", R.drawable.lucian),
                Champion(8,"Olaf", R.drawable.olaf),
                Champion(9,"Rakan", R.drawable.rakan),
                Champion(10,"Sett", R.drawable.sett),
                Champion(11,"Sona", R.drawable.sona),
                Champion(12,"Syndra", R.drawable.syndra),
                Champion(13,"Thresh", R.drawable.thresh),
                Champion(14,"Vex", R.drawable.vex),
                Champion(15,"Xayah", R.drawable.xayah),
                Champion(16,"Yuumi", R.drawable.yuumi),
            )
        }
    }
}