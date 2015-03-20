package com.wayne.www.innerclass;

public class Robot {

	private int id;

    class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
    
    public static class Battery {
    	public void charge() {
    		System.out.println("Battery charging... ");
    	}
    }
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("starting robot " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		class temp {
			public void doSomething() {
				System.out.println("id is:" + id);
				System.out.println("My name is " + name);
			}
		}
	}
}
