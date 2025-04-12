import java.util.Scanner;

public class Ch07If {
	public static void main(String[] args) {
		// 00 분기문
		// 조건문과 반복문 중간에서 코드블럭을 나눠서 처리하는 문법
		// 그 예로는 if문, switch문, for문, while문 등이 있다.
		
		// 01 if문
		// 조건문을 작성할 때 사용하는 구문.
		// 
		// 조건식이 참이라면 코드 블럭을 실행
		// 조건식이 거짓이라면 코드 블럭을 무시(스킵)
		// ++) else문을 통해 조건이 거짓일 경우의 실행코드를 지정 할 수 있다.
		

		// 조건식은 참 또는 거짓을 판단할 수 있는 식이여야만 한다.
		// 참과 거짓, 0과 1
		

		
		// 02 if문의 형식

		// 2-1) if문
		// 
		// if ( 조건식 ) {
//												//
//												// 조건식이 참이라면 이 실행코드 실행
//												//
		//}
		

	     // 2-2) if문과 else문

	     // if ( 조건식 ) {
//	     										//
//	     										// 조건식이 참이라면 이 실행코드 실행
//	     										//
	     //} 
	     // 
	     // else {
//	     										//
//	     										// 조건식이 거짓이라면 이 실행코드 실행
//	     										//
	     //}
		
        // IF문 문제 01)
     // 사용자로부터 정수 하나를 입력받고 3의 배수이면 3의 배수입니다가 출력되도록 코딩하세요.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 하나 입력하세요 >>>");
//		int number = sc.nextInt();
		
		// 1)) if-else 문 처리
		
		// number 라는 수 3의 배수인지 아닌지 판별
		// ==> 3의 배수라면 3으로 나누었을 때 나머지 0
//		if (number % 3 == 0) {
//			// 3의 배수라면
//			System.out.println(number + "는 3의 배수입니다.");
//			
//		} else {
//			// 3의 배수가 아니라면
//			System.out.println(number + "는 3의 배수가 아닙니다.");
//		}
		
		// 2)) if문으로 처리 
//		if (number % 3 == 0) {
//			// 3의 배수라면
//			System.out.println(number + "는 3의 배수입니다.");
//			
//		} 
//		
//		if(number % 3 == 1) {
//			System.out.println(number + "는 3의 배수가 아닙니다.");
//		}
//		
//		if (number % 3 == 2) {
//			System.out.println(number + "는 3의 배수가 아닙니다.");
//		}
//		// 또는
//		
//		if(number % 3 == 1 || number % 3 == 2) {
//			System.out.println(number + "는 3의 배수가 아닙니다.");
//		}
			
		
		
		
		
//	     IF-ELSE문 문제 01
	    // 사용자로부터 두 정수를 입력받는다.
	    // 두 수의 합이 짝수면 "두 수의 합은 짝수입니다."
	    // 두 수의 합이 홀수면 "두 수의 합은 홀수입니다" 
	    // 위와 같은 결과값이 나오도록 코딩하세요 !
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 정수를 입력하세요 >>>");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		int sum = num1 + num2;
//		
//		if (sum % 2 == 0) {
//			System.out.println("두 수의 합이 짝수입니다.");
//		} else {
//			System.out.println("두 수의 합이 홀수입니다.");
//		}
//		
		
		
		
	    // IF-ELSE문 문제 02
	    // 사용자로부터 정수를 입력받는다.
	    // 그 수가 num >= 2 && num <= 20 이면
	    // 조건식이 참이면 "2 ~ 20범위 안에 있습니다."
	    // 조건식이 거짓이며 "범위를 벗어났습니다."
	    // 위와 같은 결과값이 나오도록 코딩하세요 !
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 하나 입력해주세요 >>>");
//		int num = sc.nextInt();
//		
//		if (20 >= num && num >=2) {
//			System.out.println("2 ~ 20 범위 안에 있습니다.");
//		} else {
//			System.out.println("범위를 벗어났습니다.");
//		}
		
		  
	    // 2-3) 중첩 if문
//	     if (조건식1)
//	     {
//	    	 //조건이 참인 경우 실행되는 코드 블록
//	     	if (조건식 2) {
//	    		// 조건식1과 조건식 2가 모두 참인 경우 실행되는 코드 블록
//	     	}
//	     }
	       
	    // 2-4) 중첩 if문과 else문

	     //if (조건식1)
	     //{
//	     	// 조건이 참인 경우 실행되는 코드 블록
//	     	if (조건식 2) {
//	     		// 조건식1과 조건식 2가 모두 참인 경우 실행되는 코드 블록
//	     	} 
	     //}
	     //else
	     //{
//	     	// 조건식1이 거짓인 경우 실행되는 코드 블록
	     //}
		
//		System.out.println("--------------- 중첩 if-else문 활용 예제 -----------------");
//		// DB에 저장된 값 가정
//		// == 회원가입한 ID / PW
//		String id = "javaclass";			// ID
//		String pw = "test1234";				// PW
//		
//		Scanner sc=  new Scanner(System.in);
//		
//		System.out.print("[SYSTEM] : ID를 입력하세요 >>>");
//		String input_id = sc.next();
//		
//		// 기존의 id(javaclass)와 입력한 id(input_id)를 비교
//		if (id.equals(input_id)) {		// equals() : 문자열 비교 메서드
//										// 			: 서로 같다면 True
//										//			: 다르면 False
//			System.out.println("[SYSTEM] : ID가 일치합니댜.");
//			
//			System.out.println("[SYSTEM] : PW를 입렵하세요 >>> ");
//			String input_pw = sc.next();
//			
//			// ID가 일치하고
//			// 기존의 pw(test1234)와 입력한 pw(input_pw)를 비교
//			if (pw.equals(input_pw)) {
//				System.out.println("[SYSTEM] : PW가 일치합니다.");
//				System.out.println("[SYSTEM] : LOGIN 성공, " + id + "님 환영합니다.");
//			} else {
//				// ID는 일치하나
//				// PW가 일치하지 않는 경우
//				System.out.println("[SYSTEM] : PW가 일치하지 않습니다.");
//			}
//			
//			
//		}
//		// ID가 일치하지 않는 경우
//		else {		
//			System.out.println("[SYSTEM] : ID가 일치하지 않습니다.");
//		}
//		
//		
		
//      If문 통합 문제 01)
     //	짝수이면서 3의 배수이면 출력
     //	홀수이면서 5의 배수이면 출력
		
//	 // 1. 정수를 하나 입력받는 안내문 출력
//		System.out.println("정수를 하나 입력해주세요 >>>");
//	 // 2. Scanner를 이용해서 정수를 하나 입력
//		Scanner sc=  new Scanner(System.in);
//		int number = sc.nextInt();
//		
//	 // 3. 짝/홀수 판별
//	 // 3-1)) 짝수라면
//			// 3의 배수인지 판별	 ==> 3의 배수입니다 출력
//	 // 3-2)) 홀수라면
//			// 5의 배수인지 판별 ==> 5의 배수입니다 출력
//		if(number % 2 == 0) {
//			if(number % 3 == 0	 ) {
//				System.out.println("짝수이면서 3의 배수입니다.");
//			} else {
//				// 짝수이긴 하나, 3의 배수가 아닙니다.
//				System.out.println("짝수이면서 3의 배수가 아닙니다.");
//			}
//		} else {
//			if (number % 5 == 0) {
//				System.out.println("홀수이면서 5의 배수입니다.");
//			} else {
//				System.out.println("홀수이면서 5의 배수가 아닙니다.");
//			}
//		}
//		
//
//	
//		// ---------------------------- 또는 --------------------------------
//	
//	 // 3. 짝수이면서 3의 배수를 한번에 판별 --> 논리 연산
//		
//	 //    홀수이면서 5의 배수를 한번에 판별 --> 논리 연산
//		
//		if(number % 2 == 0 && number % 3 == 0) {
//			System.out.println("짝수이면서 3의 배수입니다.");
//		}
//		
//		if (number % 2 == 1 && number % 5 == 0) {
//			System.out.println("홀수이면서 5의 배수입니다.");
//		}
//		
	    // 05 else - if 
	    // 다중분기
//		System.out.println("--------------- else-if문 예제 01 ---------------");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이 입력 >>>");
//		int age = sc.nextInt();
//		
//		if(age >= 20) {
//			System.out.println("성인입니다.");
//		} else if(age >= 8) {
//			System.out.println("취학 아동입니다.");
//		} else {
//			System.out.println("미취학 아동입니다.");
//		}
		
		 // else - if 문 문제 01)
	    //시험 점수를 입력받아 90 ~ 100점은 A,
		//80 ~ 89점은 B, 70 ~ 79점은 C,
		//60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		// score >= 90 A
		// score >= 80 B
		// score >= 70 C
		// score >= 60 D
		// 그외 F
		//or
		// score < 60 F
		// score < 70 D
		// score < 80 C
		// score < 90 B
		// 그외 A
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력해주세요 >>>");
//		int score = sc.nextInt();
//		if(score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}	
	}
}
