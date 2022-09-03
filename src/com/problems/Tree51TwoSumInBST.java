package com.problems;

import java.util.Stack;

public class Tree51TwoSumInBST {
	
	private Stack<TreeNode> stack = new Stack<>();
	private boolean isReverse;
	
	private Tree51TwoSumInBST(TreeNode root, boolean isReverse) {
		this.isReverse = isReverse;
		pushAll(root);
	}

	private int next() {
		TreeNode node = stack.pop();
		if(!isReverse)
			pushAll(node.right);
		else
			pushAll(node.left);
		return node.data;
	}
	
	private boolean hasNext() {
		return !stack.isEmpty();
	}
	
	private void pushAll(TreeNode node) {
		
		while(node!=null) {
			stack.push(node);
			
			if(!isReverse)
				node = node.left;
			else
				node = node.right;
		}
		
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(6);
		root.left.right.left = new TreeNode(5);
		root.left.right.left.left = new TreeNode(4);
		root.right = new TreeNode(10);
		root.right.right = new TreeNode(11);
		root.right.left = new TreeNode(9);
		root.right.left.left = new TreeNode(8);
		
		Tree51TwoSumInBST it1 = new Tree51TwoSumInBST(root, false);
		Tree51TwoSumInBST it2 = new Tree51TwoSumInBST(root, true);
		int k = 16;
		
		int lw = it1.next();
		int up = it2.next();
		
		while(lw<up) {
			
			if((lw+up)==k) {
				System.out.println("Found:["+lw+","+up+"]");
				break;
			} else if((lw+up) < k)
				lw = it1.next();
			  else
				up = it2.next();
				
		}

	}

}
