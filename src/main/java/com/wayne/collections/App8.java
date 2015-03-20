package com.wayne.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class Person implements Comparable<Person> {

	public int compareTo(Person o) {
		return 0;
	}
	
}

class Person2{
}


public class App8 {
	public static void main(String[] args) {
		List l = new ArrayList<String>();
		Set set = new TreeSet<Person2>();
		Collection<String> c = new TreeSet<String>();
		set.add(new Person2());
	}
}
