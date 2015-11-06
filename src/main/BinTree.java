/*
 * SOEN 331 - Assignment 2
 * Winter 2015
 * 
 * Sam Assaf - 6150748
 * Jessica Falco - 6597882
 * 
 */

package main;

import be.ac.ua.ansymo.adbc.annotations.ensures;
import be.ac.ua.ansymo.adbc.annotations.invariant;
import be.ac.ua.ansymo.adbc.annotations.requires;

@invariant("$this.height() != 0")
public class BinTree {

	private BinTree right;
	private BinTree left;
	
	private long id;
	
	@requires("id != null")
	@ensures({"$this.getRight() == null", "$this.getLeft() == null"})
	public BinTree(long id) {
		this.setId(id);
	}
	
	public BinTree getRight() {
		return right;
	}
	
	public BinTree getLeft() {
		return left;
	}
	
	@requires({"iBinTree != null", "$this.getLeft() == null || $this.getLeft() == iBinTree"})
	@ensures({"$this.getLeft() != null", "$this.getLeft() == iBinTree", "$old($this.hasLeft()) == false || $old($this.getLeft()) == $this.getLeft()"})
	public void setLeft(BinTree iBinTree) {
		left = iBinTree;
	}
	
	@requires({"iBinTree != null", "$this.getRight() == null || $this.getRight() == iBinTree"})
	@ensures({"$this.getRight() != null", "$this.getRight() == iBinTree", "$old($this.hasRight()) == false || $old($this.getRight()) == $this.getRight()"})
	public void setRight(BinTree iBinTree) {
		right = iBinTree;
	}
	
	public boolean hasLeft() {
		return (left != null);
	}
	
	public boolean hasRight() {
		return (right != null);
	}
	
	public int sumNodes() {
		
		int sum = 1;
		
		if (this.hasLeft()) {
			sum += left.sumNodes();
		}
		
		if (this.hasRight()) {
			sum += right.sumNodes();
		}
		
		return sum;
		
	}
	
	public int height() {
		
		int heightLeft = 0;
		int heightRight = 0;
		
		if (this.hasLeft()) {
			heightLeft = left.height();
		}
		
		if (this.hasRight()) {
			heightRight = right.height();
		}
		
		if (heightLeft >= heightRight) {
			return (1 + heightLeft);
		}
		
		else {
			return (1 + heightRight);
		}
		
		
	}
	
	//BalancedBinTree
	public boolean isBalanced() {
		
		int leftHeight = 0;
		int rightHeight = 0;
		
		boolean isBalancedLeft = true;
		boolean isBalancedRight = true;
		
		if (this.hasLeft()) {
			leftHeight = left.height();
			isBalancedLeft = left.isBalanced();
		}
		if (this.hasRight()) {
			rightHeight = right.height();
			isBalancedRight = right.isBalanced();
		}
		
		int diff = leftHeight - rightHeight;
		
		if (diff < 0) {
			diff *= -1;
		}
		
		return ((diff <= 1) && isBalancedLeft && isBalancedRight);
		
	}
	
	//FullBinaryTree
	public boolean isTwoOrNoLeaf() {
		
		if (hasLeft() && hasRight()) {
			
			return (left.isTwoOrNoLeaf() && right.isTwoOrNoLeaf());
			
		}
		
		else {
			return (!hasLeft() && !hasRight());
		}
		
	}
	
	@requires({"a != null", "b != null" , "$this.getLeft() == null || $this.getLeft() == a", "$this.getRight() == null || $this.getRight() == b"})
	@ensures({"$this.getLeft() != null", "$this.getLeft() == a", "$this.getRight() != null", "$this.getRight() == b", "$old($this.getLeft()) == null || $old($this.getLeft()) == $this.getLeft()", "$old($this.getRight()) == null || $old($this.getRight()) == $this.getRight()"})
	public void setLeftRight(BinTree a, BinTree b) {
		left = a; right = b;
	}
	
	public boolean sameHeight() {
		
		int heightLeft = 0;
		int heightRight = 0;
		
		boolean sameHeightLeft = true;
		boolean sameHeightRight = true;
		
		if (hasLeft()) {
			heightLeft = getLeft().height();
			
			sameHeightLeft = left.sameHeight();
			
		}	
		
		if (hasRight()) {
			heightRight = getRight().height();
			sameHeightRight = right.sameHeight();
			
		}
		
		return ((heightLeft == heightRight) && sameHeightLeft && sameHeightRight);
		
	}
	
	//Auto-generated Getter
	public long getId() {
		return id;
	}

	//Auto-generated Setter
	public void setId(long id) {
		this.id = id;
	}
	
	
}
