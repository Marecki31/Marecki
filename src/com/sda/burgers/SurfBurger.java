package com.sda.burgers;

public class SurfBurger implements Burger{
	private int amount;
	private String name;
	
	public SurfBurger(String name){
		this.amount = 1;
		this.name = name;
	}
	
	@Override
	public void increaseAmount() {
		amount++;
	}

	@Override
	public int getAmount() {
		return amount;
	}

	@Override
	public String getName() {
		return name;
	}

}
