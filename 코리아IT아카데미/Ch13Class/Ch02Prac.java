package Ch13Class;

// 문제 01 : 학생 클래스 만들기

// 1. Student 클래스를 작성하세요
// 2. Student 클래스는 name과 age, address, phone, grade, classes, number 라는 속성을 가짐.
// 3. main 메서드를 생성하고 그 메서드 내부에 학생 객체를 생성 및 초기화 후 출력 진행하기
// 4. 학생 정보는 다음과 같다.
// [출력값]
// --------------------------------------
// [SYSTEM] : 학생 정보 
// 이름 : 홍길동
// 나이 : 12
// 주소 : 대구광역시
// 휴대전화 : 010-1234-1111
// 학년 : 5
// 반 : 12
// 번호 : 25
// --------------------------------------

class Student {
	String name;
	int age;
	String address;
	String phone;
	int grade;
	int classes;
	int number;
	
}
public class C02Prac {
	public static void main(String[] args) {
		Student hong = new Student();
		hong.name = "홍길동";
		hong.age = 12;
		hong.address = "대구광역시";
		hong.phone = "010-1234-1111";
		hong.grade = 5;
		hong.classes = 12;
		hong.number = 25;
		// --------------------------------------
		// [SYSTEM] : 학생 정보 
		// 이름 : 홍길동
		// 나이 : 12
		// 주소 : 대구광역시
		// 휴대전화 : 010-1234-1111
		// 학년 : 5
		// 반 : 12
		// 번호 : 25
		// --------------------------------------
		System.out.println("-------------------------------------");
		System.out.println("[SYSTEM] : 학생 정보");
		System.out.println("이름 : " + hong.name);
		System.out.println("나이 : " + hong.age);
		System.out.println("주소	: " + hong.address);
		System.out.println("휴대전화 : " + hong.phone);
		System.out.println("학년 : " + hong.grade);
		System.out.println("반 : " + hong.classes);
		System.out.println("번호 : " + hong.number);
		System.out.println("-------------------------------------");
		
		
		
		
		
		
		
		
	}
}
