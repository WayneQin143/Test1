package com.wayne.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class App14 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("starting.");
		
		ExecutorService exec = Executors.newCachedThreadPool();
		
		Future<Void> fu =  exec.submit(new Callable<Void>() {
			
			public Void call() throws Exception {
				Random ran = new Random();
				
				for(int i = 0; i < 1E8; i++) {
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("Interrupted");
						break;
					}
					Math.sin(ran.nextDouble());
				}
				return null;
			}
		});
		
		exec.shutdown();
		
		Thread.sleep(500);
		
		exec.shutdownNow();
//		fu.cancel(true);
		
		exec.awaitTermination(1, TimeUnit.DAYS);
		
		System.out.println("finished.");
		
	}
}
