package com.wayne.thread;

public class App {

	private int  count = 0;
	
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) {
		App a = new App();
		a.doWork();
	}
	
	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
