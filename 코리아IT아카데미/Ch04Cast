
public class Ch04Cast {
	public static void main(String[] args) {
		
		// 01 자료형 변환
		
		// 자료형 변환의 종류
		
		// 1. 자동형변환 ( 암시적 형 변환 ) : 컴파일러가 자동으로 형 변환해주는 경우
		// 2. 강제형변환 ( 명시적 형 변환 ) : 개발자(프로그래머)가 인위적으로 강제로 형 변환하는 경우.
		
		// 02 자동형변환
		
		// 범위가 넓은 자료형에 범위가 좁은 자료형이 대입되는 경우
		// 컴파일러가 알아서 형 변환을 해준다는건 데이터 손실 가능성이 낮거나 없을 때라는 것임.
		// byte < short < int < long < float < double - 데이터 손실을 최소화

		byte byte_var = 127;
		int int_var = byte_var;
		
		double double_var = int_var;
		
		System.out.println(double_var);		// 자동형변환(주의) 정수형 자료형 --> 실수형 자료형


		// 03 강제형변환
		// int 약 -21억 ~ +21억까지 
		// short : 약 -32000 ~ + 32000, 
		// byte: -128 ~ +127


		// 프로그래머(개발자)가 특정 자료형을 강제로 형 변환 하는 경우
		// 데이터 손실의 가능성 O
		// 당연히 좁은 범위의 자료형에다가 큰 값을 넣으려는 경우
		
		
//		데이터 손실의 예
		int num = 128;			// 00000000 00000000 00000000 1000 0000
		int num1 = 129;			// 00000000 00000000 00000000 1000 0001
		int num2 = 130;			// 00000000 00000000 00000000 1000 0010
		
		byte ch = (byte) num;	// 1000 0000
		byte ch1 = (byte) num1;	// 1000 0001
		byte ch2 = (byte) num2;	// 1000 0010
		
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		// 데이터 손실X의 예
		int test = 127;			// 00000000 00000000 00000000 0111 1111
		
		byte test_ch = (byte) test;	// 0111 1111
		System.out.println(test_ch);
		
		
		// 실수 --> 정수 강제형변환
		int test_num = 0;
		double number = 3.14;
		test_num = (int) number;		// 소수점 이하 데이터 소실!!
		
		System.out.println(test_num);
	}
}
