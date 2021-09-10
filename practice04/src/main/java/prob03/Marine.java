package prob03;

public class Marine extends Unit{
	
	private boolean stimPackState; // true : 스팀팩 사용, false : 스팀팩 사용 안함;
	
	Marine(){ 
		setStimPackState(false);
	}
	
	public boolean isStimPackState() {
		return stimPackState;
	}

	public void setStimPackState(boolean stimPackState) {
		this.stimPackState = stimPackState;
	}

	void stimPack() { 
		if(isStimPackState()) { System.out.println("스팀팩 사용."); }
		else { System.out.println("스팀팩 사용 안함."); }
	}	
}
