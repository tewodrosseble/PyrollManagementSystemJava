package Pyroll;

public class Manager extends Employee{
    private double salary;
  public Manager(String fname, String lname, String job, double sal){
      super(fname, lname, job);
      salary = sal;
  }

  public double getpay(){
      return salary;
  }
  public void printData(){
      super.printData();
      System.out.println("The Salary is : "+ getpay());
  }


}
