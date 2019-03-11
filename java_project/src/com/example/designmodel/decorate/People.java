package com.example.designmodel.decorate;

public class People extends HigherAnimal{

	public People(Animal mAnimal) {
		super(mAnimal);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eatAnimal() {
		System.out.println("I like eat fish.");
	}
	
}
