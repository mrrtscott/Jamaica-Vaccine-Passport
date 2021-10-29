package com.javaccinepassport.vaccine.passport.models

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
class Passport {

    @Id
    private var passportNumber: String? = null
    @NotBlank
    private var type: String? = null
    @NotBlank
    private var countryCode:String? = null
    @NotBlank
    private var placeOfIssue: String? = null
    @NotBlank
    private var dateOfIssue: Date? = null
    @NotBlank
    private var dateOfExpiry: Date? = null

}