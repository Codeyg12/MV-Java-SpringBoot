package com.codey.employeemanagement;

public class SalesPerson extends Employee {
  int salesTarget;

  public SalesPerson(int employeeId, String name, int age, String jobTitle, int salary, int salesTarget) {
    super(employeeId, name, age, jobTitle, salary);
    this.salesTarget = salesTarget;
  }


  public void setSalesTarget(int salesTarget) {
    this.salesTarget = salesTarget;
  }
}
