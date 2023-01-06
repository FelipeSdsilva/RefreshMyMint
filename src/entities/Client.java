package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String email;
    private LocalDate birthDate;

    private List<Order> orders = new ArrayList<>();
    public Client() {
    }

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
