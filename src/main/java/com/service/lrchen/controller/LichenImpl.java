package com.service.lrchen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T02:26:11.309Z")

@RpcSchema(schemaId = "lichen")
public class LichenImpl implements Lichen{

    @Autowired
    private LichenDelegate lichenDelegate;


    public String helloworld(String name) {

        return lichenDelegate.helloworld(name);
    }

}
