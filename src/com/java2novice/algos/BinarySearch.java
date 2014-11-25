package com.java2novice.algos;

public class BinarySearch {

	public static void binarySearch(int[] n, int key) {

		int i = 0;
		int j = n.length - 1;
		while (i <= j) {

			int midLen = (i + j) / 2;

			if (key == n[midLen]) {
				System.out.println(" the key is found at " + "index " + midLen
						+ " value " + key);
			}

			// This can be useful only when it is sorted
			if (key < n[midLen]) {
				j = midLen - 1;
			} else {
				i = midLen + 1;
			}

		}

	}

	public static void main(String[] args) {
		 int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		binarySearch(arr, 8);

	}

}