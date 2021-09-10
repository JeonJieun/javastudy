package prob5;

public class MyStack {
	
	private int top;
	private String [] str;
	private int size = 0;
	
	
	/* Getter Setter 적용 안한것

	public MyStack(int i) {
		size = i;
		top = -1;
		str = new String[size];
	}

	public void push(String s){
		if(top == (str.length)-1) { 
			changeArray(s);
		}
		
		else { 
			str[++top] = s; 
		}
	}
	
	public String pop() throws MyStackException {
		if(isEmpty()) { 
			throw new MyStackException("stack is empty");
		}
		else { 
			return str[top--];
		}
	}
	
	public boolean isEmpty(){
		if(top==-1) { return true; }
		else { return false; }
	}
	
	public void changeArray(String s) {
		++size;
		String[] newStr = new String[size];
		for(int i=0; i<size-1; i++) {
			newStr[i] = str[i];
		}
		newStr[size-1]=s;
		str = newStr;
		++top;
	}
	
	*/
	
	public MyStack(int i) {
		setSize(i);
		setTop(-1);
		str = new String[size];
	}

	public void push(String s){
		if(getTop() == (getStr().length)-1) { 
			changeArray(s);
		}
		
		else { 
			setTop(getTop()+1);
			setStr(getTop(), s); 
		}
	}
	
	public String pop() throws MyStackException {
		if(isEmpty()) { 
			throw new MyStackException("stack is empty");
		}
		else { 
			setTop(getTop()-1);
			return getStr(getTop()+1);
		}
	}
	
	public boolean isEmpty(){
		if(getTop()==-1) { return true; }
		else { return false; }
	}
	
	public void changeArray(String s) {
		setSize(getSize()+1);
		String[] newStr = new String[getSize()];
		for(int i=0; i<getSize()-1; i++) {
			newStr[i] = getStr(i);
		}
		newStr[size-1]=s;
		setStr(newStr);
		setTop(getTop()+1);
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public String[] getStr() {
		return str;
	}
	
	public void setStr(String[] str) {
		this.str = str;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String getStr(int num) {  //추가
		return str[num];
	}
	
	public void setStr(int num, String s) { //추가
		this.str[num] = s;
	}
	
}