package com.wayne.thread.test;

class Jog implements Runnable {
	public void run() {
		for(int i = 0; i < 8; i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println("exec ... ");
			}
			System.out.println(i + " ");
		}
	}
}

public class Marathon {

	public static void main(String[] args) throws Exception {
		Jog j1 = new Jog();
		
		Thread t1 = new Thread(j1);
		t1.start();
		t1.sleep(500);
		System.out.println("pre ");
		t1.interrupt();
		t1.sleep(500);
		System.out.println("post ");
		
	}
}
