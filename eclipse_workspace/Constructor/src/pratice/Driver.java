package pratice;

public class Driver {

	public static void main(String[] args) {
         Account acc1 = new Account();
         System.out.println(acc1.amount);
         Account acc2 = new Account("hey", 200);
         System.out.println(acc2.name + " " + acc2.amount);
	}

}
