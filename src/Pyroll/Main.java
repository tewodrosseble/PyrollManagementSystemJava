package Pyroll;

public class Main {
    public static void main(String... args){
        System.out.println("\n\tPyroll Management System in Java\n");

        Engineer Abel = new Engineer("Abel", "T", "Engineer" ,22, 122.30);
        Manager Kebede = new Manager("Teshome", "B", "General Manager",12400);
        SalesManager Alem = new SalesManager("Alem", "W", "SalesManager",6000, 1230);

        Employee[] employees = new Employee[3];
        employees[0] = Abel;
        employees[1]= Kebede;
        employees[2]=Alem;
        for (int i=0;i<employees.length;i++){
            employees[i].printData();
        System.out.println("\n");
        }
    }
}
