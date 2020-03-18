package com.syntax.class10;

public class TwoDimensionalArrays1 {

	public static void main(String[] args) {
		int nums[][]= {{1,2,3,4},
					   {10,20,30,40,60,80,-1},
					   {20,40,60,80,90,100,110},
					   {3,4,5,6}};
		System.out.println(nums[1][1]);
		System.out.println(nums[2][3]);
		System.out.println(nums[1][3]);
		
		int x=2, y=2;
		System.out.println(nums[x][y]);
		System.out.println("****************FOR EACH LOOP **********************");
		
		for(int i=0;i<nums.length;i++) {        //iterate over rows
			for(int j=0;j<nums[i].length;j++) {   //iterate over colomns
				System.out.print(nums[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("***************NESTED FOR EACH LOOP****************");
		for(int[] arrays:nums) {        //iterate over rows
			for(int items:arrays) {   //iterate over colomns
				System.out.print(items+" ");
			}
			System.out.println("");
		}
		
	}

}
