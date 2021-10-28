package com.javaccinepassport.vaccine.passport.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Country {

    @Id
    private var code: String? = null
    private var country: String? = null
    private var capital: String? = null
    private var contident: String? = null
    private var region: String? = null

}