package com.RequestHandler;
import com.AutomateEmployee.employe.Employee;
import Menu.Menu;
import javax.naming.Name;

public class EmployeeFlow {
    public  void employeMenu() {
        boolean breakOut = false;
        while (breakOut == false) {
            Menu menu=new Menu();
            final int choice1 = Menu.getChoice();
            switch (choice1) {
                case 1:
                    employeeDetails();
                    break;
                case 2:
                    System.out.println("Delete employee");
                    break;
                case 3:
                    System.out.println("employee salary");
                    break;
                case 4:
                    System.out.println("you choose to exit");
                    breakOut = true;
                    break;
                case 5:
                    System.out.println("you choose project");
                    Projectflow projectflow = new Projectflow();
                    System.out.println(Projectflow.projectMenu());
                case 6:
                    System.out.println("you chose sorting employee");
                    Menu.sorting();
                default:
                    System.out.println("option not available");
                    break;
            }
            }
        }
    private static void employeeDetails() {
        System.out.println("enter new employee details");
        Employee.addEmployee();
    }

}
