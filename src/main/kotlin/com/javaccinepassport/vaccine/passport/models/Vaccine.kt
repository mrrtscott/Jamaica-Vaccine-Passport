package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.Alert
import com.javaccinepassport.vaccine.passport.models.Enum.VaccineRequirement
import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
class Vaccine(
    private var name: String?,
    private var manufacturer: String?,
    private var dosesInRoutineSeries: Int?,
    @Enumerated(EnumType.STRING)
    private var requirement: VaccineRequirement?,
    @Enumerated(EnumType.STRING)
    private var alertLevel: Alert?
) {

    @Id
    private var id: String = UUID.randomUUID().toString()

    fun getId(): String{
        return this.id
    }

    fun getName(): String?{
        return this.name
    }

    fun getManufacturer(): String?{
        return this.manufacturer
    }

    fun getDosesInRoutineSeries(): Int?{
        return this.dosesInRoutineSeries
    }

    fun getRequirement(): VaccineRequirement?{
        return this.requirement
    }

    fun getAlertLevel(): Alert?{
        return this.alertLevel
    }



}