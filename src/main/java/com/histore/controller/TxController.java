package com.histore.controller;

import com.histore.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TxController {

    @Autowired
    TestService testService;

    @RequestMapping("/tx1")
    public Object testIsolationTx(){
       return testService.testTx1();
    }

    @RequestMapping("/tx2")
    public Object testIsolationTx2(){
       return testService.testTx2();
    }
}
