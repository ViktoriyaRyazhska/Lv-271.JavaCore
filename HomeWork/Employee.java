
public class Employee {
private  String name;
		private  int rate = 0;
		private  int hours = 0;
		
		
		static int totalSum = 0;
						
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRate() {
			return rate;
		}

		public void setRate(int rate) {
			this.rate = rate;
		}

		public int getHours() {
			return hours;
		}

		public void setHours(int hours) {
			this.hours = hours;
		}

		
		
	public Employee(String name, int rate, int hours) {
			this.name = name;
			this.rate = rate;
			this.hours = hours;
		}

	public Employee(String name, int rate) {
			
			this.name = name;
			this.rate = rate;
		}
	
	public Employee() {
		
	}

	
	public int salary =0;
	public int salary()
	{
		return rate*hours;
	}
		
	@Override
	public String toString() {
		return "Employee name is " + name + ", rate is " + rate + ", salary " + salary + ".";
	}

	
	public int changeRate(int rate) {
		return this.rate = rate;
	}
	
	public int bonuses = 0;
	public int bonuses() {
		return salary*10/100;
	}
	
	
	public static void main(String[] args) {
		
		
		
		

	}

}
