import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		
		//Scanner
		Scanner userInt = new Scanner(System.in);
		
		//Set values
		String userCont; //Variable for user to continue
		boolean cont = true;//Variable to control loop
		
		
		  		
		
		//Create parallel Arrays
		String [] names = {"Armani","Yazmin", "Tyler","Nicole","Daniel","David","Dominique E", "Elle","Clark","Kevin","Jennifer","Zalika","Johnny","Dominique B","Kim D","Jeseekia","Tricia"};
		String [] food = {"Salmon","Pizza","Tacos","Mexican","Chinese","Steak","Shrimp","Salmon","Pizza","Tacos","Italian","Pasta","Thai","Pizza","Ice cream","Lasagna","Mashed potatoes"};
		String [] hometown = {"Detroit","Detroit","Monroe","Detroit","Hamtramack","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit","Detroit"};
	
		
		//Welcome user
		System.out.println("Welcome to our Java class.Which student would you like to learn more about?(enter a number 1-17): ");
		int user = userInt.nextInt();
		
		System.out.println("Student " + user + " is " + names[user] +".What would you like to know about " + names[user] +(" enter hometown or favorite food)"));
		String userS = userInt.next();
		
		/*if(userS.equalsIgnoreCase("hometown")){
			System.out.println(names[user] + " is from " + hometown[user]);
		} else if (userS.equalsIgnoreCase("favorite food")){
			System.out.println(names[user] + " favorite food is " + food[user]);
		}else { 
			System.out.println("That data does not exist.Please try again");
		}*/
	
	{
	
		
	}
	}
	
	}

