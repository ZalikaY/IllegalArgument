import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		
		//Scanner
		Scanner userInt = new Scanner(System.in);
		
		//Useless variables atm
		String userCont = "YES"; //Variable for user to continue
		boolean cont = true;//Variable to control loop
		int user = 0;
		
		  		
		
		//Create parallel Arrays
		String [] names = {"Armani","Yazmin", "Tyler","Nicole","Daniel","David","Dominique E", "Elle","Clark","Kevin","Jennifer","Zalika","Johnny","Dominique B","Kim D","Jeseekia","Tricia"};
		String [] food = {"Salmon","Pizza","Tacos","Mexican","Chinese","Steak","Shrimp","Salmon","Pizza","Tacos","Italian","Pasta","Thai","Pizza","Ice cream","Lasagna","Mashed potatoes"};
		String [] hometown = {"Detroit","Detroit","Monroe","Detroit","Hamtramack","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit"};
	
		//While loop
		while(userCont.equalsIgnoreCase("Yes"))
		
		//Welcome user
		System.out.println("Welcome to our Java class.Which person would you like to learn more about?(enter a number 1-17): ");
		user = userInt.nextInt();
		userInt.nextLine();
		
		try{//Try statement to catch array error
			//Print out reference to array
			System.out.println("Student " + user + " is " + names[user] +".What would you like to know about " + names[user] +(" enter hometown or favorite food)"));
			} catch (ArrayIndexOutOfBoundsException e){
		System.out.println("That student does not exist.Please try again(enter a number 1 - 17)");

			}
		String userS = userInt.next();
		
		if(userS.equalsIgnoreCase("hometown")){
			System.out.println(names[user] + " is from " + hometown[user] + " Would you like to know more?");
		} else if (userS.equalsIgnoreCase("favorite food")){
			System.out.println(names[user] + " favorite food is " + food[user]);
		}else { 
			System.out.println("That data does not exist.Please try again");
		}
	
	{
	
	}	
	}
	}
	
	

