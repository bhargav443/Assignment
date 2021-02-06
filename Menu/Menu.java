package Menu;

import java.util.Scanner;
import com.Repository.Sortingemployee;
public class Menu {
    public static void extracted(){
        System.out.println("choose an option");
        System.out.println("1.enter new project details");
        System.out.println("2. List projects");
        System.out.println("3.To add employes to the project");
        System.out.println("4. To remove employees from the project");
        System.out.println("5.To delete project");
        System.out.println("6.To list employees of the project");
        System.out.println("7.you choose to exist1");
    }
    public static int getChoice(){
        System.out.println("choose an option");
        System.out.println("1.enter new employee details");
        System.out.println("2.delete employee");
        System.out.println("3.employee salary");
        System.out.println("4.you choose to exist");
        System.out.println("5.enter project details");
        System.out.println("6.enter sorting details");
        Scanner scanner = new Scanner(System.in);
        int choice1 = scanner.nextInt();
        return choice1;
    }
    public static void sorting(){
        System.out.println("1.sort by employe name");
        System.out.println("2.sort by emoploye age");
        System.out.println("3.sort by employe salary");
                Scanner scanner3=new Scanner(System.in);
                int choice3=scanner3.nextInt();
                switch (choice3){
                    case 1:
                        System.out.println("sort employe by name");
                        System.out.println(Sortingemployee.sortByName());
                        break;
                    case 2:
                        System.out.println("sort employe age");
                        System.out.println(Sortingemployee.sortByage());
                        break;
                    case 3:
                        System.out.println("sort employe by salary");
                        System.out.println(Sortingemployee.sortBysalary());
                        break;
                    case 4:
                        System.out.println("you choose to exit");
                        break;
                }
            }
}

