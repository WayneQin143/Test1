package com.wayne.thread;

public class App10 {
	
	public static void main(String[] args) throws InterruptedException {
		final Runner10 runner = new Runner10();
		
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				try {
					runner.firstThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				try {
					runner.secondThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		runner.finished();
	}
}
