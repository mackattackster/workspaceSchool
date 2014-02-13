package ch15.exercises;

/*
Design and Interface names Colorable with a void method named howToColor(). Design a class named 
Square that extends class GeometricObject and implements interface Colorable. Implement method 
howToColor() to display the message “Color all four sides”. Write a test program that creates an array of 
six GeometricObject objects (a mix of circles, rectangles, and squares), and for each object in the array 
invoke its howToColor() method if it is colorable.
 */

public class Exercise15_2 {
	public static void main (String[] args) {
		Exercise15_2 ex2 = new Exercise15_2();
		GeometricObject[] obj = new GeometricObject[6];
		obj[0] = ex2.new Circle(5);
		obj[1] = ex2.new Circle(3);
		obj[2] = ex2.new Rectangle(2, 4);
		obj[3] = ex2.new Rectangle(4, 8);
		obj[4] = ex2.new Square();
		obj[5] = ex2.new Square();
		
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Colorable) {
				Colorable color = (Colorable) obj[i];
				color.howToColor();
			}
			else {
				System.out.println("Geometric Object is not colorable");
			}
				
		}
	}

	interface Colorable {
		public void howToColor();
	}
	
	class Square extends GeometricObject implements Colorable {

		public Square() { }
		@Override
		public void howToColor() {
			System.out.println("Geometric Object is colorable");
		}

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double getPerimeter() {
			// TODO Auto-generated method stub
			return 0;
		}
		
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
	
}//end of exercise 15_2








