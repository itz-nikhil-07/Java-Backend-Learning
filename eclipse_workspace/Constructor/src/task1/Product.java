package task1;

public class Product {

	String productName;
	int price;
	String description;
	int quantity;

	Product(String productName, int price, String description, int quantity) {
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}

	Product(String productName, String description) {
		this.productName = productName;
		this.description = description;
	}

	Product() {

	}

}
