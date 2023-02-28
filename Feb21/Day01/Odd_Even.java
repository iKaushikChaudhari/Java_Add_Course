package Feb21.Day01;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		int i;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Range");
		int num=s1.nextInt();
		for(i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println("Number Is Even :"+i);
			}
			else {
				System.out.println("Number Is Odd :"+i);
			}
		}

	}

}
