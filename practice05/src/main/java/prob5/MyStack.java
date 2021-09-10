package prob5;

public class MyStack {
	
	private int top;
	String [] str;
	
	public MyStack(int i) {
		top = -1;
		
		for(int n=0; n<i; n++) {
			str = new String[n];
		}
		
	}

	void push(String s) throws MyStackException {
		if(top == (str.length)-1) { 
			throw new MyStackException("stack is full");
		}
		else { 
			str[++top] = s; 
		}
	}
	
	String pop() throws MyStackException {
		if(isEmpty()) { 
			throw new MyStackException();
		}
		else { 
			return str[top--];
		}
	}
	
	public boolean isEmpty(){
		if(top==-1) { return true; }
		else { return false; }
	}
}