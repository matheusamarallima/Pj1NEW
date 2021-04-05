package entities;

import entities.menuOP.Op1;
import entities.menuOP.Op2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {
    public static Scanner sc = new Scanner(System.in);
    public static void mainMenu() {

        /*Here we are going to present the menu to the user,
         *  that should use the console to add */

        int option = 0;


        System.out.println("-----------------------------");
        System.out.println("Press 1 to add a new product");
        System.out.println("Press 2 to list your products");
        System.out.println("Press 3 to search for a product");
        System.out.println("Press 0 to exit");
        System.out.println("------------------------------");


        do {
            try{
                option = Integer.parseInt(sc.nextLine());
            } catch
            (NumberFormatException | InputMismatchException a) {
                System.out.println("Sorry, you can only enter numbers in this selection :)");
            }


            switch(option) {
                case 1:
                    Op1 add = new Op1();
                    Op1.addProduct();
                    mainMenu();//dps chamar o menu
                    break;
                case 2:
                    Op2 list = new Op2();
                    Op2.printProducts();
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid");

            }

        }while(option != 0);
    }

}
