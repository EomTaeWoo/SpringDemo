package hello.demo.order;

public interface OrderService {
    Order createOrder(Long memberId, String StringName, int itemPrice);

}
