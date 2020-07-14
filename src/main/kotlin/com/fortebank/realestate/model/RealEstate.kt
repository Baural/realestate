package com.fortebank.realestate.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @project realestate
 * @author BAlzhanov on 25.05.2020.05.2020
 */


@Entity
class RealEstate (
    val country: String,
    val region: String,
    val street: String,
    val building: String,
    val refer: String,
    val ens_code: String,
    val ens_name: String,
    val description: String,
    val sumcost: String,
    val dea_dep_id: String,
    val dea_id: String,
    val dea_code: String,
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1)
    {
        private constructor() : this("", "", "", "", "", "", "", "", "", "", "", "")
    }
