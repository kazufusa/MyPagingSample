package kazufusa.mypagingsample

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Cheese(@PrimaryKey(autoGenerate = true) val id: Int, val name: String)