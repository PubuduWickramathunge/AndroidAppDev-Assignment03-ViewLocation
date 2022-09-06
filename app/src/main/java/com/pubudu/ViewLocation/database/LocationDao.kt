package com.pubudu.ViewLocation.database

import androidx.room.*
import com.pubudu.ViewLocation.models.LocationData
import kotlinx.coroutines.flow.Flow

@Dao
interface LocationDao {
    @Query("SELECT * FROM location_data")
    fun getAllLocationData(): Flow<List<LocationData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun add(locationData: LocationData)

    @Update
    suspend fun update(locationData: LocationData)

    @Delete
    suspend fun delete(locationData: LocationData)

}