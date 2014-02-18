package ch22.exercises;

//Write a Java program that repeatedly prompt the user to enter a capital for a state. Upon receiving the 
//user input, the program reports whether the answer is correct. If incorrect, the program displays the 
//correct answer. Assume that 50 states and their capitals are stored in a two-dimensional array (2 
//columns and 50 rows). The program generates the questions randomly. The program must use a list 
//(generated from the array using the syntax Arrays.asList(arrayName) and then shuffle the list. 
//The program then generates the questions. Keep track of correct and incorrect answers, allow the user 
//to quit at anytime and at such time, and at then display number of correct and incorrect answers

public class A3_Exercise3 {
	
	public static void main(String[] args) {
		  String[][] statecapital = {
			      {"Alabama", "Montgomery"},
			      {"Alaska", "Juneau"},
			      {"Arizona", "Phoenix"},
			      {"Arkansas", "Little Rock"},
			      {"California", "Sacramento"},
			      {"Colorado", "Denver"},
			      {"Connecticut", "Hartford"},
			      {"Delaware", "Dover"},
			      {"Florida", "Tallahassee"},
			      {"Georgia", "Atlanta"},
			      {"Hawaii", "Honolulu"},
			      {"Idaho", "Boise"},
			      {"Illinois", "Springfield"},
			      {"Maryland", "Annapolis"},
			      {"Minnesota", "Saint Paul"},
			      {"Iowa", "Des Moines"},
			      {"Maine", "Augusta"},
			      {"Kentucky", "Frankfort"},
			      {"Indiana", "Indianapolis"},
			      {"Kansas", "Topeka"},
			      {"Louisiana", "Baton Rouge"},
			      {"Oregon", "Salem"},
			      {"Oklahoma", "Oklahoma City"},
			      {"Ohio", "Columbus"},
			      {"North Dakota", "Bismark"},
			      {"New York", "Albany"},
			      {"New Mexico", "Santa Fe"},
			      {"New Jersey", "Trenton"},
			      {"New Hampshire", "Concord"},
			      {"Nevada", "Carson City"},
			      {"Nebraska", "Lincoln"},
			      {"Montana", "Helena"},
			      {"Missouri", "Jefferson City"},
			      {"Mississippi", "Jackson"},
			      {"Massachusettes", "Boston"},
			      {"Michigan", "Lansing"},
			      {"Pennslyvania", "Harrisburg"},
			      {"Rhode Island", "Providence"},
			      {"South Carolina", "Columbia"},
			      {"South Dakota", "Pierre"},
			      {"Tennessee", "Nashville"},
			      {"Texas", "Austin"},
			      {"Utah", "Salt Lake City"},
			      {"Vermont", "Montpelier"},
			      {"Virginia", "Richmond"},
			      {"Washington", "Olympia"},
			      {"West Virginia", "Charleston"},
			      {"Wisconsin", "Madison"},
			      {"Wyoming", "Cheyenne"}
			    };
	}
}
