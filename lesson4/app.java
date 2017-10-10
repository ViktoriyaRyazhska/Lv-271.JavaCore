package lesson4;

public class app {

	public static void main(String[] args) {
		Product product1 = new Product("Mars", 12.05, 128);
		Product product2 = new Product("Snickers", 11.10, 105);
		Product product3 = new Product("Twix", 12.55, 192);
		Product product4 = new Product("Bounty", 13.99, 98);
		if (product1.getPrice()>product2.getPrice() && product1.getPrice()>product3.getPrice() && product1.getPrice()>product4.getPrice()){
			System.out.println(" The most expensiv product is " + product1.getName() + ", its quantity is " +product1.getQuantity());
		}
		if (product2.getPrice()>product1.getPrice() && product2.getPrice()>product3.getPrice() && product2.getPrice()>product4.getPrice()){
			System.out.println(" The most expensiv product is " + product2.getName() + ", its quantity is " +product2.getQuantity());
		}
		if (product3.getPrice()>product1.getPrice() && product3.getPrice()>product2.getPrice() && product3.getPrice()>product4.getPrice()){
			System.out.println(" The most expensiv product is " + product3.getName() + ", its quantity is " +product3.getQuantity());
		}
		if (product4.getPrice()>product1.getPrice() && product4.getPrice()>product2.getPrice() && product4.getPrice()>product3.getPrice()){
			System.out.println(" The most expensiv product is " + product4.getName() + ", its quantity is " +product4.getQuantity());
		}
		if (product1.getQuantity()>product2.getQuantity() && product1.getQuantity()>product3.getQuantity() && product1.getQuantity()>product4.getQuantity()){
			System.out.println(" The biggest quantity has " +product1.getName());
		}
		if (product2.getQuantity()>product1.getQuantity() && product2.getQuantity()>product3.getQuantity() && product2.getQuantity()>product4.getQuantity()){
			System.out.println(" The biggest quantity has " +product2.getName());
		}
		if (product3.getQuantity()>product1.getQuantity() && product3.getQuantity()>product2.getQuantity() && product3.getQuantity()>product4.getQuantity()){
			System.out.println(" The biggest quantity has " +product3.getName());
		}
		if (product4.getQuantity()>product1.getQuantity() && product4.getQuantity()>product2.getQuantity() && product4.getQuantity()>product3.getQuantity()){
			System.out.println(" The biggest quantity has " +product4.getName());
		}
	}

}
