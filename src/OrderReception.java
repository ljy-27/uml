public interface OrderReception {
    void registerOrder(Order orderInfo);
    void enterOrder(Order orderInfo);
    void cancelOrder();
}
