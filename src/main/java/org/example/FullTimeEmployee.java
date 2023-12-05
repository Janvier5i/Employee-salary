package org.example;

public class FullTimeEmployee implements Employee {
    private double fixedSalary;

    public FullTimeEmployee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() {
        return this.fixedSalary;
    }

    public void calculateSalary() {
        System.out.println("fullTime employee: " + this.getFixedSalary());
    }
}
