package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product {

    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufacturedDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public final String priceTag() {
        return getName() + " (used) $" + String.format("%.2f", getPrice()) + " (Manufactured date: "
                + fmt.format(manufacturedDate) + ")";
    }

}
