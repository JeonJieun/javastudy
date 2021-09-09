package prob05;

//주어진 Class Base는 절대로 수정하면 안됩니다.  

public class Prob05 {

	public static void main(String[] args) {
		Base base = new MyBase();

		base.service("낮");
		base.service("밤");
		base.service("오후"); 

	}
}
