package entities.menuOP;

import entities.productData;
import entities.storage;

import java.util.HashMap;

public class Op2 {

    productData data = new productData();
    storage store = new storage();

    public static HashMap<Integer, productData> listing() {
        return storage.allProducts;
    }
    public static void printProducts() {

        for(Integer key : listing().keySet()) {
            storage.allProducts.get(key);
            System.out.println(storage.allProducts);
            System.out.println();
        }
    }


}
