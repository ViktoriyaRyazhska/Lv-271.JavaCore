
public class ProductRun {

	public static void main(String[] args) {
		Product pr1 = new Product("Apple", 5.90, 45);
		Product pr2 = new Product("Orange", 10.50, 73);
		Product pr3 = new Product("Milk", 25.0, 10);
		Product pr4 = new Product("Chees", 15.20, 4);
		
		if ((pr1.getPrice()>pr2.getPrice())&&(pr1.getPrice()>pr3.getPrice())&&(pr1.getPrice()>pr4.getPrice()))
		{
			System.out.println("The most expensiv product is " + pr1 + ", its quantity is " + pr1.getQuantity());
		}
		if ((pr2.getPrice()>pr1.getPrice())&&(pr2.getPrice()>pr3.getPrice())&&(pr2.getPrice()>pr4.getPrice()))
		{
			System.out.println("The most expensiv product is " + pr2 + ", its quantity is " + pr1.getQuantity());
		}
		if ((pr3.getPrice()>pr1.getPrice())&&(pr3.getPrice()>pr2.getPrice())&&(pr3.getPrice()>pr4.getPrice()))
		{
			System.out.println("The most expensiv product is " + pr3 + ", its quantity is " + pr1.getQuantity());
		}
		if ((pr4.getPrice()>pr1.getPrice())&&(pr4.getPrice()>pr2.getPrice())&&(pr4.getPrice()>pr3.getPrice()))
		{
			System.out.println("The most expensiv product is " + pr4 + ", its quantity is " + pr1.getQuantity());
		}
		
		
		if ((pr1.getQuantity()>pr2.getQuantity())&&(pr1.getQuantity()>pr3.getQuantity())&&(pr1.getQuantity()>pr4.getQuantity()))
				{
			System.out.println("The biggest quantity of " + pr1);
				}
		if ((pr2.getQuantity()>pr1.getQuantity())&&(pr2.getQuantity()>pr3.getQuantity())&&(pr2.getQuantity()>pr4.getQuantity()))
		{
			System.out.println("The biggest quantity of " + pr2);
		}
		if ((pr3.getQuantity()>pr1.getQuantity())&&(pr3.getQuantity()>pr2.getQuantity())&&(pr3.getQuantity()>pr4.getQuantity()))
		{
			System.out.println("The biggest quantity of " + pr3);
		}
		if ((pr4.getQuantity()>pr1.getQuantity())&&(pr4.getQuantity()>pr2.getQuantity())&&(pr4.getQuantity()>pr3.getQuantity()))
		{
			System.out.println("The biggest quantity of " + pr4);
		}
		
		
	}

}
