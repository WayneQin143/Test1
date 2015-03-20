package com.wayne.thread.test;

public class Tshirt extends Thread{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId() + " ");
		
		Thread t1 = new Thread(new Tshirt());
		Thread t2 = new Thread(new Tshirt());
		t1.start();
		t2.run();//running the id of the main thread
	}
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getId() + " ");
		}
	}

}
