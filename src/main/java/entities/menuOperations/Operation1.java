package main.java.entities.menuOperations;

import main.java.entities.menu;
import main.java.entities.productData;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation1 {

    public static void addProduct(){
    Scanner sc = new Scanner(System.in);
    menu mn = new menu();
    productData data = new productData();

        System.out.println("You choosed to add a new product to the list");
        System.out.println("______________________________________________");
        System.out.println("Please enter the product code");

        try {
            data.setCode(Integer.parseInt(sc.nextLine()));
        }
        catch (NumberFormatException a) {
            System.out.println("Please, enter only numbers");
            menu.mainMenu();
        }
        catch (InputMismatchException b) {
            System.out.println("Please, enter only numbers");
            menu.mainMenu();
        }


        System.out.println("______________________________________________");
        System.out.println("Please enter the product name");
        data.setName(sc.nextLine());
        System.out.println("______________________________________________");
        System.out.println("Please enter the price of the product");


        try {
            data.setPrice(Double.parseDouble(sc.nextLine()));
        }
        catch (NumberFormatException c) {
            System.out.println("Please, enter only numbers");
            menu.mainMenu();
        }
        catch (InputMismatchException d) {
            System.out.println("Please, enter only numbers");
            menu.mainMenu();
        }


        System.out.println("______________________________________________");
        System.out.println("Please enter the description of the product");
        data.setDescription(sc.nextLine());
        System.out.println("______________________________________________");
        System.out.println("Please enter the quantity of the chosen product");


        try {
            data.setQuantity(Integer.parseInt(sc.nextLine()));
        }
        catch (NumberFormatException e) {
            System.out.println("Please, enter only numbers");
            menu.mainMenu();
        }
        catch (InputMismatchException f) {
            System.out.println("Please, enter only numbers");
            menu.mainMenu();
        }

        System.out.println("______________________________________________");
        System.out.println("Please enter the product's category");
        data.setCategory(sc.nextLine());

        Operation2.allProducts.put(data.getCode(), data);

    }



}
