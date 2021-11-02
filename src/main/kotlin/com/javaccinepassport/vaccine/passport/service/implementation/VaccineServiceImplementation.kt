package com.javaccinepassport.vaccine.passport.service.implementation

import com.javaccinepassport.vaccine.passport.models.Vaccine
import com.javaccinepassport.vaccine.passport.repository.VaccineRepository
import com.javaccinepassport.vaccine.passport.service.VaccineService
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
class VaccineServiceImplementation : VaccineService {

    @Autowired
    private lateinit var vaccineRepository: VaccineRepository

    override fun create(vaccine: Vaccine): Vaccine {
        return vaccineRepository.save(vaccine)
    }

    override fun vaccineList(limit: Int): List<Vaccine> {
        return vaccineRepository.findAll(PageRequest.of(0, limit)).toList()
    }

    override fun get(id: String): Vaccine {
        return vaccineRepository.findVaccineById(id)
    }

    override fun update(vaccine: Vaccine) {
        vaccineRepository.save(vaccine)
    }

    override fun delete(id: String): Boolean {
       vaccineRepository.deleteVaccineById(id)
        return true

    }


}