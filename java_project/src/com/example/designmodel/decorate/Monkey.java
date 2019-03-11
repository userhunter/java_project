package com.example.designmodel.decorate;

public class Monkey extends HigherAnimal{

	public Monkey(Animal mAnimal) {
		super(mAnimal);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void drinkWater() {
		System.out.println(Monkey.class.getName()+" like drink other water.");
	}

}
