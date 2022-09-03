package com.problems;

import java.util.Stack;

public class Tree50BSTIterator {
	
	private Stack<TreeNode> stack = new Stack<>();
	
	private Tree50BSTIterator(TreeNode root) {
		pushAll(root);
	}

	private int next() {
		
		TreeNode node = stack.pop();
		pushAll(node.right);
		return node.data;
	}
	
	private boolean hasNext() {
		return !stack.isEmpty();
	}
	
	private void pushAll(TreeNode node) {
		
		while(node!=null) {
			stack.push(node);
			node = node.left;
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
		root.right.left = new TreeNode(9);
		root.right.left.left = new TreeNode(8);
		
		Tree50BSTIterator it = new Tree50BSTIterator(root);
		
		System.out.print(it.next()+" ");
		System.out.print(it.next()+" ");
		System.out.print(it.next()+" ");
		System.out.print(it.next()+" ");
		System.out.print(it.next()+" ");
		System.out.print(it.next()+" ");
		System.out.print(it.next()+" ");
		
		
		

	}

}
