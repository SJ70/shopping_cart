package domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Products {

    private Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product searchProduct(String name) {
        return products.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 상품명"));
    }

    public String toString() {
        return products.stream().map(Product::toString).collect(Collectors.joining("\n"));
    }

}
