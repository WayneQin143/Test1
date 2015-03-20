package com.wayne.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


class StringLengthComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		return 0;
	}
	
}



public class Sorting {

	
	
	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		Integer i = 5;
		String a = "haha";
		i.compareTo(i);
		a.compareTo(a);
		Collections.sort(s);
		SortedSet<String> set = new TreeSet<String>();
		
	}
}
