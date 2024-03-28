package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		
		int cot = 0, i = 1;
		
		while (i < 4) {
			System.out.print("숫자" + i + ": ");
			int num = sc.nextInt();
			if (i == 1) {
				cot = num;
			} else {
				if (num < cot) {
					cot = num;
				}
			}
			i++;
		}

		System.out.println("가장 작은 숫자는 " + cot + "입니다.");
		sc.close();
	}

}
