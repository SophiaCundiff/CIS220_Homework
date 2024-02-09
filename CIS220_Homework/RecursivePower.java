// Sophia Cundiff
// Chpt2 PA

import java.util. Scanner;

public class RecursivePower {
	
	public static double power(int base, int exponent, double baseExponent) {
		
		if (exponent == 1) {
			return baseExponent = base;
		}
		else 
			return baseExponent = base * Math.pow(base, exponent);
	}
		
	public static void main(String[] args) {
		int base;
		int exponent;
		double baseExponent = 0;
		Scanner scnr = new Scanner(System.in);
		
		// Get the base and exponent from the user
		System.out.println("Enter base: ");
		base = scnr.nextInt();
		System.out.println("Enter exponent: ");
		exponent = scnr.nextInt();
		
		// Call the power method to calculate baseExponent
		baseExponent = power(base, exponent, baseExponent);
		
		// Output the baseExponent
		System.out.println("Value is " + baseExponent);
		
	}
}