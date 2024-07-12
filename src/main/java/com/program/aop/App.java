package com.program.aop;

import com.program.aop.services.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/program/aop/config.xml");
        PaymentService paymentService = applicationContext.getBean(PaymentService.class);
        paymentService.makePayment();
    }
}
