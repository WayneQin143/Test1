package com.wayne.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{

	private LinkedList<String> urls = new LinkedList<String>();
	
	public UrlLibrary() {
		urls.add("www.baidu.com");
		urls.add("www.qq.com");
		urls.add("www.jd.com");
	}

	public Iterator<String> iterator() {
		return urls.iterator();
	}
	
}
