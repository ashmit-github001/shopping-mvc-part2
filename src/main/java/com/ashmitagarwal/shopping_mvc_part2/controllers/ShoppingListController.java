package com.ashmitagarwal.shopping_mvc_part2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashmitagarwal.shopping_mvc_part2.models.ShoppingListDTO;

@Controller
@RequestMapping("/shopping")
//@SessionAttributes("username") // Not advisable - Use SessionAttribute // Best way - HttpSession
public class ShoppingListController {

	@PostMapping("/saveShoppingList")
	public String saveShoppingList(@ModelAttribute("shoppingList") ShoppingListDTO shoppingList) {

		String itemName = shoppingList.getItemName();
		String itemType = shoppingList.getItemType();
		String itemPrice = shoppingList.getItemPrice();

		System.out.println(itemName);
		System.out.println(itemType);
		System.out.println(itemPrice);

		return "DisplayShoppingListPage";
	}
}
