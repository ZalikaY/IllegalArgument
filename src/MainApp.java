import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		
		//Scanner
		Scanner userInt = new Scanner(System.in);
		
		//Useless variables atm
		String userCont = "YES"; //Variable for user to continue
		int user = 0;
		String userS;
		  		
		
		//Create parallel Arrays
		String [] names = {"Armani","Yazmin", "Tyler","Nicole","Daniel","David","Dominique E", "Elle","Clark","Kevin","Jennifer","Zalika","Johnny","Dominique B","Kim D","Jeseekia","Tricia"};
		String [] food = {"Salmon","Pizza","Tacos","Mexican","Chinese","Steak","Shrimp","Salmon","Pizza","Tacos","Italian","Pasta","Thai","Pizza","Ice cream","Lasagna","Mashed potatoes"};
		String [] hometown = {"Detroit","Detroit","Monroe","Detroit","Hamtramack","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit"};
		
		
		while (userCont.equalsIgnoreCase("Yes")){
		
		//Welcome user
			try{
		System.out.println("Welcome to our Java class.Which person would you like to learn more about?(enter a number 1-17): ");
		user = userInt.nextInt();
			} catch (InputMismatchException e){
				System.out.println("That student does not exist.(Enter a number 1-17");
			}
		userInt.nextLine();
		
		
		
		//Try statement to catch array error
			try {
			System.out.println("Student " + user + " is " + names[user] +".What would you like to know about " + names[user] +(" enter hometown or favorite food)"));
			} catch (ArrayIndexOutOfBoundsException r){
				System.out.println("That student does not exist.Please try again(Enter a number 1 to 17");
				userInt.nextInt();
			}
		
		userS = userInt.nextLine();
		
		if(userS.equalsIgnoreCase("hometown")){
			System.out.println(names[user] + " is from " + hometown[user] + " Would you like to know more?");
			userCont = userInt.nextLine();
		} else if (userS.equalsIgnoreCase("favorite food")){
			System.out.print(names[user] + " 's favorite food is " + food[user] +"Would you like to know more?");
			userCont = userInt.nextLine();
		}else 	System.out.println("That does not exist");
		}
	
		userS= userInt.nextLine();
		System.out.println("Thanks");
		
		
	}}
	
	
	

