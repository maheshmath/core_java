package com.algo.search;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;


public class SearchTest {

	private static int[] generateRandomNumber(int limit) {
		
		int [] numbers = new int[limit];
		
		IntStream intStream = new Random().ints(0,limit).distinct().limit(limit);
		AtomicInteger ordinal = new AtomicInteger(0);
	
		intStream.forEach(number->{
			numbers[ordinal.getAndIncrement()]=number;
			
		});
		
		return numbers;
	}
	
	private static int linearSearch(int [] values, int number) {
		
		for(int index=0;index<values.length;index++) {
			if (number==values[index]) {
				System.out.println("Attempt "+(index+1));
				return index;
			}
		}
		return -1;
	}
	
	private static void printNumbers(int []nums) {
		for(int index=0;index<nums.length;index++) {
			System.out.println(index+"-----"+nums[index]);
		}
	}
	
	private static int tunedLinearSearch(int [] values, int number) {
		int rightIndex = values.length-1;
		
		for(int index=0;index<=rightIndex;) {
			
			if (number==values[index]) {
				System.out.println("Left Attempt "+(index+1));
				return index;
			}
			if (number==values[rightIndex]) {

				System.out.println("Right Attempt "+(values.length-rightIndex));
				return rightIndex;
			}
			
			index++;
			rightIndex--;
		}
		return -1;
	}
	
	public static void main(String[] args) {

		int numberToFind = 23;
		int [] numbers = generateRandomNumber(5000000);
		//printNumbers(numbers);
		
		System.out.println("Linear Search");
		long startTime = System.currentTimeMillis();
		int index = linearSearch(numbers,numberToFind);	
		System.out.println("Value "+numberToFind+" found at index "+index);
		System.out.println("Time taken "+(System.currentTimeMillis()-startTime));
		
		
		//printNumbers(numbers);
		System.out.println("Improved Linear Search");
		startTime = System.currentTimeMillis();
		index = tunedLinearSearch(numbers,numberToFind);	
		System.out.println("Value "+numberToFind+" found at index "+index);
		System.out.println("Time taken "+(System.currentTimeMillis()-startTime));
	
	}
}
