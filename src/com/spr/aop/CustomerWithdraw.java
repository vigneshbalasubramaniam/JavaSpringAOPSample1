/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author VI391762
 */
public class CustomerWithdraw implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] values, Object target) throws Throwable {
     boolean flag=false;
     double amount=0;
     for(Object inn:values)
     {
         if(Double.parseDouble(inn.toString().trim())>Banking.balance)
         {
             amount=Double.parseDouble(inn.toString().trim());
             flag=false;
             break;
         }
         else
             flag=true;
     }
     if(!flag)
     {
         System.out.println("Sorry!! Withdraw amount "+amount+" exceeded,Transaction Declined..Current Balance:"+Banking.balance);
     }
     else
            System.out.println("Transaction Accepted");
    }

    
}
