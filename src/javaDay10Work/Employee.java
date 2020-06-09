package javaDay10Work;

public class Employee {
	
	int id, age;
	String name;
	
	Employee() {
		id = 101;
		name = "No one";
		age = 0;
	}
	
	Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String data = "ID: "+id+
				"\nName: "+name+
				"\nAge: "+age;
		return data;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee);

	}

}
