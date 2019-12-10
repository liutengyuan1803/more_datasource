package com.histore.db1;


import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private int id;
    private String name;
    private int age;
    private double money;
}