package com.problems;

public class Tree46ValidateBST {
	
	
	private static boolean isValidBST(TreeNode root, int min, int max) {
		
		if(root==null)
			return true;
		
		if(root.data>=max || root.data<=min) 
			return false;
		
		
		return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
	}

	public static void main(String[] args) {
		
		/**
		 * 				5
		 * 
		 * 		1				6
		 * 
		 * 					4		8
		 * 
		 * 
		 * Not valid BST
		 */
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(1);
		root.right = new TreeNode(6);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(8);
		
		System.out.println("IsValid BST: "+isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		
		/**
		 * 				5
		 * 
		 * 		1				7
		 * 
		 * 					6		8
		 * 
		 * 
		 * Valid BST
		 */
		TreeNode root1 = new TreeNode(5);
		root1.left = new TreeNode(1);
		root1.right = new TreeNode(7);
		root1.right.left = new TreeNode(6);
		root1.right.right = new TreeNode(8);
		
		System.out.println("IsValid BST: "+isValidBST(root1, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}

}
