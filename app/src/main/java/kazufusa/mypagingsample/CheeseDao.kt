package kazufusa.mypagingsample

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import android.arch.paging.DataSource
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert

/**
 * Created by kazufusa on 2018/05/10.
 */

@Dao
interface CheeseDao{
    @Query("SELECT * FROM Cheese ORDER BY name COLLATE NOCASE ASC")
    fun allCheeseByName() : DataSource.Factory<Int, Cheese>

    @Insert
    fun insert(cheeses: List<Cheese>)

    @Insert
    fun insert(cheese: Cheese)

    @Delete
    fun delete(cheese: Cheese)
}
