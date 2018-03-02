// Name:	Arron Croft
// ID:		870402435
// CS 1302-A Homework 5
// Due:		3/9/16

package prob1;

import java.text.DecimalFormat;

public class Rectangle extends GeometricObject {
	//data fields
	private double width;
	private double height;

	//constructor
	public Rectangle(double width, double height) throws IllegalRectangleException {
		this.width = width;
		this.height = height;

		if (getArea() < 1) {
			throw new IllegalRectangleException("Rectangle area must be greater than 1.0", width, height, getArea());
		}
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override /** Return area */
	public double getArea() {
		return width * height;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Rectangle: width = " + width + ", height = " + height + ", area = " + getArea();
	}
}
