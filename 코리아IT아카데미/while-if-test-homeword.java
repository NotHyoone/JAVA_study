		// 1. 입력한 1부터 입력 수 중에 3의 배수 합 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번 수 입력 부탁 >>> ");
		
		int x = sc.nextInt();
		
		int i = 1;	//탈출용 변수 
		int total = 0;	//3의 배수 합 저장 변수
		
		while (i <= x) {
			if (i % 3 == 0) {
				total += i;
			}
			i++;
		}
		System.out.printf("3의 배수 합은 %d", total);
		
		
		// 2. 	짝수 합 홀수 합 각각 출력	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2번");
		
		
		int total_odd = 0;	//짝수 합 저장
		int total_even = 0;	//홀수 합 저장
		
		while (true) {
			System.out.print("정수 입력 받기 >> ");
			int num = sc.nextInt();
			
			if (num == -1) {
				break;
			}
			
			if (num % 2 == 0) {
				total_odd += num;
			} else {
				total_even += num;
			}
			
		}
		System.out.printf("짝수 합: %d, 홀수 합: %d", total_odd, total_even);
		
		
		// 3.	1부터 100까지 수 중에 3의 배수이면서 4의 배수를 출력합니다. 

		System.out.println("3번");
		
		int i = 1;
		
		while (i <= 100) {
			if (i % 3 == 0 && i % 4 == 0) {
				while (true) {
					System.out.println("1부터 100까지 수 중에 3의 배수이면서 4의 배수인 수는 "+i);					
					break;
				}
			}
			i++;
		}
