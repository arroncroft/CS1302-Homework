// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 5
// Due:		3/9/16

package prob1;

public class IllegalRectangleException extends RuntimeException {
	//data fields
	private double width,height,area;

	//constructor
	public IllegalRectangleException(
			String message,double width,double height,double area){
		super(message);
		this.width = width;
		this.height = height;
		this.area = area;
	}

	//getters for width, height, and area
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}
	public double getArea(){
		return area;
	}

	//toString
	@Override
	public String toString() {
		return "Illegal Rectangle: width = " + width + ", height = " + height + ", area = " + getArea();
	}
}
