package prob03;

public class DropShip extends Unit{
	
	private String object;
	
	DropShip(){
		object = "";
	}
	
	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	void load() {
		/* 선택된 대상을 태운다.*/ 
		System.out.println("[x:"+ getX()+", y:"+ getY()+"]에서 ("+ getObject() +")을 태운다.");
	}
	
	void unload() {
		/* 선택된 대상을 내린다.*/ 
		System.out.println("[x:"+ getX()+", y:"+ getY()+"]에서 ("+ getObject() +")을 내린다.");
	}
}