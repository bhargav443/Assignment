
    package com.RequestHandler;

import Menu.Menu;
import com.AutomateEmployee.employe.Project;

import java.util.Scanner;

    public class Projectflow {
        public static Object projectMenu() {
            boolean breakOut1 = false;
            while (breakOut1 == false) {
                Menu menu=new Menu();
                Menu.extracted();
                Scanner scanner2 = new Scanner(System.in);
                int choice2 = scanner2.nextInt();
                switch (choice2) {
                    case 1:
                        newProject();
                        break;
                    case 2:
                        System.out.println("List projects");
                        break;
                    case 3:
                        System.out.println("To add employes to the project");
                        break;
                    case 4:
                        System.out.println("To remove employees from the project");
                        break;
                    case 5:
                        System.out.println("To delete project");
                        break;
                    case 6:
                        System.out.println("To list employees of the project");
                        break;
                    case 7:
                        System.out.println("you choose to exist1");
                        breakOut1 = true;
                        break;
                    default:
                        System.out.println("option not available");
                        break;
                }
            }
            return null;
        }

        private static void newProject() {
            System.out.println("enter new project details");
            Project project = new Project();
            project.addProject();
        }


    }


