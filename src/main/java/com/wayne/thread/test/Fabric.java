package com.wayne.thread.test;

public class Fabric extends Thread{

	public static void main(String[] args) {
		Thread t = new Thread(new Fabric(), "a");
		Thread t2 = new Thread(new Fabric(),"c");
		
		new Thread(new Runnable() {
			public void run(){
			}},"carol").start();
		
		t.start();
		t2.start();
	}
	
	public void run(){
		for(int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getId() + " ");
		}
	}
	
}
