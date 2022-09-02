package com.problems;

public class Tree47LCAInBST {
	
	
	private static TreeNode lca(TreeNode root, int n1, int n2) {
		
		if(root==null)
			return null;
		
		if(n1<root.data && n2<root.data)
			return lca(root.left, n1, n2);
		
		if(n1>root.data && n2>root.data)
			return lca(root.right, n1, n2);
			
		
		return root;
	}

	public static void main(String[] args) {
		
		
		/**
		 *				6
		 * 
		 * 		2					8
		 * 
		 * 0		4			7		9
		 * 
		 * 		3		5
		 * 
		 */
		
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(4);
		root.left.right.left = new TreeNode(3);
		root.left.right.right = new TreeNode(5);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);
		
		int n1 = 7;
		int n2 = 9;
		TreeNode node = lca(root, n1, n2);
		System.out.println("LCA: "+node.data);

	}

}
