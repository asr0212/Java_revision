package problem3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		//code 1
		LocalTime t1 = LocalTime.now();
		String s3 = "Value1";
		String s2 = "Value2";

		for (int i = 0; i < 100000; ++i) {
				s3 = s3 + s2;
		}
		LocalTime t2 = LocalTime.now();
		System.out.println("time required for code 1: ");
		System.out.println(ChronoUnit.HOURS.between(t1, t2)+" Hours "+ChronoUnit.MINUTES.between(t1, t2)%60+
				" Minutes "+ChronoUnit.SECONDS.between(t1, t2)+" Seconds");
		
		//code 2
		LocalTime t3 = LocalTime.now();
		StringBuffer s4 = new StringBuffer("Value1");
		String s5 = "Value2";

		for (int i = 0; i < 100000; ++i) {
			s4.append(s5);
		}
		LocalTime t4 = LocalTime.now();
		System.out.println("time required for code 2: ");
		System.out.println(ChronoUnit.HOURS.between(t3, t4)+" Hours "+ChronoUnit.MINUTES.between(t3, t4)%60+
				" Minutes "+ChronoUnit.SECONDS.between(t3, t4)+" Seconds");

	}
	

}
