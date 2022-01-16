package Pyroll;

public class Engineer extends Employee{
    double hours;
    double wage;
    public Engineer(String fname, String lname, String job, double hour, double rate){
        super(fname, lname, job);
        hours = hour;
        wage = rate;
    }
    public double getpay(){
        return wage * hours;
    }
    public void printData(){
        super.printData();
        System.out.println("The total Wage is : "+ getpay());
    }
}
