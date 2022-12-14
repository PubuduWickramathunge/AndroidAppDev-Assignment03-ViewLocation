package com.pubudu.ViewLocation.repository

import androidx.annotation.WorkerThread
import com.pubudu.ViewLocation.database.LocationDao
import com.pubudu.ViewLocation.models.LocationData
import kotlinx.coroutines.flow.Flow

class LocationDataRepository(private val locationDao: LocationDao) {

    val allLocations: Flow<List<LocationData>> = locationDao.getAllLocationData()

    @WorkerThread
    suspend fun inset(locationData: LocationData) {
        locationDao.add(locationData)
    }

    @WorkerThread
    suspend fun delete(locationData: LocationData) {
        locationDao.delete(locationData)
    }

    @WorkerThread
    suspend fun update(locationData: LocationData) {
        locationDao.update(locationData)
    }

}