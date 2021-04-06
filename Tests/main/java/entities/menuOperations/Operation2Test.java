package main.java.entities.menuOperations;

import main.java.entities.productData;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Operation2Test {

    productData data = new productData();

    @Test
    public void declareProduct(){
        data.setCode(123);
        data.setName("Meia");
        data.setPrice(20.0);
        data.setDescription("Uma meia");
        data.setQuantity(1);
        data.setCategory("Roupa");
        Operation2.allProducts.put(data.getCode(), data);
    }

    @Test
    public void testAddProduct(){
        declareProduct();
        assertEquals(data, Operation2.allProducts.get(123));

    }

}

