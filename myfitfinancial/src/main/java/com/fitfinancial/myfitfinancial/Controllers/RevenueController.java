package com.fitfinancial.myfitfinancial.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitfinancial.myfitfinancial.Models.Capitals.Revenues.RevenueRepository;

import jakarta.transaction.Transactional;

import com.fitfinancial.myfitfinancial.Models.Capitals.Revenues.Revenue;

@RestController
@RequestMapping("/revenue")
public class RevenueController {
    
    @Autowired
    private RevenueRepository revenueRepository;


    @GetMapping
    public void getAll() {

    }

    @PostMapping
    @Transactional
    public void create(@RequestBody Revenue revenue) {
        revenueRepository.save(new Revenue(revenue));
    }
}
