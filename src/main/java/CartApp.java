import domain.Cart;
import domain.Product;
import domain.Products;
import view.InputView;
import view.OutputView;

public class CartApp {

    private static InputView inputView = new InputView();
    private static OutputView outputView = new OutputView();

    public static void main(String[] args) {

        // 상품 목록 생성
        Products products = new Products();

        outputView.printRequestInputProduct();
        while (true) {
            try {
                products.addProduct(inputView.inputProduct());
            }
            catch (IllegalArgumentException e) {
                break;
            }
        }

        // 상품 목록 확인
        outputView.printProducts(products);


        // 장바구니 생성
        Cart cart = new Cart();

        while (true) {
            outputView.printBlankLine();
            outputView.printCartMenu();
            switch (inputView.input()) {
                case "1" :
                    outputView.printRequestAddCart();
                    cart.addProduct(products.searchProduct(inputView.input()));
                    break;
                case "2" :
                    outputView.printRequestRemoveCart();
                    cart.removeProduct(products.searchProduct(inputView.input()));
                    break;
                case "3" :
                    outputView.printCartList(cart);
                    break;
            }
        }

    }
}
