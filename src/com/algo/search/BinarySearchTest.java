package com.algo.search;

import com.algo.util.Util;

public class BinarySearchTest {
	
	private static int binarySearch(int [] numbers,int start,int end, int number) {
		
		if(end>=1) {
			int mid = start+(end-start)/2;
			if(numbers[mid]==number)
				return mid;
			
			if(numbers[mid]>number)
				return binarySearch(numbers,start,mid-1,number);
			
			
			return binarySearch(numbers,mid+1,end,number);
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int [] numbers = Util.generateRandomNumber(100);
		//Util.printNumbers(numbers);
		
		Util.sort(numbers);
		Util.printNumbers(numbers);
		
		int length = numbers.length;
		int numberToFind = 25;
		int index = binarySearch(numbers, 0, length-1, numberToFind);
		System.out.println("Number "+numberToFind+" found at index "+index);
		
	}

}
