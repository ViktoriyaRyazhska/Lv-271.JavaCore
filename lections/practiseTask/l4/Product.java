package PractiseTask.l4;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(){
	}
	public Product(String name){
		this.name= name;
	}
	
	public Product(double price) {
		this.price = price;
	}
	public Product(int quantity){
		this.quantity = quantity;
	}
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public static void theMostExpensive(Product price, Product... prices){
		double maxPrice = price.getPrice();
		for(Product prc: prices){
			if(prc.getPrice() > maxPrice){
				maxPrice = prc.getPrice();
			}
		}
		if(maxPrice == price.getPrice()){
			System.out.println("The most expensive product is: ");
			System.out.println(price.getName() + " " + price.getQuantity());
		}
		for (Product prc : prices){
			if(maxPrice == prc.getPrice()){
				System.out.println("The most expensive product is: ");
				System.out.println(prc.getName() + " " + prc.getQuantity());
			}
		}
		
	}

	public static void theBiggestQuantity(Product amount, Product... amounts){
		int maxAmount = amount.getQuantity();
		for(Product amo: amounts){
			if(amo.getQuantity() > maxAmount){
				maxAmount = amo.getQuantity();
			}
		}
		if(maxAmount == amount.getQuantity()){
			System.out.println("The biggest quantity has product named as: ");
			System.out.println(amount.getName());
		}
		for (Product amo: amounts){
			if(maxAmount == amo.getQuantity()){
				System.out.println("The biggest quantity has product named as: ");
				System.out.println(amo.getName());
			}
		}
		
	}
	
}
