package PractiseTask.l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integers numb = new Integers();
		numb.inputIntegers(br);
		numb.theBiggestNumb(numb.getNumbers());
		numb.sumOfPossitive(numb.getNumbers());
		numb.negativeAmmount(numb.getNumbers());
		Employee worker = new Employee("Oleg", 1, 56.84);
		Employee worker1 = new Employee("Andriy", 1, 74.65);
		Employee worker2 = new Employee("Vlad", 2, 65.41);
		Employee worker3 = new Employee("Anton", 3, 69.44);
		Employee worker4 = new Employee("Rostyk", 2, 54.22);
		certainDep(2, worker, worker1, worker2, worker3, worker4);
		salaryDescending(worker, worker2, worker3, worker4);
		
		
	}
	public static void certainDep(int dep, Employee... worker){
		System.out.println("Employees from " + dep + " department");
		for(int i = 0; i<worker.length; i++){
			if(worker[i].getDepartmnet() == dep){
				System.out.println(worker[i]);
			}
		}
	}
	public static void salaryDescending(Employee... worker){
		double container;
		System.out.println("Descending salary:");
		for(int i = 0; i<worker.length-1; i++){
			for( int j = i+1; j<worker.length; j++){
				if(worker[i].getSalary()< worker[j].getSalary()){
				container = worker[i].getSalary();
				worker[i].setSalary(worker[j].getSalary());
				worker[j].setSalary(container);
				}
			}
		}
		for(int i = 0; i< worker.length; i++){
		System.out.println(worker[i]);
		}
	}
}
