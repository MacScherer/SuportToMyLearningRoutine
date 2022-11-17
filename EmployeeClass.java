package com.example.testenviroment;

public class Employee {
    String Name;
    Double Salary;

    public Double retrieveSalary(double Bonus, double Taxes){
        this.Salary = this.Salary - (this.Salary * 0.1); // 10% less
        return this.Salary + Bonus - Taxes;

        //System.out.println(this.Salary); // this = this class properties
    }
}
