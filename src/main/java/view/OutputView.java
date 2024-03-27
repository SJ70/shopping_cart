package view;

import domain.Cart;
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

    public void printCartMenu() {
        print("[1] : 장바구니에 상품에 추가");
        print("[2] : 장바구니에서 상품 제거");
        print("[3] : 장바구니 상품 목록 출력");
    }

    public void printRequestAddCart() {
        print("추가하려는 상품 이름을 입력해주세요.");
    }

    public void printRequestRemoveCart() {
        print("제거하려는 상품 이름을 입력해주세요.");
    }

    public void printCartList(Cart cart) {
        print(cart.toString());
    }

    public void printBlankLine() {
        print("");
    }

}
