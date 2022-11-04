package no.mobilprog.leaguehelper.data

import androidx.room.*

@Dao
interface ItemDao {

    @Query("SELECT * FROM item_table")
    fun getAllItems(): List<Item>

    @Query("SELECT * FROM item_table WHERE item LIKE :itemName LIMIT 1")
    suspend fun findByName(itemName: String): Item

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Delete
    suspend fun delete(item: Item)
}