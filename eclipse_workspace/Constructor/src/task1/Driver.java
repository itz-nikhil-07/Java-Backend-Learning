package task1;

public class Driver {
	public static void main(String[] args) {
		Product p1 = new Product("cooler", 1500, "used for cool air", 01);
		System.out.println(p1.productName + "," + p1.price + "," + p1.description + "," + p1.quantity);
		Product p2 = new Product();
		System.out.println(p2.productName + "," + p2.price + "," + p2.description + "," + p2.quantity);
		Product p3 = new Product("tv", "entertainment purpose");
		System.out.println(p3.productName + "," + p3.description);
	}

}
