package domain;

import java.util.HashMap;

public class Cart {

    private HashMap<Product, Integer> products;

    public Cart() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product, int count) {
        this.products.put(product, getCountOfProduct(product) + count);
    }

    public void addProduct(Product product) {
        this.products.put(product, getCountOfProduct(product) + 1);
    }

    public int getCountOfProduct(Product product) {
        return products.getOrDefault(product, 0);
    }

}
