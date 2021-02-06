package com.Repository;

import Menu.Menu;
import com.AutomateEmployee.employe.Employee;

import java.util.*;

public abstract class Sortingemployee implements Comparator<Employee> {

public static int sortByName(){

    Collections.sort(Employee.arrayList, new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());

        }
    });
    return 0;
}
public static int sortByage(){
    Collections.sort(Employee.arrayList, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getAge()>o2.getAge())
                return 1;
            else if (o1.getAge()<o2.getAge())
                return -1;
            else
                return 0;
        }
    });
    return 0;
}
public static int sortBysalary(){
    Collections.sort(Employee.arrayList, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getSalary()> o2.getSalary())
            return 1;
            else if(o1.getSalary()<o2.getSalary())
                return -1;
            else
                return 0;
        }
    });
    return 0;
}
}

