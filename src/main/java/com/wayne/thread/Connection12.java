package com.wayne.thread;

import java.util.concurrent.Semaphore;

public class Connection12 {
	
	private static Connection12 instance = new Connection12();
	
	private Semaphore sem = new Semaphore(10);
	
	private int connections = 0;
	
	private Connection12() {
	}
	
	public static Connection12 getInstance() {
		return instance;
	}
	
	public void connect() {
		try {
			sem.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			doConnect();
		}
		finally {
			sem.release();
		}
	}
	
	public void doConnect() {
		
		
		
		synchronized(this) {
			connections++;
			System.out.println("Current connections: " + connections);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized(this) {
			connections--;
		}
		
	}
	
}
