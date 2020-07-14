package com.fortebank.realestate.repository

import com.fortebank.realestate.model.RealEstate
import org.springframework.data.repository.CrudRepository

/**
 * @project realestate
 * @author BAlzhanov on 25.05.2020
 */
interface RealEstateRepository : CrudRepository<RealEstate, Long> {
    fun findByRefer(refer: String): Iterable<RealEstate>
}