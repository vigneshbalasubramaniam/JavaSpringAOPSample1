/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author VI391762
 */
public class CustomerDeposit implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object retval, Method method, Object[] values, Object target) throws Throwable {
        System.out.println("Balance after the transaction:"+retval);   
        System.out.println("Method name:"+method.getName());
    }
    
}
