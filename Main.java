public class Main{
    public static void main(String[] args) {
        PayrollSystem payrollSystem=new PayrollSystem();
        FullTimeEmployee emp1=new FullTimeEmployee("Bob", 1, 100000.0);
        FullTimeEmployee emp2=new FullTimeEmployee("Rob", 2, 150000.0);
        FullTimeEmployee emp3=new FullTimeEmployee("Joy", 3, 200000.0);
        PartTimeEmployee emp4=new PartTimeEmployee("Emily", 4, 30, 1500);
        PartTimeEmployee emp5=new PartTimeEmployee("Nick", 5, 20, 1000);
        PartTimeEmployee emp6=new PartTimeEmployee("Caley", 6, 40, 1100);
        PartTimeEmployee emp7=new PartTimeEmployee("Bryer", 7, 60, 1200);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.addEmployee(emp5);
        payrollSystem.addEmployee(emp6);
        payrollSystem.addEmployee(emp7);


        System.out.println("Initial employee details:");
        payrollSystem.displayEmployee();

        System.out.println("Removing employee with id 2");
        payrollSystem.removeEmployee(2);
        payrollSystem.removeEmployee(4);

        System.out.println("Final employee details");
        payrollSystem.displayEmployee();
    }

}