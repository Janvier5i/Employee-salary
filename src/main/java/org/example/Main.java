package org.example;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ContractorEmployee contractorEmployee = new ContractorEmployee(10.0, 24.0);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(250.0);
        ManagerEmployee managerEmployee = new ManagerEmployee(200.0, 140.0);


        Print.showSalary(contractorEmployee);
        Print.showSalary(fullTimeEmployee);
        Print.showSalary(managerEmployee);
    }
}
