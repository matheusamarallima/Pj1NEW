package main.java.entities;

import main.java.entities.menuOperations.Operation1;
import main.java.entities.menuOperations.Operation2;

import java.util.InputMismatchException;
import java.util.Scanner;

import static main.java.entities.menuOperations.Operation3.googleSearch;

public class menu {
    public static Scanner sc = new Scanner(System.in);

    public static void mainMenu() {

        /*Here we are going to present the menu to the user,
         *  that should use the console to add products */

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
                    Operation1 add = new Operation1();
                    Operation1.addProduct();
                    mainMenu();
                    break;
                case 2:
                    Operation2 list = new Operation2();
                    Operation2.printProducts();
                    mainMenu();
                    break;
                case 3:
                    googleSearch();
                    mainMenu();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Invalid");

            }




        }while(option != 0);
    }


    public static void exit() {

        /*This method is a simple exit way*/

        System.out.println("Goodbye");
    }


}


