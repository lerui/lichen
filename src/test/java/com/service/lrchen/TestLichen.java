package com.service.lrchen.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLichen {

    LichenDelegate lichenDelegate = new LichenDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = lichenDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
