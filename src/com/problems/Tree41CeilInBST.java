package com.problems;

public class Tree41CeilInBST {
	
	private static int ceil(TreeNode root, int key) {
		
		int ceil = -1;
		
		while(root!=null) {
			
			if(root.data==key)
				return key;
			
			if(root.data>key) {
				ceil = root.data;
				root = root.left;
			} else {
				root = root.right;
			}
		}
		
		return ceil;
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.left.right.right = new TreeNode(9);
		root.right = new TreeNode(13);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(2);
		root.left.left.right = new TreeNode(4);
		root.right.left = new TreeNode(11);
		root.right.right = new TreeNode(14);
		
		int key = 8;
		
		System.out.println("Ceil: "+ceil(root, key));

	}

}
