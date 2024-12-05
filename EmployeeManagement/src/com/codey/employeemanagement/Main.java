package com.codey.employeemanagement;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    EmployeeDatabase db = new EmployeeDatabase();

//    Manager manager = new Manager(1, "Mr. Clean", 66, "Cleaning Manager", 200000, "Janitorial");
//    Manager manager2 = new Manager(3, "Carl Carlson", 26, "Sales Manager", 2000000, "Sales");
//    SalesPerson salesPerson = new SalesPerson(2, "John Johnson", 19, "Salesperson", 45000, 80000);

//    db.addEmployee(manager);
//    db.addEmployee(manager2);
//    db.addEmployee(salesPerson);
//    db.getEmployees();
//
//    db.removeEmployee(manager2);
//    db.getEmployees();

    Scanner scanner = new Scanner(System.in);
    System.out.println("What would you like to do, add an employee or view all? (add or view): ");
    String answer = scanner.nextLine();

    if (answer.equalsIgnoreCase("add")) {
      db.addEmployee(EmployeeInput.selectEmployeeType());
    } else if (answer.equalsIgnoreCase("view")) {
      db.getEmployees();
    } else {
      System.out.println("Have a good day!");
    }
  }
}
