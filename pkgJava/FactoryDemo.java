package pkgJava;

import java.util.Scanner;

interface Food {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {

	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory {
	public Food getFood(String order) {

		if (order.equals("cake"))
			return new Cake();
		else
			return new Pizza();

	}// End of getFood method

}// End of factory class

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// creating the factory
		FoodFactory foodFactory = new FoodFactory();

		// factory instantiates an object
		Food food = foodFactory.getFood(sc.nextLine());

		sc.close();
		System.out.println("The factory returned " + food.getClass());
		System.out.println(food.getType());

	}

}
