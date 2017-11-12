package queue;

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Employee> employeeQueue = new Queue<Employee>();
		
		Queue<HourlyEmployee> hourlyEmployeeQueue = new Queue<HourlyEmployee>();
		
		hourlyEmployeeQueue.enqueue(new HourlyEmployee("Steve", "Cohen"));
		hourlyEmployeeQueue.enqueue(new HourlyEmployee("Guy", "Family"));
		hourlyEmployeeQueue.enqueue(new HourlyEmployee("Jack", "Sparrow"));
		hourlyEmployeeQueue.enqueue(new HourlyEmployee("Robert", "Plant"));
		hourlyEmployeeQueue.enqueue(new HourlyEmployee("Jimmy", "Page"));
		hourlyEmployeeQueue.enqueue(new HourlyEmployee("Jhon", "Lennon"));
		hourlyEmployeeQueue.enqueue(new HourlyEmployee("Ketty", "Griffith"));
		hourlyEmployeeQueue.enqueue(new HourlyEmployee("Chris", "Webber"));
		employeeQueue.addElements(hourlyEmployeeQueue);
		
		System.out.println("THE EMPLOYEES NAMES ARE :");
		while (employeeQueue.hasItem()) {
			Employee employee = employeeQueue.dequeue(); 
			System.out.println(employee.toString());
		}
	}

}
