package com.java2novice.algos;
public class RecursiveSearch {


    public static int recursiveSearch (int [] n, int start, int end, int key) {
    
		if (start < end) {
			int mid = start + (end - start) / 2;
			if (key < n[mid]) {
				return recursiveSearch(n, start, mid, key);

			} else if (key > n[mid]) {
				return recursiveSearch(n, mid + 1, end, key);

			} else {

				return mid;

			}
		}
		return -1;
       
    }
    
    public static void main (String [] args) {
        int [] arr = {5, 6, 7, 9, 10};
        System.out.println(recursiveSearch(arr, 0, arr.length, 10));
    }
    
    
}