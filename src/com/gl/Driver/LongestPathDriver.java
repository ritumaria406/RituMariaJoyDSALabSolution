package com.gl.Driver;

import java.util.ArrayList;


public class LongestPathDriver {

	//Initializing Node class
	static class Node {
		int key;
		Node leftNode,rightNode;
		};
		
		// creation of new node
		static Node newNode(int data) {
			Node temp = new Node();
			temp.key = data;
			temp.leftNode = null;
			temp.rightNode = null;
			return temp;
			}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = newNode(100);
		root.leftNode =  newNode(20);
		root.rightNode =  newNode(130);
		root.leftNode.leftNode =  newNode(10);
		root.leftNode.rightNode =  newNode(50);
		root.leftNode.leftNode.leftNode =  newNode(5);
		root.rightNode.leftNode =  newNode(110);
		root.rightNode.rightNode =  newNode(140);
		
		ArrayList<Integer> output = findTheLongestPath(root);
		int size = output.size();
		System.out.print("Longest Path "); 
		for(int i=size-1 ; i>=0 ; i-- )
		{
			System.out.print(output.get(i));
			if( i != 0)
			{
				System.out.print(" -> ");
			}
		}
	}

	
	private static ArrayList<Integer> findTheLongestPath(Node root) {
		// Method used to find the longest path. Recursive function
		
		if(root == null)
		{
			ArrayList<Integer> output = new ArrayList<Integer>();
			return output;
		}
		
		ArrayList<Integer> rightArray = findTheLongestPath(root.rightNode);
		ArrayList<Integer> leftArray = findTheLongestPath(root.leftNode);
		
		if(rightArray.size() > leftArray.size())
		{
			rightArray.add(root.key);
		}
		else
		{
			leftArray.add(root.key);
		}
		
		return (leftArray.size() > rightArray.size() ? leftArray  : rightArray);

		}		
}
