/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author VI391762
 */
public class clientmain {
public static void main(String[] args)
{
    ApplicationContext context=new ClassPathXmlApplicationContext("newSpringXMLConfig.xml");
    IBanking b=(IBanking)context.getBean("proxy");
    b.deposit(123);
    b.withdraw(499);
    b.withdraw(60000);
}  
}
