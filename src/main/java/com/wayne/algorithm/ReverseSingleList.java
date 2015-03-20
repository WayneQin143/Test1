package com.wayne.algorithm;

//单向链表反转
public class ReverseSingleList {
	
	public static Node reverse(Node head) {
		if(null == head || null == head.getNextNode()) {
			return head;
		}
		Node reversedHead = reverse(head.getNextNode());
		head.getNextNode().setNextNode(head);
		head.setNextNode(null);
		return reversedHead;
	}
	
	public static Node reverse2(Node head) {
		if(null == head) {
			return head;
		}
		Node pre = head;
		Node cur = head.getNextNode();
		Node next;
		while(null != cur) {
			next = cur.getNextNode();
			cur.setNextNode(pre);
			pre = cur;
			cur = next;
		}
		head.setNextNode(null);
		head = pre;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(0);
		Node tmp = null;
		Node cur = null;
		for(int i = 1; i < 5; i++) {
			tmp = new Node(i);
			if(1 == i) {
				head.setNextNode(tmp);
			} else {
				cur.setNextNode(tmp);
			}
			cur = tmp;
		}
		
		Node h = head;
		while (null != h) {
			System.out.print(h.getRecord() + ", ");
			h = h.getNextNode();
		}
		
		head = reverse2(head);
		
		System.out.println("");
		System.out.println("---------------------");
		
		while (null != head) {
			System.out.print(head.getRecord() + ", ");
			head = head.getNextNode();
		}
	}
}

class Node {
	private int record;
	private Node nextNode;
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public Node(int record) {
		super();
		this.record = record;
	}
}

