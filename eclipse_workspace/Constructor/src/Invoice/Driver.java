package Invoice;

public class Driver {
     public static void main (String []args) {
    	 Billing inv1 = new Billing(500, "tv", "banglore", "45633", "Nikhil");
    	 System.out.println(inv1.amount+ "," + inv1.itemName+ "," + inv1.billingAdress+ "," + inv1.customerId+ ", " + inv1.customerName + ","+ inv1.gst);
    	 Billing inv2 = new Billing(800, "pc", "banglore", "434343", "vineet");
    	 System.out.println(inv2.amount+ "," + inv2.itemName+ "," + inv2.billingAdress+ "," + inv2.customerId+ ", " + inv2.customerName + ","+ inv2.gst);
     }
}
 //f5 = step into
// f6= next line
// f7 = return to previous breakpoint
//f8 = move to breakpoint