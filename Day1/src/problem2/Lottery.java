package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		int winNum = 342;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number to win a lottery: ");
        int num = sc.nextInt();
        
        if(num>=100 && num<999)
        { 
        	if(winNum == num)
        		System.out.println("you win $10,000.");
        	else if(convert(winNum).equals(convert(num)))
        	    System.out.println("you win $3,000.");
        	else if(check(winNum,num)==true)
        		System.out.println("you win $1,000.");
        	else
        		System.out.println("you win $0.");
        }
        else
        {
        	System.out.println("Enter a valid digit");
        }
	}

	private static boolean check(int winNum, int num) {
		String s1 = String.valueOf(winNum);
		HashSet<Character> set = new HashSet<>();
		String s2 = String.valueOf(num);
		for(int i=0;i<s2.length();i++)
		{
			set.add(s2.charAt(i));
		}
		for(int j=0;j<s1.length();j++){
			if(set.contains(s1.charAt(j)))
				return true;
		}
		return false;
	}
	private static String convert(int n) {
		List<Integer> list = new ArrayList<>();
		while(n != 0) {
			list.add(n%10);
			n = n/10;
		}
		Collections.sort(list);
		return list.toString();
	}

}
