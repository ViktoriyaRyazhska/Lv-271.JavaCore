package com.company.lesson6.Empl;

public class SalariedEmployee extends Employee{

    private long socialSecurityNumber;
    private int salary;
    private String name;

    @Override
    public int calculatePay(){
        return salary;
    }

    public SalariedEmployee(long socialSecurityNumber, int salary, String name, String emploeeId){
        this.salary = salary;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.emploeeId = emploeeId;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                "employeeId=" + this.emploeeId +
                ", payment=" + salary +
                ", name='" + name ;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getPayment() {
        return salary;
    }

    public void setPayment(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
