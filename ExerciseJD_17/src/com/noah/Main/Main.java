package com.noah.Main;

import java.util.Scanner;

/**
 * <h1>includes method for printing a matrix of ones and zeros with a certain width.</h1>
 * 
 * @author Noah Smith
 *
 */

public class Main {
	/**
	 * Usage:
	 * 
	 * <pre>
	 * {@code printMatrix(3) returns
	 * n n n
	 * n n n
	 * n n n}
	 * </pre>
	 * 
	 * @param n (int; width of matrix)
	 */
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int r = (int)(Math.random() * 2);
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}
}
