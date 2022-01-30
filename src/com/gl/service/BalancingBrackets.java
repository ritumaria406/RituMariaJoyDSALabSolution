package com.gl.service;

import java.util.Stack;

public class BalancingBrackets {
     
	public boolean CheckIfBracketsAreBalanced(String bracketExpression)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i< bracketExpression.length(); i++)
		{
			char character = bracketExpression.charAt(i);
			
			if(character == '(' || character == '[' || character == '{')
			{
				stack.push(character);
				continue;				
			}
			if(stack.empty())
			{
				return false;
			}
			
			char lastValue;
			switch(character)
			{
			case ')' :
				lastValue = stack.pop();
				if(lastValue == '{' || lastValue == '[')
				return false;				
				break;
			case ']' :			
				lastValue = stack.pop();
				if(lastValue == '{' || lastValue == '(')
				return false;
				break;	
			case '}' :			
				lastValue = stack.pop();
				if(lastValue == '[' || lastValue == '(')
				return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}