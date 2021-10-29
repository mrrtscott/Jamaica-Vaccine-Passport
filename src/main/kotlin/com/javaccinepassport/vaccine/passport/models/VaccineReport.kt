package com.javaccinepassport.vaccine.passport.models

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class VaccineReport {

    @Id
    private var id: UUID = UUID.randomUUID()

    @Column(unique = true)
    private var year: Int? = null




}