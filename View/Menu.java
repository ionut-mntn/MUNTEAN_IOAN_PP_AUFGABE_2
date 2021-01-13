package View;

import java.util.Scanner;

public class Menu {

    private void mainMenu(){
        System.out.println("1. Add task");
        System.out.println("2. Remove task");
        System.out.println("3. Change task");
        System.out.println("4. See all tasks");
    }

    private int getUserOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your option: ");
        return Integer.parseInt(sc.next());
    }

    private String getTaskName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of task:");
        return sc.nextLine();
    }



}
