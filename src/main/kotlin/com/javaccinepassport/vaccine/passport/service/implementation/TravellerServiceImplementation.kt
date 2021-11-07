package com.javaccinepassport.vaccine.passport.service.implementation

import com.javaccinepassport.vaccine.passport.models.Traveller
import com.javaccinepassport.vaccine.passport.repository.TravellerRepository
import com.javaccinepassport.vaccine.passport.service.TravellerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TravellerServiceImplementation : TravellerService {

    @Autowired
    private lateinit var travellerRepository: TravellerRepository

    override fun create(traveller: Traveller): Traveller {
        return travellerRepository.save(traveller)
    }

    override fun travellerList(): List<Traveller> {
        return travellerRepository.findAll()
    }

    override fun get(id: String): Traveller {
        return travellerRepository.findTravellerById(id)
    }

    override fun update(traveller: Traveller) {
        travellerRepository.save(traveller)
    }

    override fun delete(id: String) {
        travellerRepository.deleteById(id)
    }

    override fun getTravellerByFirstName(firstName: String): List<Traveller> {
        return travellerRepository.findTravellerByFirstName(firstName)
    }
}