import domain.Cart;
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

        }

        // TODO: 상품을 장바구니에 추가
        // TODO: 상품을 장바구니에서 제거
        // TODO: 장바구니에 현재 담긴 상품들을 출력 (상품이름, 각 상품의 갯수)

    }
}
