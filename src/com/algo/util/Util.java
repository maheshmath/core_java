package com.algo.util;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Util {
	
	/**
	 * 
	 * @param int limit
	 * @return
	 */
	public static int[] generateRandomNumber(int limit) {
			
		int [] numbers = new int[limit];
		
		IntStream intStream = new Random().ints(0,limit*2).distinct().limit(limit);
		AtomicInteger ordinal = new AtomicInteger(0);
	
		intStream.forEach(number->{
			numbers[ordinal.getAndIncrement()]=number;
			
		});
		
		return numbers;
	}
	
	/**
	 * 
	 */
	public static void sort(int[] numbers) {
		Arrays.parallelSort(numbers);
	}
	
	public static void printNumbers(int []nums) {
		for(int index=0;index<nums.length;index++) {
			System.out.println(index+"-----"+nums[index]);
		}
	}

}
