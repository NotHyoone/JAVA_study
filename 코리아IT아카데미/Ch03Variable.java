import java.util.Scanner;

public class Ch03Variable {

	public static void main(String[] args) {
		
		// 00 자료형과 변수
		
		// 1 byte == 8 bit
		// 자료(데이터) : 선저장 후 처리 ( 공간 먼저 확보 후 저장 )
		// 자료형 : 데이터 종류에 따라 저장될 공간을 미리 규격화 시켜놓은 예약어
		
		// 변수란? : 하나의 값을 저장할 수 있는 저장공간, 필요에 의해 반복적으로 바꿀 수 있음.
		// 상수란? : 항상 같은 수, 값을 바꾸지 않음(고정)
		
		// " = "은 우리가 알던 수학적 기호의 의미 즉, "같다"는 의미를 지니는게 아니라 "대입"의 의미를 지님.
		//		 왼쪽		=		 오른쪽
		//		(공간)		= 		(값, 수)
		//		(Variable)  	=		(Value)
		// 이때 오른쪽을 먼저 처리함.
		
		System.out.println("-------------변수 선언 예제 ---------------");
		int age;				// 변수 선언
						// int 자료형 == 4byte
						// 4byte 정수 공간에 age이름 부여
		
		age = 22;			// 변수 공간에 값 "대입"
						// 이때 주의해야할 점이 age는 22와 같지 않음.
						// " 대입 "의 개념
		
		int number = 1200;		// 변수 초기화 ( 변수 선언 + 값 할당 )
				

		System.out.println(22);
		System.out.println(age);
		
		System.out.printf("age : %d\n", age);
		
		// 01 자료형의 종류
		
		// 1. 정수 자료형
		// 1-1) int	 : 4byte 정수  (( 기본 ))
		// 1-2) byte	 : 1byte 정수	
		// 1-3) short	 : 2byte 정수, 부호 O
		// 1-4) char	 : 2byte 정수, 부호 X 
		//		-- 단일 문자 저장용으로 주로 사용
		// 1-5) long	 : 8byte 정수
		long a1 = 20;	// 리터럴 접미사 (x) == 4byte 기본 데이터 
	
		long a2 = 20L; 	// 리터럴 접미낫 (O) == 8byte 데이터
		
		// 2. 실수 자료형
		// float 		: 4 byte 실수 ( 6 - 9 자리 )
		// double 	: 8 byte 실수 ( 15 - 18 자리 ) 	(( 기본 ))
		
		
		// 실수의 범위는 무한대에 가깝기 때문에 제한된 공간을 가진 컴퓨터는
		// 모든 범위의 수를 담기란 불가능하다.
		
		// 따라서 근사값 즉, 소수점 이하 (가수부) 유효범위까지만 실수값을 저장하고
		// 나머지 부분에 있어서는 오차가 발생하여 나타난다.
		// 따라서, 반복적인 실수 연산처리는 오차가 나타날 수밖에 없다.
		
		float b1 = 3.14f;			// 리터럴 접미사 F, f : float자료형
		double b2 = 3.14;			// 리터럴 접미사 ==> 기본 자료형
		
		// 실수 연산
		double result = 5 / 4;		// 5 나누기 4 == 몫 1인데
						// 자료형이 double이기때문에 1.0이 result에 담기게 됨.
		
		double result1 = 5.0 / 4;		// 5.0 실수 나누기 정수 4 == 1.25
						// result1 실수 공간에 1.25를 담아주게 됨.
		
		double result2 = (double) 5 / 4;	// 먼저 실수로 정수값을 "강제 형변환" 후
						// 나누기 진행 == 결과값 ==> 실수
		
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println(result2);
		
		
		
		//정밀도 확인
		System.out.println("--------------- 실수 자료형 - 정밀도 확인 예제 ---------------");
		float b3 = 0.123456789123456789F;
		double b4 = 0.123456789123456789;
		System.out.println(b3);
		System.out.println(b4);
		System.out.println();
		
		
		// 3. 단일 (한문자) 자료형
		// char : 2 byte 문자 저장 자료형
		// ASCII는 ANSI, 미국 국립 표준 협회에서 표준화 시킨 정보 교환용 7비트 부호체계
		
		// JAVA는 ASCII(아스키) 코드표와 유니코드표를 모두 사용
		// 유니코드 
		// 전세계의 모든 문자를 다룰 수 있는 표준 인코딩 방식(UTF-8, Unicode Transformation - 8bit)
		// 단일 문자 저장을 위해서 표준화된 ASCII 코드표를 참고하는데 문자 또는 숫자를 비트열로 저장함.
		
		char ch1 = 'A';
		char ch2 = '가';
		
		System.out.printf("ch1 문자 : %c\n", ch1);
		System.out.printf("ch1 정수 : %d\n", (int) ch1);
		
		
		
		
		// 4. 문자열 자료형
		// String : 클래스 자료형 --> 이후에 객체지향 파트에서 다시 설명
		
		String name = "이동하";		// name == 참조 변수
						// "이동하" 문자열 데이터를 30이라는 주소번지에 저장
						// 주소번지 30을 참조변수 name에다가 " 대입 "한다는 의미
		System.out.println(name);
	}

}
