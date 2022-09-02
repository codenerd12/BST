package com.problems;

public class Tree43InsertInBST {
	
	private static TreeNode insert(TreeNode root, int key) {
		
		TreeNode temp = root;
		TreeNode prev = null;
		while(temp!=null) {
			
			prev = temp;
			
			if(temp.data>key)
				temp = temp.left;
			else
				temp = temp.right;
			
		}
		
		if(prev.data<key)
			prev.right = new TreeNode(key);
		else
			prev.left = new TreeNode(key);
		
		return root;
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		TreeNode node = insert(root, 5);
		System.out.println(node);

	}

}
