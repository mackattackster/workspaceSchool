package ch26.exercises;

//Consider these source files posted on the Lectures Notes page (Chapter 26 - Part 1 Slides - 
//Source Code): Classes MyList, MyAbstractList, and MyLinkedList. 
//Completed the implementation of class MyLinkedList. That is, all class methods that return 
//true. Namely: contains(E e); get(int index); indexOf(E e); lastIndexOf(E 
//e); and set(int index, E e). 
//import ch26.exercises.*;

public class A4_TestMyLinkedList {

	public static void main(String[] args) {
		 String[] name = {"Amy","George","Tom","Kelly","George","Jane","Ed"}; 
		 MyList<String> myTestlist = new MyLinkedList<String>(name); 
		 
		 System.out.println("===== Testing new operations ====="); 
		 System.out.println(myTestlist.contains("George")); 
		 System.out.println(myTestlist.get(3)); 
		 System.out.println(myTestlist.indexOf("George")); 
		 System.out.println(myTestlist.lastIndexOf("George")); 
		 myTestlist.set(4, "Michael"); 
		 System.out.println(myTestlist); 
		 System.out.println("=========== more testing ========="); 
		 myTestlist.add("Nancy"); 
		 myTestlist.add("Jose"); 
		 myTestlist.add("George"); 
		 myTestlist.add("Richard"); 
		 System.out.println(myTestlist.get(7)); 
		 System.out.println(myTestlist.indexOf("Mike")); 
		 System.out.println(myTestlist.lastIndexOf("George")); 
		 System.out.println(myTestlist);
	}//end of main method

}//end of assignment 4
