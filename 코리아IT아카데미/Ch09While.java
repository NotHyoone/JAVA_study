import java.util.Scanner;

public class Ch09While {
	public static void main(String[] args) {
		
		// 00 반복문
		// 반복적인 실행이 필요할 때 반복문을 사용함.
		
		// 01 while문의 구조
		// 조건식이 참인 경우 반복적으로 코드를 실행한다.
		
		// while (조건) {
		// 	반복 실행 코드;			// 예) 조건이 참이면 코드 실행
									//	        거짓이면 반복문 종료
		// }
		
		System.out.println("------------ while문 예제 01 ------------------");
		
		// 탈출용 변수
//		int i = 1;	
//		// 탈출용 조건식
//		while( i <= 10) {
//			System.out.println(i + "번째 출력 : Hello World");
//			i++;		// 탈출을 위한 연산식
//		}
		System.out.println("--------------- while문 문제 01 ---------------");
	    // 1부터 10까지의 합 구하기
		// [결과값]
		// while문 종료 후 i의 값 = 11
		// 1부터 10까지의 합 = 55
		
		// 1부터 10까지의 합을 저장하는 변수
		// 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
//		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 2;
//		sum = sum + 3;
//		// ...
//		sum = sum + 10;
		
//		int i = 1;
//		while (i <= 10) {
//			sum = sum + i;
//			i++;
//		}
//		// i = 11, sum = 55
//		System.out.println("while문 이후의 i값 : " + i);
//		System.out.println("1부터 10까지의 합 : " + sum);
	
	     

        System.out.println("--------------- while문 문제 02 ---------------");
//      1부터 N(입력한 수)까지의 합 구하기
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("정수를 입력하시면 1부터 그 값까지의 누적 합을 구해드릴게요 >>>");
//        int N = sc.nextInt();
//        
//        // N이 10이라면
//        int sum = 0;
//        int i = 1;
//        while (i <= N) {
//        	sum = sum + i;
//        	i++;
//        }
//        System.out.println("1부터 " + N + "까지의 누적합 : " + sum);
//        
    
        System.out.println("--------------- while문 문제 03 ---------------");
        //정수 두개를 입력 받아(n,m) n부터 m까지의 합을 구하세요
        //이때 받는 수는 n이 m보다 작아야 합니다(제약조건)
//        Scanner sc = new Scanner(System.in);
//        // n = 3, m = 5
//        System.out.println("정수1을 하나 입력해주세요 >>>");
//        int n = sc.nextInt();
//        System.out.println("정수2을 하나 입력해주세요 >>>");
//        int m = sc.nextInt();
//        
//        int sum = 0;
//        if(n < m) {
//        	int i = n;
//            while (i <= m) {
//            	sum = sum + i;
//            	i++;
//            }
//            System.out.println(n + "부터 " + m + "값까지의 누적합 : " + sum);
//        } else if (n > m) {
//        	int i = m;
//        	while (i <= n) {
//        		sum = sum + i;
//        		i++;
//        	}
//        	System.out.println(m + "부터 " + n + "값까지의 누적합 : " + sum);
//        } else {
//        	System.out.println(n + "과 " + m + "은 서로 동일함으로 비교할 수 없습니다.");
//       
//        }
        
        // 02 while - 무한 루프 이용하기
        System.out.println("--------------------- while - 무한 루프 예제 --------------");
        // 값을 사용자로 부터 입력받아 모두 더하는 프로그램을 만들어보자 !!
        // 값이 -1이라면 프로그램 종료!!
        
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;		// 값 누적용
//        int num;			// 키보드 값 받기용
//        
//        while (true) {
//        	System.out.println("정수 입력 ( 종료 : -1 ) >>> ");
//        	num = sc.nextInt();
//        	if (num == -1) {
//        		break;
//        	}
//        	
//        	sum = sum + num;
//        	
//        }
//        System.out.println("sum : " + sum);
        
        
        
        
        
        
//        
//		
        // 03 while - if문 삽입
//        System.out.println("----------------- while - if문 삽입 예제 --------------");
//        int i = 1;
//        int sum = 0;
//        
//        while (i <= 10) {
//        	if ( i % 3 == 0) {
//        		System.out.println("i의 값 : " + i);
//        	}
//        	i++;
//        }

        //문제 
        System.out.println("--------------- while - if문 문제 01 ---------------");
        //입력한 1부터 입력 수중(x)에 3의 배수의 합을 출력
        
        
        //문제 
        System.out.println("--------------- while - if문 문제 02 ---------------");
        //-1을 입력하기전까지 계속 정수를 받습니다
        // 그리고 입력한 수중의 짝수의합과 홀수의 합을 따로 구해서 출력
        
        //문제
        //1부터 100까지 수중에 3의 배수이면서 4의 배수를 출력합니다
        
        //문제
        System.out.println("--------------- while - if문 문제 04 ---------------");
       // 소수를 판별하는 코드를 만드세요
       // 소수 : 1과 자기자신으로만 나누어떨어지는 수 , % 연산자사용합니다)
	}
}
