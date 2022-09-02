package com.problems;

public class Tree42FloorInBST {
	
	private static int floor(TreeNode root, int key) {
		
		int floor = -1;
		
		while(root!=null) {
			
			if(key==root.data)
				return key;
			
			if(key>root.data) {
				floor = root.data;
				root = root.right;
			} else {
				root = root.left;
			}
			
			
		}
		
		
		return floor;
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(6);
		
		int key = 14;
		
		System.out.println("Floor: "+floor(root, key));

	}

}
