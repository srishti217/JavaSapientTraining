
abstract class Person {
	String name;

	abstract void work();

	void eat() {
		System.out.println("eating");
	}
}

class Employee extends Person {// concrete class

	@Override
	void work() {
		System.out.println("working as an IT engineer");
	}

}

class Manager extends Person {// concrete class

	@Override
	void work() {
		System.out.println("working as an IT Manager");
	}

}

public class AbstractClasses {
	public static void main(String[] args) {
//		Person p1 = new Person();
		Person engineer = new Employee();
		engineer.eat();
		engineer.work();
		Person manager = new Manager();
		manager.eat();
		manager.work();
		
	}
}