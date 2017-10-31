package com.company.lesson6.Empl;

public class Employee implements PayInterface {

    public String emploeeId;


    @Override
    public int calculatePay() {
        return 0;
    }

    public String getEmploeeId() {
        return emploeeId;
    }

    public void setEmploeeId(String emploeeId) {
        this.emploeeId = emploeeId;
    }
}
