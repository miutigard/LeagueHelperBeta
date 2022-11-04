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
                Item(5,"Sunfire Aegis", R.drawable.sunfire_aegis),
                Item(6,"Thornmail", R.drawable.thornmail),
                Item(7,"Blade of the ruined king", R.drawable.botrk),
                Item(8,"Berserker's Greaves", R.drawable.berserker_greaves),
                Item(9,"Bloodthirster", R.drawable.bloodthirster),
                Item(10,"Runaan's Hurricane", R.drawable.runaans_hurricane)
            )
        }
    }
}