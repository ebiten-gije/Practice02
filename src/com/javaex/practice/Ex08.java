package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키와 몸무게를 입력해 주십시오. \n키: ");
		
		double h = scanner.nextDouble();
		
		System.out.print("몸무게: ");
		
		double w = scanner.nextDouble();
		
		double bmi;
		
		bmi = w / (h * h) * 10000;
		
		String jansori;
		
		if (bmi < 18.5) {jansori = "저체중입니다. \nBMI: ";
				
		} else if (bmi >= 25) {
			
			jansori = "과체중입니다. \nBMI: ";
			
		} else {jansori = "정상체중입니다. \nBMI: ";
		
		}
		
		System.out.println(jansori + bmi);
		
		scanner.close();
		
	}

}
