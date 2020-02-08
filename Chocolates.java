package Epam.Task2;

public class Chocolates implements Comparable<Chocolates>,Candy {
     

   private String name;
   private double weight;
   private int price;
   
 

public Chocolates(String name,int price, double weight ) {

	this.price=price;
	this.name = name;
	this.weight = weight;

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
public int compareTo(Chocolates o) {
	if(this.weight >= o.weight)
		return 1;
	else
		return -1;
	}




}
