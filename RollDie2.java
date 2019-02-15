/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 12 2019
 * Created for: ICS4U
 * This program randomly generate a value between 1 and maxValue 
 *  then place the value 
 * You have an option to choose input a min value or not
 *
 ****************************************************************************/
import java.util.Scanner;
import java.util.Random;


public class RollDie2 {

	public static void main(String[] arg) {
		
		int maxValue;
		int minValue;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please, put a positive integer for your max value: ");
		maxValue = userInput.nextInt();
		
		System.out.println("Optional input: you can put a positive integer for your min value (If you don't want to put a min value, just type 0): ");
		minValue = userInput.nextInt();
		
		
		RollDie2(maxValue, minValue);
		
		
				
	}
	
	public static int RollDie2 (int maxValue, int minValue) {
		
		
		// min value need to bigger than max value
		if(minValue > maxValue) {
			System.out.println("Please, put a bigger integer number for min value! "
					+ "Your min value must bigger than max value!");
			return -1;	
		}
		// die does not have a negative number 
		else if ( maxValue < 0 ) {
			System.out.println("Please, put a positive integer number! Example : 1, 2, 3");
			return -1;
		}
		// random number can not get lower than 1
		else if(maxValue == 1 && minValue == 1) {
			System.out.println("The number is 1");
			return 1;
		}
		// generating random number under the maxValue that user had selected
		else {
			Random range = new Random();
			
			int randomNum;
			
			randomNum = range.nextInt(maxValue - minValue) + minValue;
			
			System.out.println("Your random number is " + randomNum + ".");
			
			return randomNum;
		}
		
	}

}
