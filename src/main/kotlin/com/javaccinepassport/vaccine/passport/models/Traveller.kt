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
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_vaccineReports",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "vaccineReportId", referencedColumnName = "id")]
    )
    private var vaccineReport: List<VaccineReport>?,
    @ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_countries",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "countryId", referencedColumnName = "code")]
    )
    private var listCountriesVisited: List<Country>?
) {

    @Id
    private var id: String = UUID.randomUUID().toString()

    fun getId(): String{
        return this.id
    }

}