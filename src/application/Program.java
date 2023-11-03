package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee>list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
		System.out.println("Employee #" + i + " data: ");
		System.out.println("Outsourced (y/n)?");
		char ch = sc.next().charAt(0);
		System.out.println("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Hours: ");
		int hours = sc.nextInt();
		System.out.println(" Value per hour: ");
		double valuePerHour = sc.nextDouble();
		
		
		if(ch =='y') {
			System.out.println("Additional charge: ");
			double additionalCharge = sc.nextDouble();
			Employee emp = new OutsourcedEmployee( additionalCharge,name, hours, valuePerHour);// temm que ser na ordem do que foi constuido
			list.add(emp);
		}
		else {
			//Employee emp = new Employee(name, hours, valuePerHour);
			list.add(new Employee(name, hours, valuePerHour)); // pode fazer a chamada dentro do adicionar a lista
		
		}
		
		
		}
		
		System.out.println();
		System.out.println("Payments: ");
		for(Employee emp: list) { // para cara funcionario que tiver na lista
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		
		
		
		
		sc.close();
	}

}