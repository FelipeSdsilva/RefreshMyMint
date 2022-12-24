package entities;

public class Product {

	private Integer code;
	private String name;
	private Double priceOfPurchase;
	private Double priceOfSale;
	private Double price = 0.0;
	private Integer quantity = 0;

	public Product() {
	}

	public Product(Integer code, String name, Double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPriceOfPurchase() {
		return priceOfPurchase;
	}

	public void setPriceOfPurchase(Double priceOfPurchase) {
		this.priceOfPurchase = priceOfPurchase;
	}

	public Double getPriceOfSale() {
		return priceOfSale;
	}

	public void setPriceOfSale(Double priceOfSale) {
		this.priceOfSale = priceOfSale;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return quantity * price;
	}

	public void addStock(Integer qtd) {
		this.quantity += qtd;
	}

	public void removeStock(Integer qtd) {
		this.quantity -= qtd;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", price=" + String.format("%.2f", price) + ", quantity="
				+ quantity + " ,Total: " + String.format("%.2f", totalValueInStock()) + "]";
	}
}
