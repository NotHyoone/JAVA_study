package Ch13Class;

class C02Person {
	String name;
	int age;
	String address;
}

public class C02PersonMain {
	public static void main(String[] args) {
		C02Person hong = new C02Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.address = "대구대구대구";
		
		
		System.out.printf("%s %d %s\n", hong.name, hong.age, hong.address);
		
	}

}
