package fracCalc;

import java.util.*;

public class FracCalc1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);
		String equation = userinput.nextLine();
		System.out.println(produceAnswer(equation));
		userinput.close();

	}

	public static String produceAnswer(String input) {
		int x = input.indexOf(' ');
		int y = input.length();
		String firstPart = input.substring(x+3,y);
		return firstPart;
	}
	
}
