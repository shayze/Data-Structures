package queue;

public class Employee {

	public String firstName ; 
	public String lastName; 
	
	//constructor
	public Employee(String fName , String lName) {
		this.firstName = fName ; 
		this.lastName = lName ;
	}
	
	public String toString() {
		return firstName + " " + lastName ; 
	}
}
