package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.ApplicantAddressType
import java.util.*
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id

@Entity
class Address {

    @Id
    private var id: UUID = UUID.randomUUID()
    @Enumerated(EnumType.STRING)
    private var addressType: ApplicantAddressType? = null
    private var streetNumber:String? = null
    private var streetName:String? = null
    private var city:String? = null
    private var parish:String?= null
    private var county:String? = null
    private var country: String? = null

    constructor(
        addressType: ApplicantAddressType?,
        streetNumber: String?,
        streetName: String?,
        city: String?,
        parish: String?,
        county: String?,
        country: String?
    ) {
        this.addressType = addressType
        this.streetNumber = streetNumber
        this.streetName = streetName
        this.city = city
        this.parish = parish
        this.county = county
        this.country = country
    }

    fun getId(): UUID {
        return this.id
    }

    fun getAddressType(): ApplicantAddressType?{
        return this.addressType
    }

    fun getStreetNumber(): String? {
        return this.streetNumber
    }

    fun getStreetName(): String? {
        return this.streetName
    }

    fun getCity (): String? {
        return this.city
    }

    fun getParish (): String?{
        return this.parish
    }

    fun getCounty(): String? {
        return this.county
    }

    fun getCountry (): String? {
        return this.country
    }
}