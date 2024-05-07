public class Customer {
	private String name;
	private int age;

	public Customer(String string, int age) {
		this.name = string;
		this.age = age;
	}

	public Customer(Customer c) {
		this.name = c.name;
		this.age = c.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
}