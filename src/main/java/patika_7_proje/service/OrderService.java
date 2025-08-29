package patika_7_proje.service;

import patika_7_proje.model.Order;
import patika_7_proje.model.Product;
import patika_7_proje.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    private static Map<User, List<Order>> orders = new HashMap<>();

    public void create(List<Product> productList, User user) {
        Order order = new Order(productList, user);
        List<Order> usersOrder = foundOrders(user);
        if (usersOrder == null) {
            usersOrder = new ArrayList<>();
        }
        usersOrder.add(order);
        orders.put(user, usersOrder);
        user.getOrderList().add(order);
        System.out.println("Siparişiniz oluşturuldu!" + order);
    }

    public void list() {
        for (List<Order> orders : orders.values()) {
            System.out.println(orders);

        }
    }

    public List<Order> foundOrders(User user) {
        return orders.get(user);

    }
}
