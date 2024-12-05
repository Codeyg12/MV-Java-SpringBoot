package com.codey.employeemanagement;

import java.util.Scanner;

public class EmployeeInput {
  public static Employee selectEmployeeType() {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Please enter the employee type (Manager or Salesperson): ");
      String employeeType = scanner.nextLine();
      employeeType = employeeType.toLowerCase();
      System.out.println("Please enter employee id: ");
      int employeeId = scanner.nextInt();
      scanner.nextLine(); // Consume newline
      System.out.println("Please enter employee name: ");
      String employeeName = scanner.nextLine();
      System.out.println("Please enter employee age: ");
      int employeeAge = scanner.nextInt();
      scanner.nextLine(); // Consume newline
      System.out.println("Please enter employee job title: ");
      String employeeJobTitle = scanner.nextLine();
      System.out.println("Please enter employee salary: ");
      int employeeSalary = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      return switch (employeeType) {
        case "manager" -> createManager(employeeId, employeeName, employeeAge, employeeJobTitle, employeeSalary);
        case "salesperson" ->
            createSalesperson(employeeId, employeeName, employeeAge, employeeJobTitle, employeeSalary);
        default -> {
          System.out.println("Invalid employee type");
          yield null;
        }
      };
    } finally {
      scanner.close();
    }
  }

  public static Manager createManager(int employeeId,
                                      String employeeName,
                                      int employeeAge,
                                      String employeeJobTitle,
                                      int employeeSalary) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Please enter employee department: ");
      String departmentName = scanner.nextLine();

      return new Manager(employeeId, employeeName, employeeAge, employeeJobTitle, employeeSalary, departmentName);
    }
  }

  private static SalesPerson createSalesperson(int employeeId,
                                               String employeeName,
                                               int employeeAge,
                                               String employeeJobTitle,
                                               int employeeSalary) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Please enter employee sales target: ");
      int salesTarget = scanner.nextInt();

      return new SalesPerson(employeeId, employeeName, employeeAge, employeeJobTitle, employeeSalary, salesTarget);
    }
  }
}