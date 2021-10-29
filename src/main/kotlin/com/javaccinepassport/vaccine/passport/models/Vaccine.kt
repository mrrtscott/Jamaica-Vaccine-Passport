package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.Alert
import com.javaccinepassport.vaccine.passport.models.Enum.VaccineRequirement
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Vaccine {

    @Id
    private var id: UUID = UUID.randomUUID()

    @Column(unique = true)
    private var name: String? = null

    private var manufacturer: String? = null

    private var dosesInRoutineSeries: Int? = null

    private var requirement: VaccineRequirement? = null

    private var alertLevel: Alert? = null

}