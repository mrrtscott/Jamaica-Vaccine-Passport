package com.javaccinepassport.vaccine.passport.controller

import com.javaccinepassport.vaccine.passport.models.Response
import com.javaccinepassport.vaccine.passport.models.Vaccine
import com.javaccinepassport.vaccine.passport.service.VaccineService
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import java.time.LocalDateTime
import javax.validation.Valid

@RestController
@RequestMapping("/vaccine")
@RequiredArgsConstructor
class VaccineController {

    @Autowired
    private lateinit var vaccineService: VaccineService

    @PostMapping("/create-vaccine")
    fun createVaccine(@RequestBody vaccineInput: @Valid Vaccine): ResponseEntity<Response>{
        val vaccine = vaccineService.create(vaccineInput)
        val location = ServletUriComponentsBuilder
            .fromCurrentRequest().path("/{id}")
            .buildAndExpand(vaccine.getId()).toUri()

        return ResponseEntity.created(location).body(Response(LocalDateTime.now(),
            HttpStatus.CREATED.value(),
            HttpStatus.CREATED,
            "",
            "",
            "",
            mapOf("Vaccine" to vaccineService.get(vaccine.getId()))
        ))
    }

    @GetMapping("/all-vaccines")
    fun getVaccines(): ResponseEntity<Response>{
        return ResponseEntity.ok()
            .body(Response(LocalDateTime.now(),
                HttpStatus.OK.value(),
                HttpStatus.OK,
                "",
                "All vaccines retrieved",
                "",
                mapOf("List of Vaccines" to vaccineService.vaccineList(100))))

    }


}
