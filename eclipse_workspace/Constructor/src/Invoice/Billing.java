package Invoice;

class Billing extends Object{
	static int gst = 18;
	int amount;
	String itemName;
    String billingAdress;
    String customerId;
    String customerName;
    
    Billing(int _amount, String _itemName, String _billingAdress, String _customerId , String _customerName){
    	this.amount = _amount;
    	this.itemName = _itemName;
    	this.billingAdress = _billingAdress;
    	this.customerId = _customerId;
    	this.customerName = _customerName;
    }
}
