package com.codey.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
  private List<Employee> employees;

  public EmployeeDatabase() {
    employees = new ArrayList<Employee>();
  }

  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public void removeEmployee(Employee employee) {
    employees.remove(employee);
  }

  public void getEmployees() {
    for (Employee employee : employees) {
      System.out.println(employee);
    }
  }
}
