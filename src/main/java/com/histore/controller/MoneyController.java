package com.histore.controller;

import com.histore.db2.Money;
import com.histore.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @RequestMapping("/query")
    public Money testQuery() {
        return moneyService.selectMoneyById(1);
    }
}