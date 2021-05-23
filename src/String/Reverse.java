package String;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
		/*
		 * String reverseA=""; for (int i = A.length()-1; i >=0; i--) {
		 * reverseA+=A.charAt(i); } System.out.println(reverseA.equals(A)?"Yes":"No");
		 */
        System.out.println(A.equals(new StringBuilder(A).reverse().toString())?"Yes":"No");
	}
}
