package com.wayne.collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Dog {
	private String name;
	private int age;
	
	Dog(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Dog other = (Dog) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	
	
}

public class App9 {

	public static void main(String[] args) {
		List l = new LinkedList<String>();
		
		Map<Dog, String> m = new HashMap<Dog, String>(); 
		
		m.put(new Dog("a"), "aaa1");
		m.put(new Dog("a"), "aaa2");
		m.put(new Dog("b"), "aaa");
		
		System.out.println(m.get(new Dog("a")));
		
		
	}
}
