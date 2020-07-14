package com.fortebank.realestate.controller

import com.fortebank.realestate.model.RealEstate
import com.fortebank.realestate.repository.RealEstateRepository
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*



/**
 * @project realestate
 * @author BAlzhanov on 25.05.2020
 */


@RequestMapping("/api")
@RestController
class RealEstateController {

    @Autowired
    lateinit var repository: RealEstateRepository

    @RequestMapping("/save")
    fun save(): String {
        repository.save(RealEstate("КАЗАХСТАН", "", "", "", "ALB_2640538821", "18", "Жилое помещение (квартира)", "квартира, состоящая из 2 жилых комнат, общей площадью 42 кв.м., в т.ч. жилой площадью 27,6 кв.м.,адрес: г.Талдыкорган,мкр.Жетысу,д.6,кв.56", "224798.07", "1229", "46660939","ДЗ 16053719-02АИ-1417/2011_1"))
        repository.save(RealEstate("КАЗАХСТАН", "", "", "", "ALB_2680901881", "18", "Жилое помещение (квартира)", "3-х комнатная квартира общей площадью 63,30 кв.м., в том числе жилой площадью 40,50 кв.м., расположенная  по адресу: г. Алматы, Медеуский район, мкр. Самал-1, д. 24, кв. 80.", "437424.96", "1229", "46660451", "ДЗ 15116181-1417-Нн/2007."))
        repository.save(RealEstate("КАЗАХСТАН", "", "", "", "ALB_2680901881", "18", "Жилое помещение (квартира)", "3-х комнатная квартира общей площадью 63,30 кв.м., в том числе жилой площадью 40,50 кв.м., расположенная  по адресу: г. Алматы, Медеуский район, мкр. Самал-1, д. 24, кв. 80.", "437424.96", "1229", "596893577", "ДЗ 15016181-1417-НН/2007"))
        return "Done"
    }

    @RequestMapping("/collaterals")
    fun findAll() = repository.findAll()

    @RequestMapping("/collateral/{id}")
    fun findById(@PathVariable id: Long)
    = repository.findById(id)

    @RequestMapping("/collateral/refer/{refer}")
    fun findByRefer(@PathVariable refer: String)
    = repository.findByRefer(refer)


}