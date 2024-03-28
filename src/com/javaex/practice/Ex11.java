package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		
		int a = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("몫: " + a / b + "\n나머지: " + a % b);
		} else {
			System.out.println("몫: " + b / a + "\n나머지: " + b % a);

		}
		
		sc.close();
	}

}
