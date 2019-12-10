package com.histore.db2;

import lombok.Data;

import java.io.Serializable;

@Data
public class Money implements Serializable {
    private int basic;
    private int reward;
    private int punishment;
}