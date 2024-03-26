package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartTest {

    Cart cart;
    Product p1, p2;

    @BeforeEach
    public void setup() {
        cart = new Cart();
        p1 = new Product("상품1", 1000);
        p2 = new Product("상품2", 10000);
    }

    @Test
    public void testAddAndCount() {
        Assertions.assertEquals(0, cart.getCountOfProduct(p1));
        cart.addProduct(p1);
        Assertions.assertEquals(1, cart.getCountOfProduct(p1));
        cart.addProduct(p1, 2);
        Assertions.assertEquals(3, cart.getCountOfProduct(p1));
    }

    @Test
    public void testRemoveAndCount() {
        cart.addProduct(p1, 10);
        cart.removeProduct(p1, 2);
        Assertions.assertEquals(8, cart.getCountOfProduct(p1));
        cart.removeProduct(p1);
        Assertions.assertEquals(0, cart.getCountOfProduct(p1));
    }

}
