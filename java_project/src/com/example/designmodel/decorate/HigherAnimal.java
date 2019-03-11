package com.example.designmodel.decorate;

public class HigherAnimal extends Animal{
	
	private Animal mAnimal;
	
	public HigherAnimal(Animal mAnimal) {
		this.mAnimal = mAnimal;
	}

	@Override
	public void eat() {
		mAnimal.eat();
		eatAnimal();
	}

	@Override
	public void drink() {
		mAnimal.drink();
		drinkWater();
	}
	
    public void eatAnimal() {
    }
    
    public void drinkWater() {
    }

}
