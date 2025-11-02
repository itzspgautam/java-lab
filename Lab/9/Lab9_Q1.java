//Lab 9: Question 1
import java.util.Scanner;
enum Day {MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY}
public class Lab9_Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day:");
		String input = sc.nextLine().toUpperCase(); 
		
		try{
			Day day = Day.valueOf(input);
			if(day == Day.SUNDAY || day ==Day.SATURDAY){
				System.out.println("Its Weekend. Enjoy!");
			}
			else{
				System.out.println("Its Weekday. :/");
			}
		}catch(IllegalArgumentException e){
				System.out.println("Error: Invalid day");
		}
	}
}