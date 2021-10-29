package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.VaccineStatus
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Immunization {
    @Id
    private var id: UUID = UUID.randomUUID()
    @Column(unique = true)
    private var vaccineName: String? = null
    private var batchLotNumber: Int? = null
    private var vaccinator: String? = null
    private var countryOfAdministration: String? = null
    private var manufacturer: String? = null
    private var dateOfDose: Date? = null



    fun getId(): UUID{
        return this.id
    }

    fun getVaccineName(): String?{
        return this.vaccineName
    }

    fun getBatchLotNumber(): Int?{
        return this.batchLotNumber
    }

    fun getVaccinator(): String?{
        return this.vaccinator
    }

    fun getCountryOfAdministration(): String?{
        return this.countryOfAdministration
    }

    fun getManufacturer(): String?{
        return this.manufacturer
    }

    fun getDateOfDose(): Date?{
        return this.dateOfDose
    }

}