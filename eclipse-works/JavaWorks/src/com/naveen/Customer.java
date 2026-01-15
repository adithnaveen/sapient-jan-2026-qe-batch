package com.naveen;

public class Customer {
	

	// encapsulate 
	private int custId;
	private String custName; 
	private int age;
	
	
	protected String checkProtected() {
		return "i'm protected"; 
	}

	// by default there is a injection of default constructor 
	
	public Customer() {
		super();
		System.out.println("hi i'm in constructor"); 
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 18) {
			this.age = 18;
			throw new RuntimeException("Sorry Name cannot be lessthan 18, default to 18"); 
		}
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", age=" + age + "]";
	}

	
	
}
