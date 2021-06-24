package level2;

import java.util.Scanner;

public class ExamScore9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iNum = sc.nextInt();
		if(iNum>=90 && iNum<=100) {
			 System.out.println("A");
		} else if(iNum>=80 && iNum<=89) {
			 System.out.println("B");
		} else if(iNum>=70 && iNum<=79) {
			System.out.println("C");
		} else if(iNum>=60 && iNum<=69) {
			System.out.println("D"); 
		} else {
			System.out.println("F");
		}
		
		sc.close();
	}
}

