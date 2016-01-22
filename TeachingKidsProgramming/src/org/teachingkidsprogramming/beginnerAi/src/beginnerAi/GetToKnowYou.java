package beginnerAi;

import java.util.Scanner;

public class GetToKnowYou {
	
	public static String name, anser1; 
    public static Scanner scan;
    
 public static void main(String[] args) {
	 scan = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scan.next();
		System.out.println("Hi " + name);
		System.out.println("Hi my name is Alisha Isoworth can I get to know you yes or no");
		anser1 = scan.next();
		if(anser1.equals("yes"))
		{
			System.out.println("Do you mind me asking your age?");
		}
		if(anser1.equals("no"))
		{
			System.out.println("Oh ok bye.");
		}
			
		
}
}
