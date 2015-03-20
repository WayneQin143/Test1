package com.wayne.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App12 {

	public static void main(String[] args) {
		
		
		//index
		//add/remove from the end of list
		List<String> list1 = new ArrayList<String>();
		//add/remove from else where
		List<String> list2 = new LinkedList<String>();
		
		
		//avoid duplicate, look up things quickly
		Set<String> set1 = new HashSet<String>();
		//natural order, object must implement Comparable for custom types 
		Set<String> set2 = new TreeSet<String>();
		//order they were added
		Set<String> set3 = new LinkedHashSet<String>();
		
		
		//key-value pair, look up key quickly
		Map<String, String> map1 = new HashMap<String, String>();
		//keys in natural order, object must implement Comparable for custom types 
		Map<String, String> map2 = new TreeMap<String, String>();
		//Keys remain in order added
		Map<String, String> map3 = new LinkedHashMap<String, String>();
	}
	
	
}
