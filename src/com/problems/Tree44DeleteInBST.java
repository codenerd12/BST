package com.problems;

public class Tree44DeleteInBST {
	
	private static TreeNode getSuccessor(TreeNode root) {
		
		TreeNode temp = root;
		
		while(temp.left!=null)
			temp = temp.left;
		
		
		return temp;
	}
	
	private static TreeNode deleteElement(TreeNode root, int key) {
		
		if(root==null)
			return null;
		
		
		if(root.data>key) {
			root.left = deleteElement(root.left, key);
		} else if(root.data<key) {
			root.right = deleteElement(root.right, key);
		} else {
			
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			else {
				
				TreeNode succ = getSuccessor(root.right);
				root.data = succ.data;
				root.right = deleteElement(root.right, succ.data);
			}
			
		}
		
		return root;
	}

	public static void main(String[] args) {
		
		
		/**
		 * 					5
		 * 			2				7
		 * 
		 * 		1		3		6		8
		 * 
		 * 					4
		 */
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(8);
		
		int key = 3;
		TreeNode node = deleteElement(root, key);
		
		System.out.println(node);
		
		

	}

}
