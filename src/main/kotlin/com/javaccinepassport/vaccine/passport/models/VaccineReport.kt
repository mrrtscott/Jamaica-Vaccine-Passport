package com.javaccinepassport.vaccine.passport.models

import java.util.*
import javax.persistence.*

@Entity
class VaccineReport {

    @Id
    private var id: String = UUID.randomUUID().toString()

    @Column(unique = true)
    private var year: Int? = null

    @OneToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "vaccineReport_Immunization",
        joinColumns = [javax.persistence.JoinColumn(name = "vaccineReportId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "immunizationId", referencedColumnName = "id")]
    )
    private var immunization: List<Immunization>? = null



    private var vaccinationScore: Double? = 0.00




}