package HW5;

public class Car {
		String nameCar;
		int yearCar;
		int engineCapacity;
		
		Car(){}
		Car(String nameCar, int yearCar, int engineCapacity){
			this.nameCar=nameCar;
			this.yearCar=yearCar;
			this.engineCapacity=engineCapacity;
		}
		public String getNameCar() {
			return nameCar;
		}
		public void setNameCar(String nameCar) {
			this.nameCar = nameCar;
		}
		public int getYearCar() {
			return yearCar;
		}
		public void setYearCar(int yearCar) {
			this.yearCar = yearCar;
		}
		public int getEngineCapacity() {
			return engineCapacity;
		}
		public void setEngineCapacity(int engineCapacity) {
			this.engineCapacity = engineCapacity;
		}
		public static void getCarByYear(Car[] car, int year) {
			System.out.println("yearCar "+year+ " is");
			System.out.println("nameCar     yearCar     engineCapacity");
			for(int i=0; i<car.length; i++) {
				if (car[i].yearCar==year) {
					System.out.println(car[i].toString());
				}
			}
			
			System.out.println("  ");
		}
		public static void getCarByOrderYear(Car[] car) {
			Car carTemp=new Car();
			System.out.println("Car order by field year: ");
			System.out.println("nameCar     yearCar     engineCapacity");
			for(int i=0; i<car.length-1; i++) {
				for (int j=i+1; j<car.length; j++) {
					if (car[i].yearCar<car[j].yearCar) {
						carTemp=car[i];
						car[i]=car[j];
						car[j]=carTemp;
					}
				}
			}
			for (int i=0; i<car.length; i++) {
				System.out.println(car[i].toString());
			}
		}
		@Override
		public String toString() {
			return nameCar + "     " + yearCar + "     " + engineCapacity;
		}

		
}
