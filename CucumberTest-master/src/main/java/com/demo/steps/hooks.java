package com.demo.steps;

import java.net.MalformedURLException;

import com.demo.actions.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends BaseClass{
	
    @Before(order=0)
    public void beforeHookfunction1() throws MalformedURLException, InterruptedException{
    	createLocalDriver();
    	System.out.println("Initilized driver");
    }

    @After(order=0)
    public void afterHookfunction1() {
    	System.out.println("Driver closed");
    	closeDriver();
    }
    /*
    @Before(order=1)
    public void beforeHookfunction2() throws MalformedURLException, InterruptedException{
    	
    	System.out.println("Initilized driver 2");
    }

    @After(order=1)
    public void afterHookfunction2() {
    	System.out.println("Driver closed 2");

    }
    
    @Before("@taggedHookes")
    public void beforeHookfunction3() throws MalformedURLException, InterruptedException{
    	
    	System.out.println("DB open");
    }

    @After("@taggedHookes")
    public void afterHookfunction3() {
    	System.out.println("DB closed");

    }*/
    
}
