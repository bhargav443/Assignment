package com.AutomateEmployee.employe;

import java.util.List;
import java.util.Scanner;

    public class Employee {
        public static List<Employee> arrayList;
        private String Name;
            private double Salary;
            private byte Age;
            private int ID;

        @Override
        public String toString() {
            return "Employee{" +
                    "Name='" + Name + '\'' +
                    ", Salary=" + Salary +
                    ", Age=" + Age +
                    ", ID='" + ID + '\'' +
                    '}';
        }
        static int i=1;
        public Employee(String name, double salary, byte age, int ID) {
            this.Name = name;
            this.Salary = salary;
            this.Age = age;
            this.ID = i++;
        }

            public static Employee addEmployee () {
                Scanner scanner = new Scanner(System.in);
                String name = getString("enter your full name", scanner.nextLine());
                double salary = getSalary(scanner);
                byte age = getAge(scanner);
                return getEmployee(scanner, name, salary, age);
            }


            public boolean isDataValid () {
                boolean isValid = true;
                if (Age < 0) {
                    System.out.println("Age not valid");
                    isValid = false;
                }
                for (int i = 0; i < Name.length(); i++) {
                    char c = Name.charAt(i);
      /* if (!isAnAlphabet(c)) {
            System.out.println("name is not valid");
            isValid = false;
            break;

        }*/
                }
                if (Salary < 0) {
                    System.out.println("salary is not valid");
                    isValid = false;
                }
                return isValid;
            }
            private static Employee getEmployee (Scanner scanner, String name,double salary, byte age){
                String id = getString("enter your id", scanner.next());
                Employee employee1 = new Employee(name, salary, age,2);
                return employee1;
            }

            private static byte getAge (Scanner scanner){
                System.out.println("enter age");
                byte age = scanner.nextByte();
                return age;
            }

            private static double getSalary (Scanner scanner){
                System.out.println("enter you salary");
                double salary = scanner.nextDouble();
                return salary;
            }

            private static String getString (String s, String s2){
                System.out.println(s);
                return s2;
            }

        public double getSalary() {

            return Salary;
        }

        public byte getAge() {
            return Age;
        }

        public String getName() {
            return Name;
        }
    }



































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































