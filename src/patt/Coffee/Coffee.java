package patt.Coffee;

import java.util.ArrayList;

import patt.Coffee.CoffeeFactory.Ingredient;
import patt.Coffee.CoffeeFactory.Type;

public class Coffee {
	Type type;
	double cost;
	ArrayList<Ingredient> ingredients;

	public Coffee(ArrayList<Ingredient> ingredients, Type type) {
		this.type = type;
		this.ingredients = ingredients;
	}

	public double getCost() {
		double total = 0;
		for (Ingredient ing : ingredients) {
			total+=ing.getCost();
		}
		this.cost = total;
		return cost;
	}

	public double getPrice() {
		return type.getPrice();
	}

	public String listIngredients() {
		String string = "";
		for (Ingredient ingredient : ingredients) {
			string += ingredient;
			string += "\n";
		}
		return string;
	}
}