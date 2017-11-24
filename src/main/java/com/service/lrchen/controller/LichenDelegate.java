package com.service.lrchen.controller;

import org.springframework.stereotype.Component;


@Component
public class LichenDelegate implements Lichen {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
