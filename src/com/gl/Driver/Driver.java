package com.gl.Driver;
import com.gl.service.*;
import java.util.Scanner;

public class Driver {
	
	static BalancingBrackets bBObj = new BalancingBrackets();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
		
		
		String bracketExpression = sc.next();
		
		Boolean result;
		
		result = bBObj.CheckIfBracketsAreBalanced(bracketExpression);
		
		if(result)
		{
			System.out.println("The entered String has Balanced Brackets");
		}
		else
		{
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
