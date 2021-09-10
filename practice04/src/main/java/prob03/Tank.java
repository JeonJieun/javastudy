package prob03;

public class Tank extends Unit{
	private boolean mode; //1:공격모드 ON, 2:공격모드 OFF;
	
	Tank(){ 
		setMode(false);
	}
	
	public boolean isMode() {
		return mode;
	}

	public void setMode(boolean mode) {
		this.mode = mode;
	}

	void changeMode() {

		/* 공격모드를 변환한다. */
		
		if(isMode()) { System.out.println("공격모드 ON."); }
		else { System.out.println("공격모드 OFF."); }
		
	}
}
