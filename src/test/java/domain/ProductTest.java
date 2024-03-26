package domain;

import java.util.HashSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Product p1, p2;

    @BeforeEach
    public void setup() {
        p1 = new Product("상품1", 1000);
        p2 = new Product("상품1", 1000);
    }

    @Test
    public void testEquals() {
        Assertions.assertTrue(p1.equals(p1));
        Assertions.assertFalse(p1.equals(p2));
    }

    @Test
    public void testHashCode() {
        HashSet<Product> hashSet = new HashSet<>();
        hashSet.add(p1);
        Assertions.assertTrue(hashSet.contains(p1));
        Assertions.assertFalse(hashSet.contains(p2));
    }

}
