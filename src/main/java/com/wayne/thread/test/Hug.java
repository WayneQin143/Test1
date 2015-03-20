package com.wayne.thread.test;

public class Hug implements Runnable{

	static Thread t1;
	static Hold h, h2;
	
	public void run() {
		if(Thread.currentThread().getId() == t1.getId()){
			h.adjust();
		} else {
			h2.view();
		}
	}
	
	public static void main(String[] args) {
		h = new Hold();
		h2 = new Hold();
		t1 = new Thread(new Hug());
		t1.start();
		new Thread(new Hug()).start();
	}

}

class Hold {
	static int x = 5;
	
	synchronized void adjust() {
		System.out.println(x-- + " ");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		view();
	}

	synchronized void view() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(x > 0) {
			adjust();
		}
	}
}
