package com.javaccinepassport.vaccine.passport.service

import com.javaccinepassport.vaccine.passport.models.Traveller

interface TravellerService {

    fun create(traveller: Traveller): Traveller
    fun travellerList(): List<Traveller>
    fun get(id: String): Traveller
    fun update(traveller: Traveller)
    fun delete(id: String)
    fun getTravellerByFirstName(firstName: String): List<Traveller>
}