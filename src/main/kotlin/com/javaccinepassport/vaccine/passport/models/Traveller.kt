package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.Sex
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank


@Entity
class Traveller {

    @Id
    private var id: UUID = UUID.randomUUID()
    @NotBlank
    private var firstName: String? = null
    private var middleName: String? = null
    @NotBlank
    private var lastName: String? = null
    @NotBlank
    private var sex: Sex? = null
    @NotBlank
    private var nationality: String? = null
    private var dateOfBirth: Date? = null

    @OneToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_addresses",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "addressId", referencedColumnName = "id")]
    )
    private var permanentAddress: List<Address>? = null

    @OneToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_passports",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "passportId", referencedColumnName = "id")]
    )
    private var passportDocument: List<Passport>? = null

    @OneToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_vaccineReports",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "vaccineReportId", referencedColumnName = "id")]
    )
    private var vaccineReport: List<VaccineReport>? = null

    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinTable(
        name = "traveller_countries",
        joinColumns = [javax.persistence.JoinColumn(name = "travellerId", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "countryId", referencedColumnName = "id")]
    )
    private var listCountriesVisited: List<Country>? = null



}