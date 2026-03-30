package workshop02;
import java.util.Scanner;
public class Test08 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("1. 정수 입력하세요");
		int num = scan.nextInt();
		System.out.println("2. 정수 입력하세요");
		int num2 = scan.nextInt();
		System.out.printf("정수 %d 와 %d 의 합계: %d",num,num2,(num+num2));
		
		scan.close();


	}

}


