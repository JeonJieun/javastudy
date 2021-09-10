package prob6;

public class RectTriangle extends Shape {

	private double width;
	private double height;

	RectTriangle(double w, double h) {
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
		return getWidth() * getHeight() / 2;

	}

	public double getPerimeter() {
		return getWidth() + getHeight() + Math.sqrt( Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2) );

	}

}
