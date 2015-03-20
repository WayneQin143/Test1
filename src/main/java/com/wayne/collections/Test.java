package com.wayne.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		Map m = new HashMap();
		
		List l = new ArrayList();
		
		Map lm = new LinkedHashMap();
		Map tr = new TreeMap();
//		Map ht = new HashTable();
		
		Integer a = 8;
		Double d = 8.8;
//		int i = Math.
//		Collections.sort(list);
//		Arrays.asList(a);
//		String s = (String) new Object();
		Set ss2 = new HashSet();
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		
		p.add("b");
		p.add("d");
		p.add("a");
		p.offer("g");
		System.out.println(p);
		
		String sq = p.poll();
		while(sq != null) {
			System.out.println(sq + "-");
			sq = p.poll();
		}
		
		Object o = 1;
		
	}
}
