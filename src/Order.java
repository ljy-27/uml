import java.time.LocalDateTime;
import java.util.List;

public class Order implements OrderUI {
    private String orderId;
    private String orderDate;
    private List<OrderDetail> orderDetails;
    private Member customer;

    @Override
    public void createOrder(Order orderInfo) {

    }

    @Override
    public void registerOrder() {

    }

    @Override
    public void cancelOrder() {

    }

    private LocalDateTime getOrderDate() {
        return LocalDateTime.parse(orderDate);
    }
}
