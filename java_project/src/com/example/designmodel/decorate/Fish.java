package com.example.designmodel.decorate;

public class Fish extends Animal{

	@Override
	public void eat() {
		System.out.println("eat the water animal");
		
	}

	@Override
	public void drink() {
		System.out.println("drink the water animal");		
	}

}
