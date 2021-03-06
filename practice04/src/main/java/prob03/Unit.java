package prob03;

public class Unit {
	
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void move(int x, int y) {
		/* 지정된 위치로 이동 */
		setX(x);
		setY(y);
	}

	void stop() {
		/* 현재 위치에 정지 */
		System.out.println("[x:"+ getX()+", y:"+ getY()+"]에 정지합니다.");
		
	}

}
