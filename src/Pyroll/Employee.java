package Pyroll;

public class Employee {
    private String firstname;
    private String lastname;
    private String jobtitle;

    public Employee(String fname, String lname, String job){
        firstname=fname;
        lastname=lname;
        jobtitle = job;
    }

    public void printData(){
        System.out.println("Full Name : "+firstname + " "+ lastname + "\n" + "Job Title : " + jobtitle);
    }
}
