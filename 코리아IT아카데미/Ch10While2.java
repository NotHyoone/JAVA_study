import java.util.Scanner;

public class Ch10While2 {
	public static void main(String[] args) {
		
		// 중첩 while문
		
		// 구구단 2단 출력
//		System.out.println("2 X 1 = 2");
//		System.out.println("2 X 2 = 4");
//		System.out.println("2 X 3 = 6");
//		System.out.println("2 X 4 = 8");
//		System.out.println("2 X 5 = 10");
//		System.out.println("2 X 6 = 12");
//		System.out.println("2 X 7 = 14");
//		System.out.println("2 X 8 = 16");
//		System.out.println("2 X 9 = 18");
//		
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("2 X %d = %d\n", i, 2 * i);
//			i++;
//		}
//		System.out.println();	
//		
//		int j = 1;
//		while (j <= 9) {
//			System.out.printf("3 X %d = %d\n", j, 3 * j);
//			j++;
//		}
//		
//		
//		int k = 1;
//		while (k <= 9) {
//			System.out.printf("4 X %d = %d\n", k, 4 * k);
//			k++;
//		}
//		
//		
//		int dan = 2;
//	
//		while (dan <= 9) {
//			int i = 1;
//			while (i <= 9) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			dan++;
//		}
		
		
//		1일차 1교시 
//		1일차 2교시 
//		1일차 3교시
	
//		2일차 1교시 
//		2일차 2교시 
//		2일차 3교시
		
//		int day = 1;
//		while (day <= 2) {
//			
//			int num = 1;
//			while (num <= 3) {
//				System.out.printf("%d일차 %d교시\n", day, num);
//				num++;
//			}
//			
//			day++;
//		}
		
		//문제
		//구구단 2단 출력 ( 생략) 
		
		//문제
		//구구단 2단 출력(역순출력)
		
//
//		int i = 9;
//		while (i >= 1) {
//			System.out.printf("2 X %d = %d\n", i, 2 * i);
//			i--;
//		}
//		System.out.println();	
		
		//문제
		//구구단 N단 출력(입력받기)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("N단을 입력해주세요 >>>");
//		int number = sc.nextInt(); 		// 5
//
//		int i = 1;
//		while (i <= 9) {
//			System.out.printf("%d X %d = %d\n", number, i, number * i);
//			i++;
//		}
//		System.out.println();
		
		
		//문제
		//구구단 N단 출력(입력받기,역순출력) (별첨 ... 2<=N<=9)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("N단을 입력해주세요 >>>");
//		int number = sc.nextInt(); 		// 5
//
//		int i = 9;
//		while (i >= 1) {
//			System.out.printf("%d X %d = %d\n", number, i, number * i);
//			i--;
//		}
//		System.out.println();
		
		//전체 구구단(2단-9단) 출력하기 ( 생략 )
		
		//N부터 9단까지 전체 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("N단을 입력하세요 >>>");
//		int N = sc.nextInt();		// 2
//		
//		int dan = N; 
//		while(dan <= 9) {
//			int i = 1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		
		//전체 구구단(2단-9단) 출력하기 (단만 역순출력)
//		int dan = 9; 
//		while(dan >= 2) {
//			int i = 1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
		
		//전체 구구단(2단-9단) 출력하기 (전체 역순출력)
//		int dan = 9; 
//		while(dan >= 2) {
//			int i = 9;
//			while(i >= 1) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		//1
		//*****
		//*****
		//*****
		//*****
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
//		int i = 1;
//		while (i <= 4) {
//			int j = 1;
//			while (j <= 5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//높이 : n
		//*****
		//*****
		//*****
		//*****
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 : ");
//		int height = sc.nextInt();		// 4
//		int i = 1;
//		while (i <= height) {
//			// 별을 찍는 행위 5개씩 출력 + 엔터(줄바꿈)
//			int j = 1;
//			while (j <= 5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			
//			i++;
//		}
//		
		
		
		
		
		
		//2
		//*
		//**
		//***
		//****
//		System.out.println("*");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
//		
//		// 별을 찍고 줄바꿈(개행문자) 출력 X 4
//		int i = 1;
//		while (i <= 4) {
//			// 별을 찍는 행위 + 개행문자 (공통요소)
//			// 별을 찍는 행위 (각 반복마다 달리)
//			int j = 1;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			// i와 별의 반복횟수가 관계성을 가진다.
//			
//			// 개행 문자 (모든 반복에서 공통적으로 출력)
//			System.out.println();
//			i++;
//		}
//		
		
		
		//높이 : N
		//*
		//**
		//***
		//****
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 : ");
//		int height = sc.nextInt();
//		
//		// 별을 찍고 줄바꿈(개행문자) 출력 X 4
//		int i = 1;
//		while (i <= height) {
//			// 별을 찍는 행위 + 개행문자 (공통요소)
//			// 별을 찍는 행위 (각 반복마다 달리)
//			int j = 1;
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			// i와 별의 반복횟수가 관계성을 가진다.
//			
//			// 개행 문자 (모든 반복에서 공통적으로 출력)
//			System.out.println();
//			i++;
//		}
//		
		
		
		//3
		//****
		//***
		//**
		//*
//		
//		int i = 1;
//		while(i <= 4) {
//			// 별찍기
//			int j = 1;
//			while(j <= 5-i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//높이 : 4
		//****
		//***	
		//**
		//*
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("높이 : ");
//		int height = sc.nextInt();		// 5
//		
//		int i = 1;
//		while(i <= height) {
//			// 별찍기
//			int j = 1;
//			while(j <= (height + 1) - i)  {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		//4
		//   *
		//  ***
		// *****
		//*******
		
//		int i = 1;
//		while (i <= 4) {
//			// 공백 찍는 행위 ( 4-i )
//			int j = 1;
//			while (j <= 4-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			
//			// 별 찍는 행위 ( 2 * i - 1 )
//			int k = 1;
//			while (k <= 2 * i - 1) {`
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();	
//			i++;
//		}
//		
	}

}
