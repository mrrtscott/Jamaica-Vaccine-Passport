package com.javaccinepassport.vaccine.passport.models

import com.javaccinepassport.vaccine.passport.models.Enum.Sex
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
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

    private var permanentAddress: List<Address>? = null

    private var passportDocument: List<Passport>? = null

    private var vaccineReport: List<VaccineReport> = null



}