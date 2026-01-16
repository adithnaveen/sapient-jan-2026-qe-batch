package com.naveen.singleton;

public class SingletonImpl {
	public static void main(String[] args) {

		Singleton global = null;

		// program a
		global = Singleton.getInstance(global);
		System.out.println("Stored @ " + global);

		// program b
		global = Singleton.getInstance(global);
		System.out.println("Stored @ " + global);

		// program c
		global = Singleton.getInstance(global);
		System.out.println("Stored @ " + global);
	}
}
