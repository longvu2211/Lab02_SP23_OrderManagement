package crud;

public interface OrderDao {
    void addAOrder();
    void displayOrdersAscendingByCusName();
    void displayPendingOrders();
    void updateOrder();
}
