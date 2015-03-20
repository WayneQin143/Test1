package com.wayne.thread.test;

public class Locker extends Thread{
	private static Thread t;
	
	public static void main(String[] args) {
		t = new Locker();
		t.start();
		new Locker().start();
	}
	
	public void run() {
		if(Thread.currentThread() == t) {
			System.out.println("1 ");
			synchronized(t) {
				doSleep(3000);
			}
			System.out.println("2 ");
		} else {
			System.out.println("3 ");
			synchronized(t) {
				doSleep(3000);
			}
			System.out.println("4 ");
		}
	}
	
	private void doSleep(long delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
