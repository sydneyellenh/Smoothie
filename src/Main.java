

import java.awt.List;
import java.util.ArrayList;

public class Main{

	public static void main(String[] args) {
		
//		Collection<Fruit> fruit = new ArrayList<>();
//		fruit.add(new Orange());
//		fruit.add(new Mango());
//		Recipe smoothieOne = new Recipe("Orange-Mango", fruit);
		List<Fruit> fruit = new ArrayList<>();
		
		Recipe smoothieOne = new Recipe("Orange-Mango");
		smoothieOne.addFruit(new Orange());
		smoothieOne.addFruit(new Mango());		
		
		Recipe smoothieTwo = new Recipe("Banana-Cherry");
		smoothieTwo.addFruit(new Banana());
		smoothieTwo.addFruit(new Cherry());
	
		smoothieOne.addFruit(fruit.get(0));
		smoothieOne.addFruit(fruit.get(1));

		
	}

}
