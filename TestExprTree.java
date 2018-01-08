package lab;

import java.util.Scanner;

public class TestExprTree {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("Enter expression madafacka");
		String expression = scanner.nextLine();


		ExprTree theTree = new ExprTree();
		theTree.build(expression);
		
		System.out.println("the computed value of " + expression+" is " + theTree.evaluate());
		theTree.expression();
		
	}
}
