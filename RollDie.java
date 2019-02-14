/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 12 2019
 * Created for: ICS4U
 * This program randomly generate a value between 1 and maxValue 
 *  then place the value 
 *
 ****************************************************************************/
import java.util.Scanner;
import java.util.Random;


public class RollDie {

	public static void main(String[] arg) {
		
		int maxValue;
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please, put a positive integer for your max value: ");
		maxValue = userInput.nextInt();
		
		RollDie(maxValue);
				
	}
	
	public static int RollDie(int maxValue) {
		
		// die does not have a negative number 
		if(maxValue < 1) {
			System.out.print("Please, put a positive number! Example : 1, 2, 3");
			return -1;
			
		}
		// number can not get lower than 1
		else if(maxValue == 1) {
			System.out.print("1");
			return 1;
		}
		// generating random number under the maxValue that user had selected
		else {
			Random range = new Random();
			
			int randomNum;
			
			randomNum = range.nextInt(maxValue) + 1;
			
			System.out.print("Your number is " + randomNum + ".");
			return randomNum;
		}
		
	}

}
