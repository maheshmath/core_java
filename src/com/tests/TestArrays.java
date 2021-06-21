package com.tests;

public class TestArrays {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7,8,10};
		int index=0;
		for(index=0;index<nums.length;index++) {
			
			int number = nums[index];
			if ((index+1)-number!=0){
				System.out.println("Missing number "+(index+1));
			}
			System.out.println("Index "+index+" - "+nums[index]);
		}

	}

}
