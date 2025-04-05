
// 1. 프로그램이란!? 
// 컴퓨터에게 수행할 작업을 지시하는 과정으로, 특정 프로그래밍 언어를 사용하여 인간의 의도를 
// 컴퓨터가 이해하고 실행할 수 있는 코드로 표현하는 것을 말함.

// 2. 프로그램 언어 : 컴퓨터 시스템을 구동시키는 소프트웨어를 작성하기 위한 형식언어임.
// 한마디로 ==> 컴퓨터와의 대화에 사용되는 대화 수단

// ### 실행과정 ###

// 1. 한글, 영어 등등 Source Code 작성 후 실행 명령

// 2. 컴파일 (Compile) 과정 실행
// 		-- 저 / 고급 언어로 작성된 프로그램을 기계어로 번역하는 것

// 3. 디버깅(Debugging)과정 실행
//		-- 버그 : 벌레 			== 시스템 상의 버그 == 오류
//		-- 디버그 : 벌레를 잡는 행위	== 오류를 잡는 행위
//		-- 		 : 프로그램의 오류나 비정상적인 연산 등의 오류를 발견하고 그 원인을 밝혀서
//		--		 : 개발자에게 알려주는 행위

// 4. RUN (실행) 완료 'm'


// ### 자바 실행과정 ###
// 1. Source Code 작성 후 실행 명령

// 2. Compiler에 의한 컴파일링(Compile) --- 이때 ---> Byte Code 형태( .class 확장자를 가진 파일)로 변환
//									 참고) 기계어 형태로 변환 XXX

// 3. JVM(Java Virtual Machine, 인터프리터)에 Byte Code 전달
// 4. 실행 (RUN)


// ### 프로그래밍 언어의 종류 ###
// C, C++, C#, Python, Dart, Java etc....

// 1. C ( Compile 언어 )
//		-- C 자체로는 쓸데가 없음, 임베디드 + 시스템

// 2. C++ ( Compile 언어 )
// 		-- 게임 개발, 서버 개발

// 3. C# ( Compile + Interpreter 언어)
// 		-- 게임 개발(유니티), AR & VR, (얼리언엔진), 보안


// 4. Java ( Compile + Interpreter 언어 )
//		-- 웹(WebSite) 개발, 앱 개발

// 5. Python ( Interpreter 언어 )
//		-- 만능 'ㅡ'b 
//		-- 빅데이터, 인공지능, AI, 머신러닝, 딥러닝, 웹, 앱, 게임 etc...



// 01 주석

// 주석 : 프로그램 코드 내에 삽입된 사용자의 메모를 의미
// ==> 코드 실행 결과에는 아무런 영향을 끼치지 않음.

// 쓰는 이유 : 1. 개발을 하다보면 코드 섹션(함수의 몸체)에 대한 설명이 필요함.
//			 2. 협업할 때, 다른 개발자와의 의사소통에 필요.

// # 주석 사용법 #
// // 		: 주석		( 단일 주석 )
// /* */	: 여러 줄 주석 ( 다중 주석 )
// 단축키		: Ctrl + /


