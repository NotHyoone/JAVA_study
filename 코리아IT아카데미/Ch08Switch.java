
public class Ch08Switch {
	public static void main(String[] args) {
		// 00 Switch문 (다중 분기)
		// 조건문 중 하나
		// 조건이 여러개일 때 각 조건에 따른 코드를 실행할 수 있음.
		
		// 01 Switch문 구조
		int age = 1;
		switch (age) {			// 조건식 == 변수			// age = 1
		case 1:			// if
			System.out.println("age가 1일 때 실행되는 코드다");
			break;		// 제어문 == 코드의 흐름을 제어하는 역할
			
		case 2:			// else if 
			System.out.println("age가 2일 때 실행되는 코드다");
			break;
			
		case 10:		// else if
			System.out.println("age가 10일 때 실행되는 코드다");
			break;
			
		default:		// else
			System.out.println("age가 1, 2, 10이 아닐 때 실행되는 코드다");
			break;
		}
	}
}
