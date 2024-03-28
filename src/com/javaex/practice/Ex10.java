package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세용~ \n숫자 1:");
		
		int a = sc.nextInt();
		
		System.out.print("숫자 2:");
		
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("큰수: " + a + "	\t작은 수: " + b + "입니다.");
		} else {
			System.out.println("큰수: " + b + "	\t작은 수: " + a + "입니다.");
		}
		
		sc.close();

	}

}
