package com.javaccinepassport.vaccine.passport.models

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
class Passport(
    @Id
    private var passportNumber: String?, @NotBlank
    private var type: String?, @NotBlank
    private var countryCode: String?, @NotBlank
    private var placeOfIssue: String?, @NotBlank
    private var dateOfIssue: Date?, @NotBlank
    private var dateOfExpiry: Date?
) {


    fun getPassportNumber(): String?{
        return this.passportNumber
    }

    fun getType(): String?{
        return this.type
    }

    fun getCountryCode(): String?{
        return this.countryCode
    }

    fun getPlaceOfIssue(): String?{
        return this.placeOfIssue
    }

    fun getDateOfIssue(): Date?{
        return this.dateOfIssue
    }

    fun getDateOfExpiry(): Date?{
        return this.dateOfExpiry
    }

}