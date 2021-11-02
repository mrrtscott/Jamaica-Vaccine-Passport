package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.ApplicantAddressType
import java.util.*
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id

@Entity
class Address(
    @Enumerated(EnumType.STRING)
    private var addressType: ApplicantAddressType?,
    private var streetNumber: String?,
    private var streetName: String?,
    private var city: String?,
    private var parish: String?,
    private var county: String?,
    private var country: String?
) {

    @Id
    private var id: String = UUID.randomUUID().toString()

    fun getId(): String {
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


    fun setAddressType(addressType: ApplicantAddressType?){
        this.addressType = addressType
    }

    fun setStreetNumber(streetNumber: String?){
        this.streetNumber = streetNumber
    }

    fun setStreetName(streetName: String?){
        this.streetName = streetName
    }

    fun setCity(city: String?){
        this.city = city
    }

    fun setParish(parish: String?){
        this.parish =parish
    }

    fun setCounty(country: String?){
        this.county = county
    }

    fun setCountry(country: String?){
        this.country = country
    }
}