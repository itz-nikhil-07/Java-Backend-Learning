package pratice2;

public class Studentservice {
	String name;
	int age;
	String course;
	
	Studentservice(String name, int age, String course){
		this.name = name; 
		this.age = age;
		this.course = course;
	}
     void displayStudent() {
    	 
    	 System.out.println("Name :" +name + "," + "age :" + age + "," + "course :" + course);
     }
}
