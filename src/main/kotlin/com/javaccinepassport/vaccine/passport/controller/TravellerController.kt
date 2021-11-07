package com.javaccinepassport.vaccine.passport.controller

import com.javaccinepassport.vaccine.passport.models.Response
import com.javaccinepassport.vaccine.passport.models.Traveller
import com.javaccinepassport.vaccine.passport.service.TravellerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.time.LocalDateTime
import javax.validation.Valid

@RestController
@RequestMapping("/traveller")
class TravellerController {

    @Autowired
    private lateinit var travellerService: TravellerService

    @PostMapping("/create-traveller")
    fun createTraveller(@RequestBody travellerInput: @Valid Traveller) : ResponseEntity<Response>  {
        val traveller = travellerService.create(travellerInput)
        val location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(traveller.getId()).toUri()

        return ResponseEntity.created(location).body(Response(
            LocalDateTime.now(),
            HttpStatus.CREATED.value(),
            HttpStatus.CREATED,
            "",
            "",
            "",
            mapOf("Vaccine" to travellerService.get(traveller.getId()))
        ))


    }
}