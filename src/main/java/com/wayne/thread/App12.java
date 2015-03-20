package com.wayne.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class App12 {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 200; i++) {
			executor.submit(new Runnable(){
				public void run() {
					Connection12.getInstance().connect();
				}
			});
		}
		
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);
		
//		Semaphore sem = new Semaphore(0);
//		
////		sem.release();
//		sem.acquire();
//		
//		System.out.println("Available permits: " + sem.availablePermits());
	}
}
