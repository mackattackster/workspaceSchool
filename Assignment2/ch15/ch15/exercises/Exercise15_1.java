package ch15.exercises;

/*
Modify the GeometricObject class to implement the Comparable interface, and define a static max 
method in the GeometricObject class for finding the larger of two GeometricObject objects. Implement 
the new GeometricObject class. Write a test program that uses the max method to find the largest of two 
circles and the larger of two rectangles
*/
public class Exercise15_1 {
	public static void main (String[] args) {
		Exercise15_1 ex1 = new Exercise15_1();
		Circle c1 = ex1.new Circle(6);
		Circle c2 = ex1.new Circle(3);
		Circle largeC;
		largeC = (Circle) Circle.max(c1, c2);
		System.out.println("\n1stCircle");
		c1.printCircle();
		System.out.println("\n2ndCircle");
		c2.printCircle();
		
		System.out.print("\nLargest of 2 Circles: ");
		largeC.printCircle();
		
		Rectangle r1 = ex1.new Rectangle(5, 10);
		Rectangle r2 = ex1.new Rectangle(4, 8);
		Rectangle largeR;
		largeR = (Rectangle) Rectangle.max(r1, r2);
		System.out.println("\n1stRectangle");
		r1.printRectangle();
		System.out.println("\n2ndRectangle");
		r2.printRectangle();
		System.out.print("\nLargest of 2 Rectangles: ");
		largeR.printRectangle();
	}

	abstract static class GeometricObject implements Comparable<Object>{
		  private String color = "white";
		  private boolean filled;
		  private java.util.Date dateCreated;

		  /** Construct a default geometric object */
		  protected GeometricObject() {
		    dateCreated = new java.util.Date();
		  }

		  /** Construct a geometric object with color and filled value */
		  protected GeometricObject(String color, boolean filled) {
		    dateCreated = new java.util.Date();
		    this.color = color;
		    this.filled = filled;
		  }

		  /** Return color */
		  public String getColor() {
		    return color;
		  }

		  /** Set a new color */
		  public void setColor(String color) {
		    this.color = color;
		  }

		  /** Return filled. Since filled is boolean,
		   *  the get method is named isFilled */
		  public boolean isFilled() {
		    return filled;
		  }

		  /** Set a new filled */
		  public void setFilled(boolean filled) {
		    this.filled = filled;
		  }

		  /** Get dateCreated */
		  public java.util.Date getDateCreated() {
		    return dateCreated;
		  }

		  @Override
		  public String toString() {
		    return "created on " + dateCreated + "\ncolor: " + color +
		      " and filled: " + filled;
		  }

		  /** Abstract method getArea */
		  public abstract double getArea();

		  /** Abstract method getPerimeter */
		  public abstract double getPerimeter();
		  
		  public int compareTo(Object o) {
			  if (getArea() > ((GeometricObject) o).getArea())
				  return 1;
			  else if (getArea() < ((GeometricObject) o).getArea())
				  return -1;
			  else
				  return 0;	  
		  }
		  static public GeometricObject max (GeometricObject o1, GeometricObject o2) {
			  return (o1.compareTo(o2) > 0) ? o1 : o2;
		  }
		  
		}//end of GeometricObject

	class Circle extends GeometricObject {
		  private double radius;

		  public Circle() {
		  }

		  public Circle(double radius) {
		    this.radius = radius;
		  }

		  /** Return radius */
		  public double getRadius() {
		    return radius;
		  }

		  /** Set a new radius */
		  public void setRadius(double radius) {
		    this.radius = radius;
		  }

		  @Override /** Return area */
		  public double getArea() {
		    return radius * radius * Math.PI;
		  }

		  /** Return diameter */
		  public double getDiameter() {
		    return 2 * radius;
		  }

		  @Override /** Return perimeter */
		  public double getPerimeter() {
		    return 2 * radius * Math.PI;
		  }

		  /* Print the circle info */
		  public void printCircle() {
		    System.out.println("The circle is created " + getDateCreated() +
		      " and the radius is " + radius);
		  }
		}//end of Circle	
	
	class Rectangle extends GeometricObject {
		  private double width;
		  private double height;

		  public Rectangle() {
		  }

		  public Rectangle(double width, double height) {
		    this.width = width;
		    this.height = height;
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
		  
		  public void printRectangle() {
			  System.out.println("The rectangle is created " + getDateCreated() +
				      " and the Perimeter is " + getPerimeter());
		  }
		}//end of Rectangle
	
}//end of exercise 15_1







