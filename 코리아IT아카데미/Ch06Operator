import java.util.Scanner;

public class Ch06Operator {
	public static void main(String[] args) {
		// 00 대입 연산자

		// ' = ' : 왼쪽은 '공간' 오른쪽은 '값'으로 해석한다
		//         오른쪽 값 저장 후 왼쪽 공간으로 대입
		
		
		// 01 산술 연산자
//		System.out.println("--------------- 산술 연산자 예제 ---------------");
//		int a = 10, b = 20;
//		System.out.println("a + b = " + (a + b));
//		System.out.println("a - b = " + (a - b));
//		System.out.println("a * b = " + (a * b));
//		System.out.println("b / a = " + (b / a));	// 나누기 연산자 : 몫
//		System.out.println("a % b = " + (a % b));	// 나머지 연산자 : 나머지
//		
//		System.out.println("-a = " + -a); // 앞에 - 를 붙인다고 해서 음수가 되는게 X
//										  // 부호를 반전시키는 연산 '-'
//										  // 즉 양수 -> 음수, 음수 -> 양수
		
		

		
		// 02 복합대입 연산자 (산술+대입)
		// 복합대입 연산자 = 대입연산자 + 산술연산자
		
//		System.out.println("--------------- 복합대입 연산자 예제 ---------------");
//		int a = 10;
//		a += 10;	// a = a + 10;
//		System.out.println("a = " + a);
//		
//		
//		a -= 5;		// a = a - 5;
//		System.out.println("a = " + a);
//		
//		
//		a *= 3;		// a = a * 3;
//		System.out.println("a = " + a);
//		
//		a /= 2;		// a = a / 2;
//		System.out.println("a = " + a);
//		
//		a %= 2;		// a = a % 2;
//		System.out.println("a = " + a);
//		System.out.println();
		
		
		// 03 비교연산자
		
		// 피연산자들을 ' 비교 ' 하여 참 / 거짓 값 반환 
		// 참(True)		
		// 거짓(False)	

//		System.out.println("--------------- 비교 연산자 예제 ---------------");
//		int a = 10;
//		int b = 20;
//		System.out.println("A == B : "+ (a == b)); 	// == : 같은지 여부 (비교연산자)
//		System.out.println("A  > B : "+ (a > b));
//		System.out.println("A  < B : "+ (a < b));
//		System.out.println("A >= B : "+ (a >= b));
//		System.out.println("A <= B : "+ (a <= b));
//		System.out.println("A != B : "+ (a != b)); 	// != : 다른지 여부
//		System.out.println();

		
		
		
		
		// 04 논리연산자 
		
		// ### AND 연산자 (&&) ###
		
//		// 1. 왼쪽이 거짓이라면 오른쪽을 연산하지 않는다.
//		// 2. "&&" 연산자는 일반적으로 "||"연산자보다 우선순위가 높다
//		// 3. "&&" 연산자의 결과는 논리값(참 또는 거짓)이다.
		
		// (조건식) && (조건식) 
		// (true) && (true) = (true)
		// 그 외는 모두 거짓
		// &&기호를 기준으로 왼/오른쪽 둘다 true 이면 true
		
		
		// ### OR 연산자 (||) ###	 
		
//		// 1. 왼쪽, 오른쪽 식 중 하나라도 참이면 True 값이 뜬다.
		// (조건식) || (조건식) 
		// (true)  || (true)  = (true)
		// (true)  || (false) = (true)
		// (false) || (true)  = (true) 
		// (false) || (false) = (false)
		// ||기호를 기준으로 왼/오른쪽 중 하나만 true 이면 true
		
		
		// ### NOT 연산자 (!), 논리부정연산자 ###
		// true이면 false, false 이면 true
		
		
		// AND 연산
//		int a = 10;
//		int b = 20;
//		
//		System.out.println((a >= b) && (a > 5));
//		System.out.println((a != b) && (b > 15));
//		
//		// OR 연산
//		System.out.println((a != b) || (b > 15));
//		
//		// NOT 연산
//		boolean flag = !(b > 30);
//		System.out.println(flag);
		
		
	// 05 증감연산자
		
		// 1. 전치연산자(++a, --a) : 먼저 1 증가 및 감소 이후에 다른 연산 처리
		// 
		// 2. 후치연산자(a++, a--) : 다른 연산 처리 이후에 1 증가 및 감소
		
		
//		int a = 10;
//		int b = 20;
//		int c;
//		int d;
//		
//		
//		c = --a;		// a = 9, c = 9
//		d = a--;		// a = 8, d = 9
//		System.out.printf("a = %d , c = %d, d = %d\n", a, c, d);
		
		
		
		
		// 06 삼항연산자
		// (조건식) ? 참인경우 실행코드 : 거짓인경우 실행코드;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >>>");
		int score = sc.nextInt();
		
//		char grade = (score >= 90) ? 'A' : 'B';
//		System.out.println("본인의 학점은 " + grade + "입니다.");

		

		// 01 홀수/짝수
		
		//사용자로부터 정수를 하나 입력받고,
		//연산자를 이용해 짝수면 짝수입니다를 출력, 
		//			 홀수면 홀수입니다를 출력
		
		//[결과값]
		//정수를 입력해주세요 : 12
		//결과 : 짝수입니다
		
//		// 1. 사용자로부터 정수를 입력받음 ( 친절문구 + Scanner )
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 >>>");
//		int number = sc.nextInt();		// 12
//		
//		
//		// 2. 값을 입력받은 변수가 짝수인지 홀수인지를 판별코드 
//		// 나누었을 때 나머지가 0이면 짝수, 1이면 홀수		( 산술연산자, 삼항연산자 )
//		
//		// 2-1)
//		// 입력받은 수 number를 2로 나눈다.
//		// number % 2
//		
//		// 2-2)
//		// 2로 나눈 나머지가 0일 때 짝수
//		// 				 1일 때 홀수
//		String result = number % 2 == 0 ? "짝수입니다." : "홀수입니다";
//		
//		
//		
//		// 3. 결과를 출력 ( == 콘솔에 출력 )
//		System.out.println("판별 결과 : " + result);
		
		
		
		// 02 배수 구하기
		
		// 세 정수를 받아서 세 수의 합이 5의 배수인 경우
		// 5의 배수입니다 를 출력
		// 아닌 경우 5의 배수가 아닙니다 를 출력
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("세 정수를 입력해주세요 >>>");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt(); 
//		
//		int sum = num1 + num2 + num3;
//		
//		String result = sum % 5 == 0 ? "5의 배수입니다" : "5의 배수가 아닙니다.";
//		
//		System.out.println("판별 결과 : " + result);
//		
	}
}