// 02 JAVA의 기본구조
public class Ch01Basic {						// 클래스 영역 - 객체 지향 코드 구현 단위

	
	// public class Ch01Basic : 1. 하나의 public 클래스로 시작
	// 						  : 2. 클래스는 파일 이름과 동일해야 함.
	//						  : 3. 그 내부에 main 메서드가 포함되어야 함.
	public static void main(String[] args) {	// 메서드 영역 - 절차 지향 구현 단위, main 메서드의 선언부	
		// ### 메서드의 정의와 종류 ###
		// 0. 메서드(기능) 	: 특정 기능 수행, C언어 함수 개념과 유사
		// 1. 메인 메서드 		: 최초 실행되는 함수
		// 2. 라이브러리 메서드 : 개발편의를 위해서 미리 만들어져 제공되는 함수
		// 3. 사용자 정의 메서드 : 개발자가 정의한 (만든) 함수
		
//		System.out.println("HELLO"); 	// 출력 함수(메서드) 실행, CALL이라고 함
						// ';' : 코드의 마침표 역할
						// 모니터에 우리가 작성한 텍스트를 console창에 출력하는 역할(기능)
		
		// 1) ESCAPE 문자

//      '정보 표시' 목적으로 사용된 기존 그래픽문자(영소문자, 숫자, 특수문자)와는 다르게
//      '제어' 목적으로 사용되는 특수문자
		
		// 사용법 : \(역슬래쉬)를 앞에 붙여 사용
		
		// 1. \n : 개행(줄바꿈)
		
		// 2. \t : Tab Key의 약어
		//		--> 탭키만큼 칸 이동
		
		// 3. \' : 작은 따옴표를 출력
		// 4. \" : 큰 따옴표를 출력
		// 5. \\ : 경로를 표시하는 구분자(\)를 나타낼 때 사용
		
//		System.out.println("Hello World");
//		System.out.println("This is a new line. \nSecond line\twith a tab");
		
		// 문제 01)
		// [결과값]
		// HELLO WORLD
		// HE	LLO WORLD
		// HELLO WORLD
		//
		// 안녕하세요
		
		// print() 메서드 사용
//		System.out.print("HELLO WORLD\n");
//		System.out.print("HE\tLLO WORLD\n");
//		System.out.print("HELLO WORLD\n\n");
//		System.out.print("안녕하세요");
//		System.out.println();
//		System.out.println();
//		
//		// println() 메서드 사용
//		System.out.println("HELLO WORLD");
//		System.out.println("HE\tLLO WORLD");
//		System.out.println("HELLO WORLD\n");
//		System.out.print("안녕하세요");
		
		
		
//		## 표준 출력 함수 ##
//      System.out 			: 표준 출력 스트림
//      System.out.print()		: 줄바꿈 X
//      System.out.println()		: 줄바꿈 O(포함, ln == \n)
//      System.out.printf()		: 서식문자를 사용할 수 있는 출력 메서드, printf의 의미(format : 형식, 서식)
		
		
		// 서식이란? : 서류를 꾸미는 일정한 양식
		// 서식문자란? : 서식공간에 자료를 대입하여 화면에 출력하거나 입력받기 위한 용도의 문자
		
		// %d : decimal의 약어			10진수(정수) 서식문자
		// %f : floating poing number	10진수(실수) 서식문자
		// %c : character의 약어			한문자 서식문자
		// %s :	String의 약어				문자열 서식문자
		
//		System.out.printf("%d 줄 출력", 1);
//		System.out.printf("키 : %f", 170.12);
//		System.out.printf("학점 : %c", 'A');
//		System.out.printf("이름 : %s", "이동하");
		
		// 문제 01)
		// 다음과 같이 출력합니다.
		// NO 		이름		나이		성별		주소
		// 1		이동하	20		M		대구
		// 2		곰돌이	3		W		서울
		// 3		코리아 	12		M		인천
		
		System.out.println("NO\t이름\t나이\t성별\t주소");
		System.out.println("1\t이동하\t20\tM\t대구");
		System.out.println("2\t곰돌이\t3\tW\t서울");
		System.out.println("3\t코리아\t12\tM\t인천");
		System.out.println(); 			// 빈줄 삽입
		
		System.out.printf("%d\t%s\t%d\t%c\t%s", 1, "이동하", 20, 'M', "대구");
		System.out.println();
		System.out.println();
		
		
		
		// 문제 02
		// 서식문자를 사용하여 다음과 같은 결과값을 출력해보세요 !!
		
		// [결과값]
//		이름 : 이동하
//		나이 : 12
//		성별 : M
//		키 : 192.20000
//		주소 : "대구광역시 중구 중앙대로 366 9층"
		
		System.out.printf("이름 : %s\n", "이동하");
		System.out.printf("나이 : %d\n", 12);
		System.out.printf("성별 : %c\n", 'M');
		System.out.printf("키 : %f\n", 192.2);
		System.out.printf("주소 : %s\n", "\"대구광역시 중구 중앙대로 366 9층\"");
	}	// 메서드 영역의 끝
	// 클래스 영역

}
	


