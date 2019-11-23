package fracCalc;

import java.util.*;

public class FracCalc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Frac Calc");
		System.out.print("Enter an equation: ");
		String expression = s.nextLine();
		while (!expression.equalsIgnoreCase("quit")) {
			System.out.println(produceAnswer(expression));
			System.out.print("Enter an Expression: ");
			expression = s.nextLine();
		}
	}

	public static String produceAnswer(String expression) {
		String fraction = "";
		String operator = "";
		String fraction2 = "";
		int i = 0;
		while (fraction.equals("")) {
			if (expression.charAt(i) == (' ')) {
				fraction = expression.substring(0, 1);
				operator = expression.substring(i + 1, i + 2);
				fraction2 = expression.substring(i + 3);
			} else {
				i++;
			}

		}
		String operandtwoWhole = findWhole(fraction2);
		String operandtwoNum = findNum(fraction2);
		String operandtwoDenom = findDenom(fraction2);

		String check2Answer = "whole: " + operandtwoWhole + "numerator: " + operandtwoNum + "denominator: "
				+ operandtwoDenom;

		return check2Answer;
	}

	public static String findWhole(String str) {
		if (str.contains("_")) {
			return str.substring(0, str.indexOf('_'));
		} else if (str.contains("/")) {
			return "0";
		} else
			return str;

	}

	public static String findNum(String str) {
		if (str.contains("_")) {
			return str.substring(0, str.indexOf('_'));
		} else if (str.contains("/")) {
			return "0";
		} else {
			return "0";

		}

	}

	public static String findDenom(String str) {
		if (str.contains("/")) {
			return str.substring(str.indexOf("/") + 1);
		} else {
			return "1";

		}
	}
}
