package com.wayne.abstractclass;

import static com.wayne.staticimport.Haha.h;
import static com.wayne.staticimport.Haha.howto;

import com.wayne.staticimport.Haha;

public class Test {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(6);
		
		Haha.howto();
		System.out.println(Haha.avout.A);
		
		howto();
		System.out.println(h.instVar);
	}
}
