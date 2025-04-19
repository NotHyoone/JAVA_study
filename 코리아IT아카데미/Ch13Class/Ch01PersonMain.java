package Ch13Class;

public class C01PersonMain {
	public static void main(String[] args) {
		// C01Person 설계도(클래스)의 객체를 하나 생성
		C01Person hong = new C01Person();
		hong.name = "홍길동";
		hong.age = 12;
		hong.address = "대구광역시 반월당 센트럴타워";
		hong.hello();
		
		System.out.printf("%s님의 나이는 %d살이고 주소는 %s입니다.", hong.name, hong.age, hong.address);
		
		
		
		
	}
}
