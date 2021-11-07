package com.javaccinepassport.vaccine.passport.service

import com.javaccinepassport.vaccine.passport.models.Vaccine
import java.util.*

interface VaccineService {

    fun create(vaccine: Vaccine): Vaccine
    fun vaccineList (limit: Int): List<Vaccine>
    fun get(id: String): Vaccine
    fun update(vaccine: Vaccine)
    fun delete (id: String): Boolean





}