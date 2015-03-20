package com.wayne.www.innerclass;

import com.wayne.www.enumtest.Animal;

/**
 * Hello world!
 *
 */
public class App 
{
	
	String a = "a";
	
    public static void main( String[] args )
    {
//    	Robot robot = new Robot(7);
//    	robot.start();
//    	
//    	Robot.Brain brain = robot.new Brain();
//    	brain.think();
//    	
//    	Robot.Battery battery= new Robot.Battery();
    	
    	Animal animal = Animal.DOG;
    	
    	switch(animal) {
		case CAT:
			System.out.println("CAT");
			break;
		case DOG:
			System.out.println("dog");
			break;
		case MOUSE:
			break;
		default:
			break;
    	}
    }
}
