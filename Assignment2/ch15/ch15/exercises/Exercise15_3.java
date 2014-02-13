package ch15.exercises;

/*
Rewrite the Rectangle class to extend the GeometricObject class and implement the Comparable 
interface. Override the equals() method such that two rectangle objects are equal if their areas are the 
same. Note that you need override method CompareTo() to work for rectangle objects. Write a test 
program to create two rectangle objects and then call methods equals() and CompareTo() on these 
objects.
 */

public class Exercise15_3 {
	
	public static void main (String[] args) {
		Exercise15_3 ex3 = new Exercise15_3();
		Rectangle r1 = ex3.new Rectangle(2, 4);
		Rectangle r2 = ex3.new Rectangle(4, 4);
		
		System.out.println("The 2 rectangles are equal is: " + r1.equals(r2));
		
	}
	
	abstract class GeometricObject implements Comparable<Object>{
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
		  public GeometricObject max (GeometricObject o1, GeometricObject o2) {
			  return (o1.compareTo(o2) > 0) ? o1 : o2;
		  }
		  
		}

	class Rectangle extends GeometricObject {
		  private double width;
		  private double height;

		  public Rectangle() {
		  }

		  public Rectangle(double width, double height) {
		    this.width = width;
		    this.height = height;
		  }
		  
		  public int compareTo(Rectangle r) {
				  if (getArea() > (r.getArea()))
					  return 1;
				  else if (getArea() < (r.getArea()))
					  return -1;
				  else
					  return 0;	  
		  }
		  
		  public boolean equals(Rectangle r) {
			  if (getArea() == r.getArea())
				  return true;
			  else
				  return false;
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
		}
	
}//end of exercise 15_3




