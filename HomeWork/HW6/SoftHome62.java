package HW6;

abstract class Employee implements  calculate{
    String employeeld;
}

interface calculate{
        int calculatePay();
}

class SalariedEmployee extends Employee {
        private String employeeld;
        private int socialSecurityNumber;
        private int theAverageMonthlySalary;
        private int hourlyRate;
        private int numberOfHoursWorked;

        public SalariedEmployee(){}
        public SalariedEmployee(String employeeld, int socialSecurityNumber, int theAverageMonthlySalary, int hourlyRate, int numberOfHoursWorked){
        this.employeeld=employeeld;
        this.socialSecurityNumber=socialSecurityNumber;
        this.theAverageMonthlySalary=theAverageMonthlySalary;
        this.hourlyRate=hourlyRate;
        this.numberOfHoursWorked=numberOfHoursWorked;

    }


    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getTheAverageMonthlySalary() {
        return theAverageMonthlySalary;
    }

    public void setTheAverageMonthlySalary(int theAverageMonthlySalary) {
        this.theAverageMonthlySalary = theAverageMonthlySalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }



        public int calculatePay() {
            theAverageMonthlySalary = hourlyRate * numberOfHoursWorked;
            return theAverageMonthlySalary;
        }

}


class ContractEmployee extends Employee {

        private String employeeld;
        private int federalTaxIdmember;
        private int theAverageMonthlySalary;
        private int fixedMonthlyPayment;

    public ContractEmployee(){}
    public ContractEmployee(String employeeld, int federalTaxIdmember, int theAverageMonthlySalary, int fixedMonthlyPayment){
        this.employeeld=employeeld;
        this.federalTaxIdmember=federalTaxIdmember;
        this.theAverageMonthlySalary=theAverageMonthlySalary;
        this.fixedMonthlyPayment=fixedMonthlyPayment;

    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getTheAverageMonthlySalary() {
        return theAverageMonthlySalary;
    }

    public void setTheAverageMonthlySalary(int theAverageMonthlySalary) {
        this.theAverageMonthlySalary = theAverageMonthlySalary;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public int calculatePay() {
            theAverageMonthlySalary = fixedMonthlyPayment;
            return theAverageMonthlySalary;
        }
}

public class SoftHome62 {
    public static void main(String[] args) {

        Employee emp = new SalariedEmployee("Ruslan", 2345667,0,37,7 );
        Employee emp2 = new SalariedEmployee("Oleg", 2344567,0,38,8 );
        Employee emp3 = new ContractEmployee("Ostap", 235790, 0,3200);
        Employee emp4 = new ContractEmployee("Miha", 235690, 0,3600);

        int[] tAMSs=new int[4];

        tAMSs[0]=emp.calculatePay();
        tAMSs[1]=emp2.calculatePay();
        tAMSs[2]=emp3.calculatePay();
        tAMSs[3]=emp4.calculatePay();

        int tmp;
        for (int i = 0; i <  tAMSs.length - 1; i++) {
            for (int j = i + 1; j <  tAMSs.length; j++) {
                if ( tAMSs[i] <  tAMSs[j]) {
                    tmp =  tAMSs[i];
                    tAMSs[i] =  tAMSs[j];
                    tAMSs[j] = tmp;
                }
            }
        }
        for (int i = 0; i <  tAMSs.length; i++) {
            System.out.println( tAMSs[i]);
        }

    }
}






