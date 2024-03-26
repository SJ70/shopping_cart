package domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Products {

    private Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public String toString() {
        return products.stream().map(Product::toString).collect(Collectors.joining("\n"));
    }

}
