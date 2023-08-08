package com.fitfinancial.myfitfinancial.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spending")
public class SpendingController {
    
    @GetMapping 
    public void getAll() {

    }

    @PostMapping
    public void create() {

    }
}
