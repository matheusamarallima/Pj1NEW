package entities.menuOperations;

import entities.productData;

import java.util.HashMap;

public class Operation2 {

    public static HashMap<Integer, productData> allProducts = new HashMap<>();


    productData data = new productData();

    public static HashMap<Integer, productData> listing() {
        return allProducts;
    }
    public static void printProducts() {

        for(Integer key : listing().keySet()) {
            allProducts.get(key);
            System.out.println(allProducts);
            System.out.println();
        }
    }


}
