package com.Polymorphism;

public class MethodOverloading {
	public void add(int a,int b) {
		
	}
	public void add(int a,int b,int c) {
		
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.add(10, 6);
		m.add(12,6, 0);
	}
}
