/*
 * SOEN 331 - Assignment 2
 * Winter 2015
 * 
 * Sam Assaf - 6150748
 * Jessica Falco - 6597882
 * 
 */

package main;

public class Main {

	public static void testBinTree() {
		
		BinTree b, b1, b2;
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//BinTree contracts
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		//***************************
		//BinTree contract 1
		//***************************
		/*
		
		The definition of b will test the invariant.
		
		To make it fail, add the following piece of code to the top of the BinTree.height() method: 
		 
			 		if (true)
						return 0;
		 
		 */
		
		//***************************
		//BinTree contract 2
		//***************************
		/*
		
		The definition of b will test the constructor precondition.
		
		Failure untestable since a long cannot be given a null value;
		
		
		*/
		
		//***************************
		//BinTree contract 3
		//***************************
		/*
		
		The definition of b will test the postcondition.
		
		To make it fail, first add the following constructor:
		
					public BinTree() {
						id = 0;
					}
					
		
		Then add the following piece of code to the top of BinTree(long id) constructor.
		
					right = new BinTree();
		
		Run the main method then replace the above snippet with the following
		
					left = new BinTree();
		
		 */
		
		try {
			b = new BinTree(1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0); //Nothing else will pass
		}
		
		//***************************
		//Success test for BinTree contracts 4, 5, 6, and 7
		//***************************
		
		b = new BinTree(1);	
		b1 = new BinTree(4);
		try {
			b.setLeft(b1);
		}
		catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0);
		}
		
		//***************************
		//BinTree contract 4 Failure test
		//***************************
		
		b = new BinTree(1);		
		
		b1 = null;
		
		try {
			b.setLeft(b1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 5 Failure Test
		//***************************
		
		b = new BinTree(1);
		b1 = new BinTree(4);
		b2 = new BinTree(5);
		
		b.setLeft(b1);

		
		try {	
			b.setLeft(b2);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 6 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					left = null;

		 */
		
		//***************************
		//BinTree contract 7 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					left = new BinTree(4);

		 */
		
		
		//***************************
		//Success test for BinTree contracts 8, 9, 10, and 11
		//***************************
		
		b = new BinTree(1);	
		b1 = new BinTree(4);
		try {
			b.setRight(b1);
		}
		catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0);
		}
		
		//***************************
		//BinTree contract 8 Failure test
		//***************************
		
		b = new BinTree(1);		
		
		b1 = null;
		
		try {
			b.setRight(b1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 9 Failure Test
		//***************************
		
		b = new BinTree(1);
		b1 = new BinTree(4);
		b2 = new BinTree(5);
		
		b.setRight(b1);

		
		try {	
			b.setRight(b2);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 10 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setRight(BinTree iBinTree):
					
					right = null;

		 */
		
		//***************************
		//BinTree contract 11 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setRight(BinTree iBinTree):
					
					right = new BinTree(4);

		 */
		
	}
	
	public static void testBalancedBinTree() {
		
		BalancedBinTree b, b1, b2;
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//BinTree contracts INHERITANCE
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		//***************************
		//BinTree contract 1
		//***************************
		/*
		
		The definition of b will test the invariant.
		
		To make it fail, add the following piece of code to the top of the BinTree.height() method: 
		 
			 		if (true)
						return 0;
		 
		 */
		
		//***************************
		//BinTree contract 2
		//***************************
		/*
		
		The definition of b will test the constructor precondition.
		
		Failure untestable since a long cannot be given a null value;
		
		
		*/
		
		//***************************
		//BinTree contract 3
		//***************************
		/*
		
		The definition of b will test the postcondition.
		
		To make it fail, first add the following constructor:
		
					public BinTree() {
						id = 0;
					}
					
		
		Then add the following piece of code to the top of BinTree(long id) constructor.
		
					right = new BinTree();
		
		Run the main method then replace the above snippet with the following
		
					left = new BinTree();
		
		 */
		
		try {
			b = new BalancedBinTree(1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0); //Nothing else will pass
		}
		
		//***************************
		//Success test for BinTree contracts 4, 5, 6, and 7
		//***************************
		
		b = new BalancedBinTree(1);	
		b1 = new BalancedBinTree(4);
		try {
			b.setLeft(b1);
		}
		catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0);
		}
		
		//***************************
		//BinTree contract 4 Failure test
		//***************************
		
		b = new BalancedBinTree(1);		
		
		b1 = null;
		
		try {
			b.setLeft(b1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 5 Failure Test
		//***************************
		
		b = new BalancedBinTree(1);
		b1 = new BalancedBinTree(4);
		b2 = new BalancedBinTree(5);
		
		b.setLeft(b1);

		
		try {	
			b.setLeft(b2);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 6 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					left = null;

		 */
		
		//***************************
		//BinTree contract 7 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					left = new BinTree(4);

		 */
		
		
		//***************************
		//Success test for BinTree contracts 8, 9, 10, and 11
		//***************************
		
		b = new BalancedBinTree(1);	
		b1 = new BalancedBinTree(4);
		try {
			b.setRight(b1);
		}
		catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0);
		}
		
		//***************************
		//BinTree contract 8 Failure test
		//***************************
		
		b = new BalancedBinTree(1);		
		
		b1 = null;
		
		try {
			b.setRight(b1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 9 Failure Test
		//***************************
		
		b = new BalancedBinTree(1);
		b1 = new BalancedBinTree(4);
		b2 = new BalancedBinTree(5);
		
		b.setRight(b1);

		
		try {	
			b.setRight(b2);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 10 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setRight(BinTree iBinTree):
					
					right = null;

		 */
		
		//***************************
		//BinTree contract 11 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setRight(BinTree iBinTree):
					
					right = new BinTree(4);

		 */
		
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//BalancedBinTree contracts
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		b = new BalancedBinTree(1);
		
		BinTree b3 = new BinTree(2);
		BinTree b4 = new BinTree(3);
		BinTree b5 = new BinTree(5);
		
		//Passing test
		b4.setLeft(b5);
		b3.setLeft(b4);
		
		BinTree b6 = new BinTree(4);
		
		b.setRight(b6);
		
		//Failure expected
		try {
			b.setLeft(b3);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//The following example displays a limitation of adbc
		//Theoretically this should fail, but it will pass because the invariant is not checked in all instances.
		
		b = new BalancedBinTree(1);
		
		b3 = new BinTree(2);
		b4 = new BinTree(3);
		
		b.setRight(b3);
		b3.setRight(b4);
		
		//b is no longer balanced but the invariant was not checked since the method that unbalanced it was called in b3.
		
		
	}
	
	public static void testFullBinaryTree() {
		
		FullBinaryTree b, b1, b2;
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//BinTree contracts INHERITANCE
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		//***************************
		//BinTree contract 1
		//***************************
		/*
		
		The definition of b will test the invariant.
		
		To make it fail, add the following piece of code to the top of the BinTree.height() method: 
		 
			 		if (true)
						return 0;
		 
		 */
		
		//***************************
		//BinTree contract 2
		//***************************
		/*
		
		The definition of b will test the constructor precondition.
		
		Failure untestable since a long cannot be given a null value;
		
		
		*/
		
		//***************************
		//BinTree contract 3
		//***************************
		/*
		
		The definition of b will test the postcondition.
		
		To make it fail, first add the following constructor:
		
					public BinTree() {
						id = 0;
					}
					
		
		Then add the following piece of code to the top of BinTree(long id) constructor.
		
					right = new BinTree();
		
		Run the main method then replace the above snippet with the following
		
					left = new BinTree();
		
		 */
		
		try {
			b = new FullBinaryTree(1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0); //Nothing else will pass
		}
		
		//***************************
		//BinTree contracts 4, 5, 6, 7, 8, 9, 10, and 11 success
		//***************************
		/*
		These contracts cannot be tested individually in this case due to the restriction
		Will use BinTree.setLeftRight(BinTree a, BinTree b) instead
		 */
		
		b = new FullBinaryTree(1);
		
		b1 = new FullBinaryTree(2);
		b2 = new FullBinaryTree(3);
		
		try {
			b.setLeftRight(b1, b2);
		}
		catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0); //Nothing else will pass
		}
		
		
		//***************************
		//BinTree contract 4 Failure test
		//***************************
		
		b = new FullBinaryTree(1);		
		
		b1 = null;
		b2 = new FullBinaryTree(2);
		
		try {
			b.setLeftRight(b1, b2);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 5 Failure Test
		//***************************
		
		b = new FullBinaryTree(1);
		b1 = new FullBinaryTree(4);
		b2 = new FullBinaryTree(5);
		BinTree b3 = new BinTree(6);
		
		b.setLeftRight(b1, b2);
		
		try {	
			b.setLeftRight(b3, b2);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 6 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					left = null;

		 */
		
		//***************************
		//BinTree contract 7 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					left = new BinTree(4);

		 */
		
		//***************************
		//BinTree contract 8 Failure test
		//***************************
		
		b = new FullBinaryTree(1);		
		
		b1 = null;
		b2 = new FullBinaryTree(2);
		
		try {
			b.setLeftRight(b2, b1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 9 Failure Test
		//***************************
		
		b = new FullBinaryTree(1);
		b1 = new FullBinaryTree(4);
		b2 = new FullBinaryTree(5);
		b3 = new BinTree(6);
		
		b.setLeftRight(b1, b2);
		
		try {	
			b.setLeftRight(b1, b3);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 10 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					right = null;

		 */
		
		//***************************
		//BinTree contract 11 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					right = new BinTree(4);

		 */
		
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//FullBinaryTree contracts
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		b = new FullBinaryTree(1);
		
		BinTree l = new BinTree(3);
		l.setLeft(new BinTree(4));
		l.setRight(new BinTree(5));
		
		BinTree m = new BinTree(6);
		m.setRight(new BinTree(1));
		
		//This is a demonstration of an invalid Full Binary Tree
		try {
			b.setLeftRight(l, m);
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//The following example displays a limitation of adbc
		//Theoretically this should fail, but it will pass because the invariant is not checked in all instances.
		
		b = new FullBinaryTree(1);
		BinTree b4 = new BinTree(2);
		BinTree b5 = new BinTree(3);
		
		b.setLeftRight(b4, b5);
		
		b5.setLeft(new BinTree(4));
		
		//b is no longer full but the invariant was not checked since the method that made it not full was called in b5.
		
		//The following example displays a limitation of adbc
		/*
		This example will fail due to the invariant being violated. However adbc is unable to retrieve the invariant
		from the dynamic type. This will result in a NullPointerException occuring deep within the adbc library.
		*/
		
		BinTree t1 = new FullBinaryTree(1);
		try {
			//t1 will no longer be a valid FullBinaryTree but adbc will not find where the contract was broken
			t1.setLeft(new BinTree(2));
		}
		catch(Exception e) {
			System.out.println("See line 724");
			System.out.println(e.toString());
		}
		
	}
	
	public static void testPerfectBinaryTree() {
		
		PerfectBinaryTree b, b1, b2;
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//BinTree contracts INHERITANCE
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		//***************************
		//BinTree contract 1
		//***************************
		/*
		
		The definition of b will test the invariant.
		
		To make it fail, add the following piece of code to the top of the BinTree.height() method: 
		 
			 		if (true)
						return 0;
		 
		 */
		
		//***************************
		//BinTree contract 2
		//***************************
		/*
		
		The definition of b will test the constructor precondition.
		
		Failure untestable since a long cannot be given a null value;
		
		
		*/
		
		//***************************
		//BinTree contract 3
		//***************************
		/*
		
		The definition of b will test the postcondition.
		
		To make it fail, first add the following constructor:
		
					public BinTree() {
						id = 0;
					}
					
		
		Then add the following piece of code to the top of BinTree(long id) constructor.
		
					right = new BinTree();
		
		Run the main method then replace the above snippet with the following
		
					left = new BinTree();
		
		 */
		
		try {
			b = new PerfectBinaryTree(1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0); //Nothing else will pass
		}
		
		//***************************
		//BinTree contracts 4, 5, 6, 7, 8, 9, 10, and 11 success
		//***************************
		/*
		These contracts cannot be tested individually in this case due to the restriction
		Will use BinTree.setLeftRight(BinTree a, BinTree b) instead
		 */
		
		b = new PerfectBinaryTree(1);
		
		b1 = new PerfectBinaryTree(2);
		b2 = new PerfectBinaryTree(3);
		
		try {
			b.setLeftRight(b1, b2);
		}
		catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Program will now exit since the methods have been tampered with.");
			System.exit(0); //Nothing else will pass
		}
		
		
		//***************************
		//BinTree contract 4 Failure test
		//***************************
		
		b = new PerfectBinaryTree(1);		
		
		b1 = null;
		b2 = new PerfectBinaryTree(2);
		
		try {
			b.setLeftRight(b1, b2);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 5 Failure Test
		//***************************
		
		b = new PerfectBinaryTree(1);
		b1 = new PerfectBinaryTree(4);
		b2 = new PerfectBinaryTree(5);
		BinTree b3 = new BinTree(6);
		
		b.setLeftRight(b1, b2);
		
		try {	
			b.setLeftRight(b3, b2);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 6 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					left = null;

		 */
		
		//***************************
		//BinTree contract 7 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					left = new BinTree(4);

		 */
		
		//***************************
		//BinTree contract 8 Failure test
		//***************************
		
		b = new PerfectBinaryTree(1);		
		
		b1 = null;
		b2 = new PerfectBinaryTree(2);
		
		try {
			b.setLeftRight(b2, b1);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 9 Failure Test
		//***************************
		
		b = new PerfectBinaryTree(1);
		b1 = new PerfectBinaryTree(4);
		b2 = new PerfectBinaryTree(5);
		b3 = new BinTree(6);
		
		b.setLeftRight(b1, b2);
		
		try {	
			b.setLeftRight(b1, b3);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//***************************
		//BinTree contract 10 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					right = null;

		 */
		
		//***************************
		//BinTree contract 11 Failure test
		//***************************
		/*
		
		To make it fail, add the following line at the end of BinTree.setLeft(BinTree iBinTree):
					
					right = new BinTree(4);

		 */
		
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//FullBinaryTree contracts INHERITANCE
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		//This is a demonstration of an invalid Full Binary Tree
		
		b = new PerfectBinaryTree(1);
		
		BinTree l = new BinTree(3);
		l.setLeft(new BinTree(4));
		l.setRight(new BinTree(5));
		
		BinTree m = new BinTree(6);
		m.setRight(new BinTree(7));
		
		try {
			b.setLeftRight(l, m);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//PerfectBinaryTree contract
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		b = new PerfectBinaryTree(1);
		
		l = new BinTree(3);
		l.setLeft(new BinTree(4));
		l.setRight(new BinTree(5));
		
		m = new BinTree(6);
		
		//This is a demonstration of an invalid Perfect Binary Tree that is a Perfect Binary Tree
		try {
			b.setLeftRight(l, m);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		//The following example displays a limitation of adbc
		//Theoretically this should fail because b is no longer a valid FullBinaryTree, 
		//but it will pass because the invariant is not checked in all instances.
		
		b = new PerfectBinaryTree(1);
		BinTree b4 = new BinTree(2);
		BinTree b5 = new BinTree(3);
		
		b.setLeftRight(b4, b5);
		
		b5.setLeft(new BinTree(4));
		
		//b is no longer perfect but the invariant was not checked since the method that made it not perfect was called in b5.
		
		
		//Another example of the same limitation
		//Theoretically this should fail because b is no longer a valid PerfectBinaryTree,
		//but it will pass because the invariant is not checked in all instances.
		
		b = new PerfectBinaryTree(1);
		b4 = new BinTree(2);
		b5 = new BinTree(3);
		
		b.setLeftRight(b4, b5);
		
		b4.setLeftRight(new BinTree(4), new BinTree(5));
		
		//b is no longer perfect but the invariant was not checked since the method that made it not perfect was called in b4.
		
		
		//The following example displays a limitation of adbc
		/*
		This example will fail due to the invariant being violated. However adbc is unable to retrieve the invariant
		from the dynamic type. This will result in a NullPointerException occuring deep within the adbc library.
		*/
		
		BinTree t1 = new PerfectBinaryTree(1);
		try {
			//t1 will no longer be a valid FullBinaryTree but adbc will not find where the contract was broken
			t1.setLeft(new BinTree(2));
		}
		catch(Exception e) {
			System.out.println("See line 1017");
			System.out.println(e.toString());
		}
		
		//Another version of the same limitation.
		
		t1 = new PerfectBinaryTree(1);
		BinTree t2 = new BinTree(2);
		t2.setLeftRight(new BinTree(4), new BinTree(5));
		BinTree t3 = new BinTree(3);
		
		try {
			//t1 will no longer be a valid PerfectBinaryTree but adbc will not find where the contract was broken
			t1.setLeftRight(t2, t3);
		}
		catch(Exception e) {
			System.out.println("See line 1032");
			System.out.println(e.toString());
		}
		
	}
	
	public static void main(String[] args) {

		//In order to test the specifications, please uncomment only the test method you want to call.
		//NOTE: Each method also re-tests all of the specifications of the super class.
		
		//testBinTree();
		
		//testBalancedBinTree();
		
		//testFullBinaryTree();
		
		testPerfectBinaryTree();

		
	}

}
