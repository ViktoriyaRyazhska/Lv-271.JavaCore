package com.company.lesson6.Empl;

public class ContractEmployee extends Employee {

    private long federalTaxIdmember;
    private int rate;
    private int hoursWorked;
    private String name;
    private int salary;


    @Override
    public int calculatePay() {
        this.salary = rate*hoursWorked;
        return salary = rate*hoursWorked;
    }


    public ContractEmployee(long federalTaxIdmember, int rate, int hoursWorked, String name, String employeeid){
        this.rate = rate;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.emploeeId = employeeid;

        calculatePay();

    }

    @Override
    public String toString() {
        return "ContractEmployee: " +
                "employeeId='" + this.emploeeId + '\'' +
                ", name='" + name + '\'' +
                ", wage = " + salary;
    }

    public long getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(long federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
