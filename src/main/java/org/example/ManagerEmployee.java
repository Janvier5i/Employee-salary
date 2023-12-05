package org.example;
public class ManagerEmployee extends FullTimeEmployee {
    private double managerBonus;

    public ManagerEmployee(double FixedSalary, double managerBonus) {
        super(FixedSalary);
        this.managerBonus = managerBonus;
    }

    public double getManagerBonus() {
        return this.managerBonus;
    }

    public void setManagerBonus(double managerBonus) {
        this.managerBonus = managerBonus;
    }

    public void calculateSalary() {
        double managerSalary = this.managerBonus + this.getFixedSalary();
        System.out.println("manager: " + managerSalary);
    }
}
