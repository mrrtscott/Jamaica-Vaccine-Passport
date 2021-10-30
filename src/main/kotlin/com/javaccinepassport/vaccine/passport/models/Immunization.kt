package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.VaccineStatus
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Immunization(
    @Column(unique = true)
    private var vaccineName: String?,
    private var batchLotNumber: Int?,
    private var vaccinator: String?,
    private var countryOfAdministration: String?,
    private var manufacturer: String?,
    private var dateOfDose: Date?
) {
    @Id
    private var id: UUID = UUID.randomUUID()


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