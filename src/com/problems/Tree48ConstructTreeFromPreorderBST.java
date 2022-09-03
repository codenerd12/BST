package com.problems;

public class Tree48ConstructTreeFromPreorderBST {
	
	
	private static TreeNode constructTree(int[] preOrder, int[] idx, int up) {
		
		if(idx[0]==preOrder.length || preOrder[idx[0]] > up)
			return null;
		
		TreeNode root = new TreeNode(preOrder[idx[0]++]);
		
		root.left = constructTree(preOrder, idx, root.data);
		root.right = constructTree(preOrder, idx, up);
		
		return root;
	}


	public static void main(String[] args) {
		
		/**
		 * 				8
		 * 
		 * 		5				10
		 * 
		 * 1		7				12
		 * 
		 * 
		 * 
		 */
		
		
		int[] preOrder = {8, 5, 1, 7, 10, 12}; 
		int[] idx = {0};
		TreeNode node = constructTree(preOrder, idx, Integer.MAX_VALUE);
		System.out.println(node);

	}

}
