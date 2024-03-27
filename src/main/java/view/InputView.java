package view;

import domain.Product;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Product inputProduct() {
        String str = input();
        if (str.length() == 0) {
            throw new IllegalArgumentException();
        }
        String[] info = str.split(" : ");
        String name = info[0];
        int price = Integer.parseInt(info[1]);
        Product product = new Product(name, price);
        return product;
    }

    public String input() {
        try {
            return br.readLine();
        }
        catch (IOException e) {
            return "";
        }
    }

}
