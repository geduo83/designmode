package com.designmode.a03_abstractfactory;

public class BlackPersonMan extends BlackPerson {
	@Override
	public void eat() {
		System.out.println("BlackPersonMan eat");
	}
	@Override
	public void study() {
		System.out.println("BlackPersonMan study");
	}
	@Override
	public void sleep() {
		System.out.println("BlackPersonMan sleep");
	}
}
