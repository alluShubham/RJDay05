package com.masai.RJ;

public class CompareString {
	
	public static void main(String[] args) {
		String s3 = "Value1";
		String s2 = "Value2";
		long time1, time2;

		time1 =System.nanoTime();
		for (int i = 0; i < 100000; ++i) {
				s3 = s3 + s2;
		}
		time2 =System.nanoTime();
		
		System.out.println(time2 - time1);
		
		StringBuffer s4 = new StringBuffer("Value1");
		String s5 = "Value2";

		time1 =System.nanoTime();
		
		for (int i = 0; i < 100000; ++i) {
			s4.append(s5);
		}
		time2 =System.nanoTime();
		System.out.println(time2 - time1);
	}

}
