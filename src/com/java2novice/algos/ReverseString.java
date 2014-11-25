package com.java2novice.algos;

class ReverseString {

	public static void main(String[] args) {

		String str = "Sumit is a god boy";
		String outputStr = "";
		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) { // i =? 14
			temp += i != 0 ? str.charAt(i) : str.charAt(i) + " ";
			if (str.charAt(i) == ' ' || i == 0) {
				for (int j = temp.length() - 1; j >= 0; j--) {
					outputStr += temp.charAt(j);
				}
				temp = "";
			}
		}
		System.out.println(outputStr);
	}

}