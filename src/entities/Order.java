package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
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
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }


}
