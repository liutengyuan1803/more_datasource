package com.histore.service;

import com.histore.db1.User;
import com.histore.db2.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    @Autowired
    UserService userService;

    @Autowired
    MoneyService moneyService;


    @Transactional
    public int testTx1(){
        User user = new User();
        user.setAge(24);
        user.setMoney(52);
        user.setName("tx1");
        int rows = userService.insert(user);
        int a = 1/0;
        return rows;
    }

    @Transactional
    public int testTx2(){
        User user = new User();
        user.setAge(24);
        user.setMoney(52);
        user.setName("tx2");
        int rows = userService.insert(user);

        int a = 1/0;

        Money money = new Money();
        money.setBasic(19000);
        money.setPunishment(100);
        money.setReward(4000);
        moneyService.insert(money);

        return rows;
    }
}
