package com.program.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* com.program.aop.services.PaymentServiceImpl.makePayment())")
    public void printBefore()
    {
        System.out.println("Payment Started");
    }
    @After("execution(* com.program.aop.services.PaymentServiceImpl.makePayment())")
    public void printAFter()
    {
        System.out.println("Payment Done");
    }


}
