package com.wonderfulbytes.tests.stacksAndQueues.familymail;

public class Stack<G> {
	
	private int maxSize;
	private G[] stackArray;
	private int top;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = (G[]) new Object[maxSize];
		top = -1;
	}
	
	public void push(G itemToPush) {
		stackArray[++top] = itemToPush;
	}
	
	public G pop() {
		return stackArray[top--];
	}
	
	public G peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	public int getSize() {
		return top+1;
	}
}
