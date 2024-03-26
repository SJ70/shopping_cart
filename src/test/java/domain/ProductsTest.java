package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductsTest {

    Products products;
    Product p1, p2;

    @BeforeEach
    public void setup() {
        products = new Products();
        p1 = new Product("상품1", 1000);
        p2 = new Product("상품2", 10000);
    }

    @Test
    public void testAddProduct() {
        products.addProduct(p1);
        products.addProduct(p2);
        Assertions.assertTrue(products.toString().contains(p1.toString()));
        Assertions.assertTrue(products.toString().contains(p2.toString()));
    }

    @Test
    public void testToString() {
        products.addProduct(p1);
        products.addProduct(p2);
        String expectedString = p1.toString() + '\n' + p2.toString();
        Assertions.assertEquals(expectedString, products.toString());
    }

}
