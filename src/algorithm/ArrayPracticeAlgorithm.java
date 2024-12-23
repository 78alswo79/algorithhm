package algorithm;

import java.util.Arrays;
import java.util.Random;

public class ArrayPracticeAlgorithm {
	private static void minof() {
		 Random random = new Random();
		 random.setSeed(System.currentTimeMillis()); 			// seed 생성
		 
		 int size = 7;
		 int a[] = new int[size];
		 
		 for (int i = 0; i < size; i++) {
			 a[i] = random.nextInt(101);  						// 0 ~ 101사이의 난수 생성.
		 }
		 
		 int min = 0;
		 min = a[0];
		 for (int i = 1; i < a.length; i++) {
			 if (a[i] < min) min = a[i];
		 }
		 System.out.println("최솟값은 ????" + min);
	 }
	 
	 private static void sumof() {
		 Random random = new Random();
		 random.setSeed(System.currentTimeMillis()); 			// seed 생성
		 
		 // 배열 초기화.
		 int size = 7;
		 int a[] = new int[size];
		 
		 for (int i = 0; i < size; i++) {
			 a[i] = random.nextInt(101);  						// 0 ~ 101사이의 난수 생성.
			 //System.out.println("생성된 난수들" + a[i]);
		 }
		 
		 int sum = 0;
		 sum = a[0];
		 for (int i = 1; i < a.length; i++) {
			 sum += a[i];
		 }
		 System.out.println("생성된 난수들의 합계는 ????" + sum);
	 }
	 
	 private static void aveof() {
		 Random random = new Random();
		 random.setSeed(System.currentTimeMillis()); 			// seed 생성
		 
		 // 배열 초기화.
		 int size = 7;
		 int a[] = new int[size];
		 
		 for (int i = 0; i < size; i++) {
			 a[i] = random.nextInt(101);  						// 0 ~ 101사이의 난수 생성.
			 //System.out.println("생성된 난수들" + a[i]);
		 }
		 
		 int avg = 0;
		 int sum = a[0];
		 for (int i = 1; i < a.length; i++) {
			 sum += a[i];
		 }
		 avg = sum / a.length;
		 System.out.println("생성된 난수들의 평균는 ????" + avg);
	 }
	 
	 private static void highTall () {
		 Random rd = new Random();
		 rd.setSeed(System.currentTimeMillis());
		 
		 // 5이상 20이하의 난수 생성.
		 int rdInt = 0;
		 System.out.println("5이상 20이하의 난수들" + rdInt);
		 int size = 20 - 5;
		 int a[] = new int[size];
		 
		 // 배열 초기화
		 for (int i = 0; i < a.length; i++) {
			 rdInt = rd.nextInt(16)+5;
			 a[i] = rdInt;
		 }
		 
		 int max = a[0];
		 for (int i = 1; i < a.length; i++) {
			 if (a[i] > max) max = a[i];
		 }
		 System.out.println("최대값은 ????" + max);
	 }
	 
	 private static void any_reverse() {

		 int a[] = {5,10,73,2,-5,42};
		 int temp = 0;
		 
		 System.out.println(Arrays.toString(a));
		 for (int i = 0; i < a.length / 2; i++) {
			 temp = a[i];
			 a[i] = a[a.length - i - 1];
			 a[a.length - i - 1] = temp;
			 System.out.println("a["+ i +"]과 a[" + (a.length - i - 1) +"]를 교환힙니다.");
			 System.out.println(Arrays.toString(a));
		 }
		 System.out.println("역순 정렬을 종료합니다.");
	 }

	public static void main(String[] args) {
		// 최솟값 구하기
		minof();
		// 합계 구하기
		sumof();
		// 평균 구하기
		aveof();
		// 사람 수 5 ~ 21미만의 난수로 가장 큰 키 구하기
		highTall();
		// any_reverse()작성하기
		any_reverse();
	}
	 

}
