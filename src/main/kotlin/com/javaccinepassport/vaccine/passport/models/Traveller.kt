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
    private var firstName: String? = null
    private var middleName: String? = null
    private var lastName: String? = null
    @NotBlank
    private var sex: Sex? = null
    private var nationality: String? = null

}