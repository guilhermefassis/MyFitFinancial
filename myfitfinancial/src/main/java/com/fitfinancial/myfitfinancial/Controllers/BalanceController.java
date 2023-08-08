package com.fitfinancial.myfitfinancial.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance")
public class BalanceController {
    
    @GetMapping
    public void getBalance() {

    }
}
