package domain;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Cart {

    private Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, int count) {
        this.products.put(product, getCountOfProduct(product) + count);
    }

    public void addProduct(Product product) {
        this.products.put(product, getCountOfProduct(product) + 1);
    }

    public void removeProduct(Product product, int count) {
        int resultCount = getCountOfProduct(product) - count;
        if (resultCount <= 0) {
            removeProduct(product);
            return;
        }
        this.products.put(product, resultCount);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public int getCountOfProduct(Product product) {
        return products.getOrDefault(product, 0);
    }

    public String toString() {
        return products.entrySet()
                .stream()
                .map(entry -> String.format("%s : %d", entry.getKey().getName(), entry.getValue()))
                .collect(Collectors.joining("\n"));
    }

}
