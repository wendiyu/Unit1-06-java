/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 12 2019
 * Created for: ICS4U
 * This program randomly generate a value between 1 and maxValue 
 *
 ****************************************************************************/
import java.util.Scanner;
import java.util.Random;


public class RollDie {

	public static void main(String[] arg) {
		
		int maxValue;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please, put a positive integer for your max value: ");
		maxValue = userInput.nextInt();
		
		RollDie(maxValue);
				
	}
	
	public static int RollDie (int maxValue) {
		
		// die does not have a negative number 
		if(maxValue < 1) {
			System.out.println("Please, put a positive integer number! Example : 1, 2, 3");
			return -1;
			
		}
		// random number can not get lower than 1
		else if(maxValue == 1) {
			System.out.println("1");
			return 1;
		}
		// generating random number under the maxValue that user had selected
		else {
			Random range = new Random();
			
			int randomNum;
			
			randomNum = range.nextInt(maxValue) + 1;
			
			System.out.println("Your random number is " + randomNum + ".");
			
			return randomNum;
		}
		
	}

}

