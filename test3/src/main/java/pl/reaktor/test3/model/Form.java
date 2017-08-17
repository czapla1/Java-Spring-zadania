package pl.reaktor.test3.model;

public class Form {
	
	private String first;
	private String last;
	private int age;
	
	public Form() {
		super();
	}

	public Form(String first, String last, int age) {
		super();
		this.first = first;
		this.last = last;
		this.age = age;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
