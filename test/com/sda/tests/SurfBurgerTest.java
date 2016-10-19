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
	 * Dostali�my zadanie zwr�cenia listy List<Burger> list, dostajemy zwyk�� tablic� string�w. 
	 * Dla ka�dego wej�cia w tej tablicy sprawdzamy, czy jest obiekt o takiej nazwie
	 * w naszej liscie. Jesli jest - zwiekszamy jego pole "amount", jesli nie ma, dodajemy takiego burgera do listy
	 * 
	 * burgerFound pocz�tkowo ustawiamy na false ( dla kazdego przebiegu p�tli musi by� najpierw false,
	 * gdy� zak�adamy �e burgera nie znale�li�my )
	 * 
	 * flag� burgerFound zmieniamy na true tylko jak znale�li�my takiego samego burgera
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
