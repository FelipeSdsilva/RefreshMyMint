package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {


    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private Long id;
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;

    List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Long id, LocalDateTime moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    @Override
    public String toString() {

        StringBuilder bdl = new StringBuilder();
        bdl.append("ORDER SUMMARY:");
        bdl.append("\nOrder Moment: " + moment.format(fmt));
        bdl.append("\nOrder Status: " + status);

        return bdl.toString();
    }

    public void addItems(OrderItem orderItem) {
        items.add(orderItem);
    }

    public void removeItems(OrderItem orderItem) {
        items.remove(orderItem);
    }

    public double totalValue() {
        Double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
}
