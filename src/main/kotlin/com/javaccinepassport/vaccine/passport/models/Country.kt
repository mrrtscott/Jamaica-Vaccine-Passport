package com.javaccinepassport.vaccine.passport.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Country(
    @Id
    private var code: String?,
    private var country: String?,
    private var capital: String?,
    private var continent: String?,
    private var region: String?
) {

    fun getCode(): String?{
        return this.code
    }

    fun getCountry(): String?{
        return this.country
    }

    fun getCapital(): String?{
        return this.capital
    }

    fun getContinent(): String?{
        return this.continent
    }

    fun getRegion(): String?{
        return this.region
    }

}