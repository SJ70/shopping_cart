package domain;

import java.util.UUID;

public class Product {

    private UUID id;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        return this.id == ((Product)obj).id;
    }

    public int hashCode() {
        return id.hashCode();
    }

}
