package Pyroll;

public class SalesManager extends Manager{
    private double bonus;
    public SalesManager(String fname, String lname, String job, double salary, double bon){
        super(fname, lname, job, salary);
        bonus= bon;
    }
    public double getpay(){
        return super.getpay() + bonus;
    }
    public void printData(){
        super.printData();
        System.out.println("Monthly payment is : "+ getpay());
    }
}
