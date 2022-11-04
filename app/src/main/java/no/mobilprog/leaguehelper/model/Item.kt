package no.mobilprog.leaguehelper.model

import no.mobilprog.leaguehelper.R

data class Item(val itemId: Int, val itemName: String, val itemImage: Int) {

    companion object {
        fun getItems(): List<Item> {
            return listOf(
                Item(0,"Infinity Edge", R.drawable.infinity_edge),
                Item(1,"Lord Dominik's Regards", R.drawable.lord_dominiks_regards),
                Item(2,"Rabadon's Deathcap", R.drawable.rabadons_deathcap),
                Item(3,"Shadowflame", R.drawable.shadowflame),
                Item(4,"Sorcerer's Shoes", R.drawable.sorcerers_shoes),
                Item(5,"Sunfire Aegis", R.drawable.sunfire_aegis)
            )
        }
    }
}