package com.sda.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sda.burgers.Burger;
import com.sda.burgers.SurfBurger;
import com.sda.burgers.SurfBurgerUtils;

public class SurfBurgerTest {
	
	@Test
	public void testPlacingOrder(){
		String[] names = new String[]{"chesse","dzik","specjal","chesse","chesse","dzik"};
		
		prepareOrder(names);
	}
	
	/*
	 * Dostaliœmy zadanie zwrócenia listy List<Burger> list, dostajemy zwyk³¹ tablicê stringów. 
	 * Dla ka¿dego wejœcia w tej tablicy sprawdzamy, czy jest obiekt o takiej nazwie
	 * w naszej liscie. Jesli jest - zwiekszamy jego pole "amount", jesli nie ma, dodajemy takiego burgera do listy
	 * 
	 * burgerFound pocz¹tkowo ustawiamy na false ( dla kazdego przebiegu pêtli musi byæ najpierw false,
	 * gdy¿ zak³adamy ¿e burgera nie znaleŸliœmy )
	 * 
	 * flagê burgerFound zmieniamy na true tylko jak znaleŸliœmy takiego samego burgera
	 */
	
	public void prepareOrder(String[] names){
		List<Burger> list = new ArrayList<Burger>();
		
		boolean burgerFound = false;
		//for every burger name in list
		for(String name : names){
			
			for(Burger burger : list){
				
				//if burger is already on the list increase its amount
				if(burger.getName().equals(name)){
					burger.increaseAmount();
					
					//Burger is found so there is no need to add it to the list
					burgerFound = true;
				}
			}
			
			if(!burgerFound){
				list.add(new SurfBurger(name));
			}
			//revert changes made to flag;
			burgerFound = false;
			
		}
		SurfBurgerUtils.placeOrder(list);
	}
}
