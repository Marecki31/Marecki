package com.sda.burgers;

import java.util.List;

public class SurfBurgerUtils {
	public static void placeOrder(List<Burger> list){
		for(Burger burger : list){
			System.out.println("BURGER NAME: "+burger.getName()+" | AMOUNT: "+burger.getAmount());
		}
	}
}
