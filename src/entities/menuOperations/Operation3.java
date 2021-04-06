package entities.menuOperations;

import entities.productData;

import java.util.Scanner;

import static entities.menu.mainMenu;

public class Operation3 {

    public static void googleSearch() {
        Scanner sc = new Scanner(System.in);
        productData data = new productData();

        /* In this method there will be a search using an hash map that is allocated
         * in the Program, therefore we a going to make a for each that will allocate
         * the informations on store1 and then print the information that is acquired */


        String search;
        System.out.println("Type the NAME of the product you wanna search for: ");
        search = sc.nextLine();

        for (Integer key : Operation2.allProducts.keySet()) {
            productData store1 = Operation2.allProducts.get(key);

            System.out.println();

            if (store1.getName().equals(search)) {
                System.out.println("The name of the product is: " + store1.getName() +
                        " and the price is: " + store1.getPrice()
                        + " and its described as: " + store1.getDescription());
                System.out.println();
            } else {
                System.err.println("The selected product doesn't exist");
            }
            mainMenu();
        }
    }

}