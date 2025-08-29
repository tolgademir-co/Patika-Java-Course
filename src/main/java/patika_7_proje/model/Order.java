package patika_7_proje.model;

import patika_7_proje.model.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private List<Product> productList;

    private OrderStatus orderStatus;

    private User user;

    private LocalDateTime createdDate;

    private LocalDateTime cancaledDate;

    private Double total;


    public Order(List<Product> productList, User user) {
        this.productList = productList;
        this.user = user;
        this.orderStatus = OrderStatus.PREPARING;
        this.createdDate = LocalDateTime.now();
        this.cancaledDate = null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void cancelOrder(Order order) {
        order.setOrderStatus(OrderStatus.CANCELED);
        order.cancaledDate = LocalDateTime.now();
    }

    public Double getTotal() {
        double total = 0;

        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;

    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                ", orderStatus=" + orderStatus +
                ", createdDate=" + createdDate +
                ", canceledDate=" + cancaledDate +
                ", total=" + getTotal() +
                '}';
    }
}
