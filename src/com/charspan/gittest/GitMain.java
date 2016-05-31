package com.charspan.gittest;

public class GitMain {

	/**
	 * 计算两个整数之和
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int getSum(int num1, int num2) {
		
		int res;
		res = num1 + num2;
		return res;
		
	}

	public static void main(String[] args) {
		
		System.out.println(getSum(1, 3));
		
	}
	
}
