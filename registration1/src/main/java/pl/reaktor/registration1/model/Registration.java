package pl.reaktor.registration1.model;

public class Registration {

	
	private String first;
	private String last;
	private String email;
	private String password;
	
	private String rb;
	
	private boolean cb1;
	private boolean cb2;
	private boolean cb3;
	public Registration() {
		super();
	}
	public Registration(String first, String last, String email, String password, String rb, boolean cb1, boolean cb2,
			boolean cb3) {
		super();
		this.first = first;
		this.last = last;
		this.email = email;
		this.password = password;
		this.rb = rb;
		this.cb1 = cb1;
		this.cb2 = cb2;
		this.cb3 = cb3;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRb() {
		return rb;
	}
	public void setRb(String rb) {
		this.rb = rb;
	}
	
	public boolean isCb1() {
		return cb1;
	}
	public void setCb1(boolean cb1) {
		this.cb1 = cb1;
	}
	public boolean isCb2() {
		return cb2;
	}
	public void setCb2(boolean cb2) {
		this.cb2 = cb2;
	}
	public boolean isCb3() {
		return cb3;
	}
	public void setCb3(boolean cb3) {
		this.cb3 = cb3;
	}
	
	
}
