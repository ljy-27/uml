public class Order implements OrderReception{
    private String orderId;
    private String orderDate;
    private List<OrderDetail> orderDetails;
    private Member customer;

    @Override
    public void registerOrder(Order orderInfo) {

    }

    @Override
    public void enterOrder(Order orderInfo) {

    }

    @Override
    public void cancelOrder() {

    }
}
