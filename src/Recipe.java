
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Recipe {
	String name;
	ArrayList <Fruit>fruityIngredients = new ArrayList<>();
	
	public Recipe (String name)
	{
		fruityIngredients = new ArrayList<>();
		this.name = name;
	}
	
	public void addFruit(Fruit fruit){
		fruityIngredients.add(fruit);
	}
	
	public void showRecipe(){
		for(int i = 0; i < fruityIngredients.size(); ++i){
			((Fruit) fruityIngredients.get(i)).getName();
			System.out.println("");
		}
	}
	
	}
		
		
