

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class ReadRecipes {

	public static void main(String[] args) {
		
		
		ReadRecipes readRecipes = new ReadRecipes();
		
		final Collection<SimpleRecipe> recipes = readRecipes.loadRecipes("recipes.csv");

		System.out.println(recipes);
	}

	public Collection<SimpleRecipe> loadRecipes(String filename) {
		final File recipeFile = new File(filename);
		final Collection<SimpleRecipe> recipes = new ArrayList<>();

		final InputStream recipeStream;
		try {
			recipeStream = new FileInputStream(recipeFile);
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find the file: " + recipeFile.getAbsolutePath());
			return recipes;
		}

		try (Scanner userInput = new Scanner(recipeStream)) {
			while (userInput.hasNextLine()) {
				String[] items = userInput.nextLine().split(",");
				recipes.add(buildRecipe(items));
			}
		}

		return recipes;
	}
	
	public SimpleRecipe buildRecipe (String[]  items) {
		SimpleRecipe recipe = new SimpleRecipe();
		recipe.setName(items[0]);
		
		Collection<String> ingredients = new ArrayList<>();
		
		for (int i = 1; i < items.length; i++){
		recipe.addFruit(createFruit(items[1]));

		}
		return recipe;
		
	}

	
	private Object createFruit(String fruitName) {
		if("Cherry".equalsIgnoreCase(fruitName)){
			return new Cherry();
			} else if ("Mango".equalsIgnoreCase(fruitName)){
				return new Mango();
			}
		System.out.println();
		
//		switch (fruitName){
//			case "Banana":
//				return new Banana();
//			case "Mango":
//				return new Mango();
//			case "Orange":
//				return new Orange();
//			case "Cherry":
//				return new Cherry();		
		
		//return recipe;
		return fruitName;

//		recipe.setIngredients(ingredients);
//		
//		return recipe;
		
	}
	}

