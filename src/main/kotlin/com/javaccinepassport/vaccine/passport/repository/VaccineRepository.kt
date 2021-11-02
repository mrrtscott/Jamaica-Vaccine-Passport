package com.javaccinepassport.vaccine.passport.repository

import com.javaccinepassport.vaccine.passport.models.Vaccine
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface VaccineRepository: JpaRepository<Vaccine, String> {

    fun findVaccineByManufacturer(manufacturer: String): Vaccine

    fun findVaccineById(id: String): Vaccine

    fun deleteVaccineById(id: String)


}