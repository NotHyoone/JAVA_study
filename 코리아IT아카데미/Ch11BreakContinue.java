
public class Ch11BreakContinue {
	public static void main(String[] args) {
		// 01 제어문 - break
		// 제어문은 반복문과 조건문에 필터링 기능을 부여하는 방법
		// 1. 반복문 탈출에 사용 (while 무한 루프 탈출에도 사용함)
		// 2. switch문 case 탈출에 사용
		
		// 02 while - 무한 루프
		System.out.println("-------------- while - 무한 루프 예제 -----------------");
		// 중첩 while문 전체 벗어나기
		// 5 x 5 = 25까지 출력하고 나머지 출력 X
		
		// 2단
		// 3단
		// 4단
		// 5 x 1
		// ...
		// 5 x 5 = 25
		
		// true값의 의미 : 5 x 5까지 출력하고 난 직후
		// false값의 의미 : 5 x 5까지 가지 않았다.
//		boolean flag = false;
//		
//		int dan = 2;
//		while (dan <= 9) {
//
//			int i = 1;
//			while (i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				if(dan == 5 && i == 5) {
//					flag = true;
//					break;
//				}
//				i++;
//			}
//			if(flag == true) {
//				break;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		// 03 - continue
		// continue 아래 코드 무시 및 반복문의 조건식으로 회기하여 다음 반복 실행.
		
		// ### break와 continue의 차이점 ###
		// break는  소속된 코드 블럭을 즉시 탈출
		// continue는 소속된 코드 블럭(현재 실행중인 반복문)을 무시하고 조건식으로 돌아가 다음 반복을 시작
		
		
		// 문제 01
		// 1부터 100까지의 수 중에서 5의 배수만 더하고, 50을 넘어가면 반복문을 중단
		
		// 조건 1)
		// 1 ~ 50까지만 '''출력'''
		
		// 조건 2)
		// 5의 배수는 출력되지 말아야함.			ex..) 1 2 3 4   6 7 8 9
		
		// 조건 3)
		// 5의 배수의 합을 구해서 마지막에 출력
//		
//		int i = 1;
//		// 누적합을 구해줄 변수 선언
//		int sum = 0;
//		while(i <= 100) {
//			// 조건 1)
//			if (i > 50) {
//				break;
//			}
//			// 조건 2)
//			else if (i % 5 == 0) {
//				// 5의 배수의 합 구하기
//				sum += i;
//				i++;
//				continue;
//				
//			}
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("5의 배수의 총합 : " + sum);
//		
		

	}
}
