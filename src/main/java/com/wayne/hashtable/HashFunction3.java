package com.wayne.hashtable;

public class HashFunction3 {

	WordList[] theArray;
	int arraySize;
	public int stringHashFunction(String wordToHash) {
		int hashKeyValue = 0;
		
		for(int i = 0; i < wordToHash.length(); i++) {
			int charCode = wordToHash.charAt(i) - 96;
			int hKVTemp = hashKeyValue;
			hashKeyValue = (hashKeyValue * 27 + charCode) % arraySize;
			System.out.println("Hash Key Value " + hKVTemp + 
					" * 27 + Character " + charCode + 
					" % arraySize " + arraySize + " = " + hashKeyValue);
		}
		System.out.println();
		return hashKeyValue;
	}
}

class Word {
	public String theWord;
	public String definition;
	public int key;
	public Word next;
	public Word(String theWord, String definition) {
		this.theWord = theWord;
		this.definition = definition;
	}
	public String toString() {
		return theWord + " : " + definition;
	}
	
}

class WordList {
	public Word firstWord = null;
	public void insert(Word newWord, int hashKey) {
		Word previous = null;
		Word current = firstWord;
		newWord.key = hashKey;
		
		while(current != null && newWord.key > current.key) {
			previous = current;
			current = current.next;
		}
		
		if(previous == null) {
			firstWord = newWord;
		}else {
			previous.next = newWord;
		}
		newWord.next = current;
	}
	
	
	public static void main(String[] args) {
		
	}
}

