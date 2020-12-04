package Chapter07;

import java.util.*;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	
	Vector<T> v = new Vector<T>();
	
	int n = 10;
	
	public T pop() {
		
		if (n > 0) {
			n--;
			return v.get(Integer.valueOf(n));
		}
		else
			return null;
	}

	public boolean push(T ob) {
		
		v.add(ob);
		
		return true;
	}
	
}

public class Chapter07_09 {
	public static void main(String[] args) {
		
		MyStack<Integer> stack = new MyStack<Integer>();
		
		for(int i = 0; i <10 ; i++) 
			stack.push(i);
		
		while(true) {
			Integer n = stack.pop();
			if(n == null)
				break;
			System.out.print(n + " ");
		}
		
		
		
	}
}
