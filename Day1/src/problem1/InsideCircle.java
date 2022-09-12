package problem1;

import java.util.Scanner;

public class InsideCircle {
	public static void main(String[] args) {
		int r = 10;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter cordinate x y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(Math.abs(x*x)+Math.abs(y*y) <= (r*r)) {
        	 System.out.println("point is inside the circle.");
        }
        else
        	System.out.println("point is outside the circle.");
        
	}
}
