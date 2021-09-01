package model;

public class Person {
	
	private String name;
	private String lastname;
	private Integer age;
	private String hometown;
	
	public Person() {
		
	}

	public Person(String name, String lastname, Integer age, String hometown) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.hometown = hometown;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", age=" + age + ", hometown=" + hometown + "]";
	}

	

}
