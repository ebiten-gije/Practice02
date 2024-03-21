package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요. \n나이: ");
		
		int a = scanner.nextInt();
		
		String gro;
		
		if (a < 19) {gro = "2번그룹";
			
		} else { 
			
			if (a >= 65) {gro = "2번그룹";
		
			} else {gro = "1번그룹";
			
				}

		}
		
		System.out.println(gro + "입니다.");
		
		scanner.close();
	
	}
	
}
