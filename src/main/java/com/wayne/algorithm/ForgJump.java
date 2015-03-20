package com.wayne.algorithm;

public class ForgJump {

	public long solution(int X, int Y, int D) {
        // write your code in Java SE 8
        long distance = Y - X;
        
        if (distance < 0 && D < 0){
            System.out.println("illegal input");
        }
        
        if(distance % D ==0) {
            return distance / D;
        } else {
            return distance / D + 1;
        }
    }

	public static void main(String[] args) {
		
	}
}
