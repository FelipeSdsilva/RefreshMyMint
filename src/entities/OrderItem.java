package entities;

public class OrderItem {

    private Integer qtd;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer qtd, Double price, Product product) {
        this.qtd = qtd;
        this.price = price;
        this.product = product;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return qtd * price;
    }

    @Override
    public String toString() {
        return "OrderItems: " + product.getName() + ","
                + String.format("%.2f", price) +
                ", Quantity: " + qtd +
                ", Subtotal: " + String.format("%.2f", subTotal());
    }
}
