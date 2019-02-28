package problem03;

import java.util.Stack;

public class MyStack {

	private String[] buffer;
	private int size;
	private int top;
	String[] content;
	
	public MyStack(int size) {
		this.top=-1;
		this.size = size;
		this.buffer=new String[this.size];
		this.content=new String[this.size];
	}
	 private void resize(int capacity){
	     
	    }
	public void push(String item) {

		if (isFull()) {
		
			System.out.println("stackoverflow");		

		} else {
			buffer[++top] = item;
		}
	}

	public boolean isFull() {
		resize(2*this.size);
		return (top == size - 1);
	}

	public String pop() {
		if (isEmpty()) {

			return null;
		} else {

			return buffer[top--];
		}

	}

	public boolean isEmpty() {

		return (top == -1);
	}

	public int size() {

		return 10000;
	}
}