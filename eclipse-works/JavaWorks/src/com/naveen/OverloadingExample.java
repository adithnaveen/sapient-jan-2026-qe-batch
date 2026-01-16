package com.naveen;




public class OverloadingExample {

	public void display(int x) {
		System.out.println("in int x " + x); 
	}
	public void display(long x) {
		System.out.println("in long x " + x); 
	}
	public void display(double x) {
		System.out.println("in double x " + x); 
	}
	
	public void display(int [] x) {
		for(int i : x) {
			System.out.println(i); 
		}
	}
	
	public void display(Object [] x) {
		for(Object obj : x) {
			System.out.println(obj);
		}
		
	}
	public void display(String name, String ... items) {
		System.out.println("Name : "+ name); 
		for(String str : items) {
			System.out.println(str);
		}
		
	}
	public static void main(String [] args) {
		OverloadingExample o = new OverloadingExample(); 
		o.display(12.3);
		o.display(2);
		o.display(23l);
		System.out.println("-----------------------");
		o.display("Stationary", "Pen", "Marker");
		System.out.println("-----------------------");
		o.display(new Object[]{"pen", "marker", "eraser"});
		System.out.println("-----------------------");
		o.display("pen", "marker", "eraser");
	}
}










