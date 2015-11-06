/*
 * SOEN 331 - Assignment 2
 * Winter 2015
 * 
 * Sam Assaf - 6150748
 * Jessica Falco - 6597882
 * 
 */

package main;

import be.ac.ua.ansymo.adbc.annotations.invariant;

@invariant({"$super", "$this.sameHeight()"})
public class PerfectBinaryTree extends FullBinaryTree {

	public PerfectBinaryTree(long id) {
		super(id);
	}

}
