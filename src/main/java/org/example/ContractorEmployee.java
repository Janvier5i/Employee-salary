package org.example;


public class ContractorEmployee extends Employee {
    private double hours;
    private double rate;

    public ContractorEmployee(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours() {
        return this.hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void calculateSalary() {
        double contractPay = this.hours * this.rate;
        System.out.println("contractor: " + contractPay);
    }
}
