package fracCalc;

import java.util.Scanner;

public class FracCalc4 {
	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		System.out.println(
				"This program will parse the expression, displaying the second fraction's whole number, numerator, and denominator");
		System.out.println();
		System.out.print("Type in an expression (mixed fractions written like 3_3/4) OR type \"quit\":");
		String equation = userInput.nextLine();
		while (!equation.equals("quit")) {
			System.out.println(produceAnswer(equation));
			System.out.println();
			System.out.print("Type in an expression (mixed fractions written like 3_3/4) OR type \"quit\":");
			equation = userInput.nextLine();
		}
	}

	public static int produceAnswer(String input) {
		String frac1 = input.substring(0, input.indexOf(" "));
		String operator = input.substring(input.indexOf(" ") + 1, input.indexOf(" ") + 2);
		String frac2 = input.substring(input.indexOf(" ") + 3);
		String whole1 = frac1;
		String numerator1 = "0";
		String denominator1 = "1";
		if (frac1.indexOf("/") != -1) {
			if (frac1.indexOf("_") != -1) {
				whole1 = frac1.substring(0, frac1.indexOf("_"));
			} else {
				whole1 = "0";
			}
			numerator1 = frac1.substring(frac1.indexOf("_") + 1, frac1.indexOf("/"));
			denominator1 = frac1.substring(frac1.indexOf("/") + 1, frac1.length());
		}
		String whole2 = frac2;
		String numerator2 = "0";
		String denominator2 = "1";
		if (frac2.indexOf("/") != -1) {
			if (frac2.indexOf("_") != -1) {
				whole2 = frac2.substring(0, frac2.indexOf("_"));
			} else {
				whole2 = "0";
			}
			numerator2 = frac2.substring(frac2.indexOf("_") + 1, frac2.indexOf("/"));
			denominator2 = frac2.substring(frac2.indexOf("/") + 1, frac2.length());
		}
		int result = Integer.valueOf(numerator2);
		/*
		 * turn String into integer value of? ADDITION(check if operator.equals("+"))
		 * multiply denominator * whole + numerator --> numerator; if the denominator is
		 * not the same multiply denominator1 and denominator2 numerator2 * denominator1
		 * numerator1 * denominator2 add the numerators together/denominators together
		 * SUBTRACTION (check if operator.equals("-")) multiply denominator * whole +
		 * numerator --> numerator; if the denominator is not the same multiply
		 * denominator1 and denominator2 numerator2 * denominator1 numerator1 *
		 * denominator2 subtract the numerators together/denominators together
		 * MUTLIPLICATION (check if operator.equals("*")) multiply denominator * whole +
		 * numerator --> numerator; multiply the numerators together and denominators
		 * together if one of them is negative the result is negative DIVISION (check if
		 * operator.equals("/")) multiply denominator * whole + numerator --> numerator;
		 * switch the numerator with denominator of the second fraction multiply the
		 * numerators together and denominators together if one of them is negative the
		 * result is negative
		 */
		return result;
	}
}
