package main.java.entities.menuOperations;

import com.sun.corba.se.spi.orb.Operation;
import main.java.entities.productData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Operation3Test {

    productData data = new productData();

    @Test
    public void declareProduct(){
        data.setCode(123);
        data.setName("Meia");
        data.setPrice(20.0);
        data.setDescription("Uma meia");
        data.setQuantity(1);
        data.setCategory("Roupa");
        Operation2.allProducts.put(data.getName(), data);
    }
    @Test
    public void shouldReturnTheSearch(){
        declareProduct();

    }
}