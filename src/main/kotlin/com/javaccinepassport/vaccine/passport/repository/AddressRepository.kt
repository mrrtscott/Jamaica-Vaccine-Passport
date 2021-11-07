package com.javaccinepassport.vaccine.passport.repository

import com.javaccinepassport.vaccine.passport.models.Address
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AddressRepository:JpaRepository<Address, String> {

    fun findAddressById(id: String): Address

}