import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args)
	
	{
		
		// Ask the user for five numbers
        Scanner userInput = new Scanner(System.in);
        System.out.println("Give me a number:");
        int num1 = Integer.parseInt(userInput.nextLine());
        System.out.println("Give me a second number:");
      	int num2 = Integer.parseInt(userInput.nextLine());
        System.out.println("Give me a third number:");
        int num3 = Integer.parseInt(userInput.nextLine());
        System.out.println("Give me a fourth number:");
        int num4 = Integer.parseInt(userInput.nextLine());
        System.out.println("Give me a final number:");
        int num5 = Integer.parseInt(userInput.nextLine());
		
        // Store the numbers in a list
        List<Integer> numList = new ArrayList<>();
			numList.add(num1);
			numList.add(num2);
			numList.add(num3);
			numList.add(num4);
			numList.add(num5);
		System.out.println(numList);
		
		//Find the sum of the numbers
		int sum = 0;
		for(int i : numList) {
			sum += i;
		}
		System.out.println("The sum of the numbers in the list is " +sum);
		
		//Find the product of the numbers
		int product = 1;
		for(int i : numList) {
			product = product * i;
		}
		System.out.println("The product of the numbers in the list is " +product);
		
		//Find the largest and smallest numbers in the list
		Collections.sort(numList);
		System.out.println("The largest number is " +numList.get(4));
		System.out.println("The smallest number is " +numList.get(0));
	}

}
