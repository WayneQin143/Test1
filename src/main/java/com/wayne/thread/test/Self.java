package com.wayne.thread.test;

public class Self extends Thread {
	public static void main(String[] args) {
		try {
			Thread t = new Thread(new Self());
			t.start();
		} catch (Exception e) {
			System.out.println("e");
		}
		
	}
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getId() + " ");
		}
	}
}
