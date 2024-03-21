package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("나이를 입력해주세요. \n나이: ");
		
		int age = scanner.nextInt();
		
		String pri;
		
		if (age >= 20) {
			
			pri = "성인/5000원입니다.";
			
		}	else if (age > 16) {
			
			pri = "고등학생/4000원입니다.";
			
		}	else if (age > 13) {
			
			pri = "중학생/3000원입니다.";
			
		}	else if (age > 7) {
			
			pri = "초등학생/2000원입니다.";
			
		}	else {pri = "취학전아동/무료입니다.";
				
		}
			
		System.out.println(pri);
		
		scanner.close();
		
	}

}
