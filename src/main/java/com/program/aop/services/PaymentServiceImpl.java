package com.program.aop.services;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		
		//Debited
		System.out.println("Amount Debited");
		
		
		//Credited
		System.out.println("Amount Credited");
		
	}

}
