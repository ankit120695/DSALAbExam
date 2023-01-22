package com.linear;


	public class LinearSearch {
	    public static int search(int[] arr, int item) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == item) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int item = 3;
	        int index = search(arr, item);
	        if (index != -1) {
	            System.out.println("Item found at index: " + index);
	        } else {
	            System.out.println("Item not found in the array.");
	        }
	    }
	}


	


