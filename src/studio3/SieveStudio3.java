package studio3;

import java.util.Scanner;

public class SieveStudio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Up to what number would you like to check for primes: ");
		int maxNumber = in.nextInt();
		int currentNumber =2;
		
		
		
		boolean isPrime = true;
		
		int a=2;
		
		while (currentNumber<maxNumber) {
			
			while (a<currentNumber) {
				
				if (currentNumber%a == 0) {		
					isPrime = false;	
				}
				a++;
			}

			if (isPrime == true) {
				System.out.println(currentNumber);
			}
			isPrime = true;
			
			currentNumber = currentNumber+1;
			a = 2;
		}
			
	}

}
