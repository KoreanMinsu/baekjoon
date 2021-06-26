package level2;

import java.util.Scanner;

public class AlarmClock2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		if((hour>=0 && hour<=23) && (min>0 && min<=59)){
		  if(hour==0 && min-45<0) {
			  hour = 23;
			  min = 60+min-45;
			System.out.println(hour+" "+min);
		  } else if(hour!=0 && min -45 <0) {
			  min = 60+min-45;
			System.out.println((hour-1)+" "+min);
		  } else if(hour!=0 && min -45 >=0) {
			System.out.println((hour-1)+" "+(min-45));
		  } else {
			System.out.println(hour+" "+(min-45));
		  }
		}
		sc.close();
	}
}
