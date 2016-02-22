import java.util.Scanner;

public class FB_stats {
//I'm going to ask user to input of TDS, INT, 
//YDS, and RTG. I will return the QB rating
	public static void main(String[] args) {
		//Step 1: Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Step 2: Declare and ask for variables
		//Declare and ask for TDS
		System.out.print("Enter number of Touchdowns: ");
		int tds = input.nextInt();
		//Declare and ask for interceptions
		System.out.print("Enter number of Interceptions: ");
		int intercept = input.nextInt();
		//Declare and ask for YDS
		System.out.print("Enter number of total YDS: ");
		int yds = input.nextInt();
		//Declare and ask for comp
		System.out.print("Enter number of completions: ");
		int comp = input.nextInt();
		//Declare and ask for ATT
		System.out.print("Enter number of passes attempted: ");
		int att = input.nextInt();
		
		//Step 3: Start calculating statistics
		double a = ((comp/att)-.3) * 5.0;
		double b = ((yds/att)-3) * 0.25;
		double c = (tds/att) * 20;
		double d = 2.375 - ((intercept/att) * 25);
		double passer_rating = ((a+b+c+d)/6) * 100;
		
		//Step 4: Output Passer Rating
		System.out.println("The Passer rating is: " + passer_rating);
		}
	}


	