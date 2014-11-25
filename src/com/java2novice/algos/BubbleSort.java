package com.java2novice.algos;

public class BubbleSort {
	
	
	public static void main(String [] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input);
		 int[] arr1 = {10,34,2,56,7,67,88,42};
		int arr3 [] = selectionSort(arr1);
		for(int i:arr3){
            System.out.print(i);
            System.out.print(", ");
        }
		System.out.println("\n");
		int[] arr2 = {10,34,2,56,7,67,88,42};
		InsertionSort(arr2);
		
	}
	
	public static void bubbleSort(int[] n) {

		boolean swapped = true;
		int j = 0;
		int temp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < n.length - j; i++) 
				if (n[i] > n[i + 1]) {
					temp = n[i];
					n[i] = n[i + 1];
					n[i + 1] = temp;
					swapped = true;
				}
			
		}
		for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + ", ");
        }
        System.out.println("\n");
	}

	public static int[] selectionSort(int[] n) {

		for (int i = 0; i < n.length - 1; i++) { 
			int index = i; 
			for (int j = i + 1; j < n.length; j++) { 
				if (n[j] < n[index]) { 
					index = j; 
					int smallest = n[index]; 
					n[index] = n[i]; 
					n[i] = smallest; 
				}
			}
		}
		return n;
	}
	public static void InsertionSort(int [] n) {
		int temp ;

		for (int i =1; i <n.length; i++) {
		    for(int j = i; j > 0 ; j-- ) {
		        if(n[j] < n[j-1]) {
		        
		            temp = n[j];
		            n[j] = n[j-1];
		            n[j-1] = temp;
		        
		        }
		    
		    }
		}
		for(int k =0 ; k <n.length;k++ ) {

		    System.out.print(n[k] + ", ");

		}
		 System.out.println("\n");
	}	
}
