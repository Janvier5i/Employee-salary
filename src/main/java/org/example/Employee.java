package org.example;

public abstract class Employee {
    public Employee() {
    }

    public abstract void calculateSalary();

    public void showSalary(Employee employee) {
        employee.calculateSalary();
    }
}
