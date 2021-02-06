package com.AutomateEmployee;

import com.AutomateEmployee.employe.Employee;
import com.AutomateEmployee.employe.Project;
import com.RequestHandler.EmployeeFlow;
import com.RequestHandler.Projectflow;
import com.Repository.Sortingemployee;

import javax.naming.Name;
import java.util.ArrayList;

public class Main {

            public static void main(String[] args) {
                ArrayList<Employee> arrayList=new ArrayList<>();
                EmployeeFlow employeeFlow=new EmployeeFlow();
                employeeFlow.employeMenu();
                Employee employee=new Employee("bhargav",222.22,(byte) 22,1);
                arrayList.add(employee.addEmployee());

                ArrayList<Project> arrayList1=new ArrayList<>();
                Projectflow projectflow=new Projectflow();
                projectflow.projectMenu();
                Project project=new Project();
                arrayList1.add(project.addProject());

                System.out.println(Sortingemployee.sortByName());
                System.out.println(Sortingemployee.sortByage());
                System.out.println(Sortingemployee.sortBysalary());
            }
        }



