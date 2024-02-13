package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Aula161 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> employees = new ArrayList<Employee>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nEmplyee #" + i + " data");
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double vph = sc.nextDouble();
			
			System.out.print("Outsourced? (y/n) ");
			char os = sc.next().charAt(0);
			
			if (os == 'y') {
				System.out.print("Additional charge: ");
//				double ac = sc.nextDouble();
//				Employee outsourced = new OutsourcedEmployee(name, hours, vph, ac);
//				employees.add(outsourced);
				employees.add(new OutsourcedEmployee(name, hours, vph, sc.nextDouble()));
			} else {
//				Employee employee = new Employee(name, hours, vph);
//				employees.add(employee);
				employees.add(new Employee(name, hours, vph));
			}
		}
		
		System.out.println("\nPayment");
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}