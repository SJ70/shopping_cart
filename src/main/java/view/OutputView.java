package view;

import domain.Products;

public class OutputView {

    public void print(String str) {
        System.out.println(str);
    }

    public void printRequestInputProduct() {
        print("상품 목록을 입력해주세요. (예: 상품 1 : 1000) \n빈 문자열 입력 시 입력 종료");
    }

    public void printProducts(Products products) {
        print("고유한 상품 목록:");
        print(products.toString());
    }

}
