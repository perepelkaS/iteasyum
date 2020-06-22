package lesson34;

import java.util.*;

public class MainOrder {
    public static void main(String[] args) {
        List<Order> orders = listOrders();
        Set<Integer> userId = new HashSet<>();

        for (Order order: orders) {
            userId.add(order.getClientId());
        }
        System.out.println("userId = " + userId);
        List<Client> clients = listClientByIds(userId);
        //setClientToOrderUsingList(orders, clients);
        setClientToOrderusingMap(orders, clients);

        System.out.println("final orders: " + orders);
    }

    // хороший вариант
    static void setClientToOrderusingMap(List<Order> orders, List<Client> clients) {
        Map<Integer, Client> clientByIdMap = new HashMap<>();
        for (Client client: clients) {
            clientByIdMap.put(client.getId(), client);
        }
        for (Order order: orders) {
            Client orderClient = clientByIdMap.get(order.getClientId());
            order.setClient(orderClient);
            if (orderClient == null) {
                System.out.println("Error");
            }
        }
    }


    static void setClientToOrderUsingList(List<Order> orders, List<Client> clients) {
        for (Order order: orders) {
            Client orderClient = null;
            for (Client client: clients) {
                if (client.getId() == order.getClientId()) {
                    orderClient = client;
                    break;
                }
            }
            order.setClient(orderClient);
            if (orderClient == null) {
                System.out.println("Error");
            }
        }
    }

    private static List<Client> listClientByIds(Set<Integer> userId) {
        List<Client> result = new ArrayList<>();
        for (Integer id : userId) {
            result.add(new Client(id, "client " + userId));
        }
        return result;
    }

    private static List<Order> listOrders() {
        return Arrays.asList(
                new Order(1, 1, "ASDASD"),
                new Order(2, 1, "asdasd"),
                new Order(3, 2, "asdasxzcz"),
                new Order(4, 3, "rtyrt"),
                new Order(5, 2, "opoii")
        );
    }
}
