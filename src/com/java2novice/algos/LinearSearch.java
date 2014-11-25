package com.java2novice.algos;
public class LinearSearch {
 
 public static int searchKey(int [] n , int key ) {
        for (int i =0 ; i< n.length; i ++ ) {
    
            if(n[i] == key ) {
            System.out.println (" the key is found at "  + "index " + i + " value " + n[i] );
            }
    
        }
		return key;

    }

    
    
    public static void main (String [] args) {
        
        int [] arr1 ={2, 5, 7, 10, 15};
        searchKey(arr1, 7);
        
    
    }
    
 }