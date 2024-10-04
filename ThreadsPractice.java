package com.thread.hyr;

import String.string1;

public class ThreadsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());	
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getPriority());
		Thread t1=new Thread();
		t1.start();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());	
		System.out.println(Thread.currentThread().getName());	

		t1.run();
		employe e=new employe();
		Thread e2=new Thread(e);
		employe1 e1=new employe1();
		Thread m1=new Thread(e1);
		e2.start();
		m1.start();
	}
}
class employe implements Runnable{


	@Override
	public void run() {
		System.out.println("Hello chandra e0");
		System.out.println(Thread.currentThread().getName());	
	}
}
class employe1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello chandra e1");
		System.out.println(Thread.currentThread().getName());	

	}
}
