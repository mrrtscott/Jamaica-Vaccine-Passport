package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.Sex
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank


@Entity
class Traveller(
    @NotBlank
    private var firstName: String?,
    private var middleName: String?,
    @NotBlank
    private var lastName: String?,
    @NotBlank
    @Enumerated(EnumType.STRING)
    private var sex: Sex?,
    @NotBlank
    private var nationality: String?,
    private var dateOfBirth: Date?,
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_addresses",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "addressId", referencedColumnName = "id")]
    )
    private var permanentAddress: List<Address>?,
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_passports",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "passportId", referencedColumnName = "passportNumber")]
    )
    private var passportDocument: List<Passport>?,
    @ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_countries",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "countryId", referencedColumnName = "code")]
    )
    private var listCountriesVisited: List<Country>?
) {

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_vaccineReports",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "vaccineReportId", referencedColumnName = "id")]
    )
    private var vaccineReport: List<VaccineReport>? = null


    @Id
    private var id: String = UUID.randomUUID().toString()

    fun getId(): String{
        return this.id
    }

    fun getFirstName(): String?{
        return this.firstName
    }

    fun getMiddleName(): String?{
        return this.middleName
    }

    fun getLastName(): String?{
        return this.lastName
    }

    fun getSex(): Sex?{
        return this.sex
    }

    fun getNationality(): String?{
        return this.nationality
    }

    fun getDateOfBirth(): Date?{
        return this.dateOfBirth
    }

    fun getPermanentAddress(): List<Address>?{
        return this.permanentAddress
    }

    fun getPassportDocument(): List<Passport>?{
        return this.passportDocument
    }

    fun getVaccineReport(): List<VaccineReport>?{
        return this.vaccineReport
    }

    fun getListCountriesVisited(): List<Country>?{
        return this.listCountriesVisited
    }


}