package Epam.Task2;



public class Sweets implements Comparable<Sweets> , Candy{

	
      private String name;
      private double weight;
      private int price;
      
      private int flavour;
      
	
	public Sweets(String name, double weight,int price) {
		
		this.name = name;
		this.weight = weight;
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int compareTo(Sweets o) {
		if(this.weight >= o.weight)
			return 1;
		else
			return -1;
		}
	
      
	
}
