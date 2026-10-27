package pratice;

public class Account {
     int amount; //instance variable
     String name;
     
     Account(){
    	 System.out.println("Nikhil");
     }
     Account(String name, int amount){ //parameters
         System.out.println("Dwivedi");
    	 this.name = name;
    	 this.amount = amount;
     }
}
