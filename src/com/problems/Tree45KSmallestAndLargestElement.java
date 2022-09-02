package com.problems;

public class Tree45KSmallestAndLargestElement {
	
	static int count=0;
	//Inverse of Inorder traversal using Morris(Right Root Left)
	public static int kthLargestUsingMorrisTraversal(TreeNode root, int k) {
		
		int res = 0;
		TreeNode cur = root;
		int count=0;
		while(cur!=null) {
			
			if(cur.right==null) {
				count++;
				if(count==k)
					res = cur.data;
				cur = cur.left;
			} else {
				
				TreeNode prev = cur.right;
				
				while(prev.left!=null && prev.left!=cur)
					prev = prev.left;
				
				if(prev.left==null) {
					prev.left = cur;
					cur = cur.right;
					
				} else {
					prev.left = null;
					count++;
					if(count==k)
						res = cur.data;
					cur = cur.left;
				}
				
				
			}
			
			
		}
		
		
		return res;
	}
	
	//Inorder Morris Traversal (Left Root Right)
	public static int kthSmallestUsingMorrisTraversal(TreeNode root, int k) {
		
		int res = 0;
		TreeNode cur = root;
		int count=0;
		while(cur!=null) {
			
			if(cur.left==null) {
				count++;
				if(count==k)
					res = cur.data;
				cur = cur.right;
			} else {
				
				TreeNode prev = cur.left;
				
				while(prev.right!=null && prev.right!=cur)
					prev = prev.right;
				
				if(prev.right==null) {
					prev.right = cur;
					cur = cur.left;
					
				} else {
					prev.right = null;
					count++;
					if(count==k)
						res = cur.data;
					cur = cur.right;
				}
				
				
			}
			
			
		}
		
		
		return res;
	}
	
	public static TreeNode inOrderTraversal(TreeNode root, int k) {
		
		if(root==null)
			return null;
		
		TreeNode left = inOrderTraversal(root.left, k);
		
		if(left!=null)
			return left;
		
			count++;
			
			if(count==k)
				return root;
			
		return inOrderTraversal(root.right, k);
		
	}

	public static void main(String[] args) {
		
		/**
		 * 						5
		 * 
		 * 				3					7
		 *		
		 *			1 			4		6		8
		 * 
		 * 				2
		 */
		
		
		
		
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(8);
		
		TreeNode node = inOrderTraversal(root, 3);
		System.out.println("Kth Smallest: "+node.data);
		
		int k = 6;
		int smallest = kthSmallestUsingMorrisTraversal(root, k);
		System.out.println("Kth Smallest: "+smallest);
		
		
		int k1 = 6;
		int largest = kthLargestUsingMorrisTraversal(root, k1);
		System.out.println("Kth Largest: "+largest);
		

	}

}
