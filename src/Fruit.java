

public class Fruit implements Ingredient{
	
	
	private String name;
	private String color;
	private double weight;
	private String origin;
	
	public Fruit(String name, String color, String origin, double weight)
	{
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
	}
	
	public void getName() {
		System.out.println(this.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	
}
