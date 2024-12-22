package algorithm;

public class SagakhyeongAlgorithm {

	//(왼쪽 아래가 직각)
	static void jikgaksamgakhyeong1() {
		System.out.println("직삼각형을 출력합니다.(왼쪽 아래가 직각)");
		int input = 5;
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// (왼쪽 위가 직각)
	static void jikgaksamgakhyeong2() {
		System.out.println("직삼각형을 출력합니다.(왼쪽 위가 직각)");
		int input = 5;
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// (오른쪽 위가 직각)
	static void jikgaksamgakhyeong3() {
		System.out.println("직삼각형을 출력합니다.(오른쪽 위가 직각)");
		int input = 5;
		for (int i = 1; i <= input; i++) {
			// 공백 출력
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= input; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// (오른쪽 아래가 직각)
	static void jikgaksamgakhyeong4() {
		System.out.println("직삼각형을 출력합니다.(오른쪽 아래가 직각)");
		int input = 5;
		for (int i = 1; i <= input; i++) {
			// 공백 출력
	        for (int j = 1; j <= input - i; j++) {
	            System.out.print(" ");
	        }
	        
			for (int j = input; j >= input - i + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	// 피라미드
	static void spira() {
		int input = 4;
		System.out.println("피라미드 입니다.");
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j < input - i + 1; j++) {
				System.out.print(" ");
			} 
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 역피라미드
	static void nrpira() {
		int input = 4;
		int d = 0;
		// 7개의 열 출력.
		System.out.println("역피라미드 입니다.");
		for (int i = 1; i <= input; i++) {
			d = (input-i)*2+1;
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			} 
			for (int j = 1; j <= d; j++) {
				System.out.print((i % 10));
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 직각삼각형 (왼쪽 아래가 직각)
		jikgaksamgakhyeong1();
		// 직각삼각형 (왼쪽 위가 직각)
		jikgaksamgakhyeong2();
		// 직각삼각형 (오른쪽 위가 직각)
		jikgaksamgakhyeong3();
		// 직각삼각형 (오른쪽 아래가 직각)
		jikgaksamgakhyeong4();
		// 피라미드
		spira();
		// 역피라미드
		nrpira();
	}

}
