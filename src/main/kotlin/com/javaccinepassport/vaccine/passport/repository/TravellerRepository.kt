package com.javaccinepassport.vaccine.passport.repository

import com.javaccinepassport.vaccine.passport.models.Traveller
import org.springframework.data.jpa.repository.JpaRepository

interface TravellerRepository :JpaRepository<Traveller, String> {

    fun findTravellerById(id: String): Traveller

    fun findTravellerByFirstName(firstName: String): List<Traveller>
}