package prob6;

public class Rectangle extends Shape implements Resizable{
	
	private double width;
	private double height;
	
	Rectangle(double w, double h){
		setWidth(w);
		setHeight(h);
	}
	
	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getArea() {
		return getWidth() * getHeight();
		

	}
	
	public double getPerimeter() {
		return (getWidth() + getHeight()) * 2;
		
	}

	@Override
	public void resize(double s) {
		setWidth(getWidth()*s);
		setHeight(getHeight()*s);
	}

}
