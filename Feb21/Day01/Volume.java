package Feb21.Day01;

import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter L B H");
		int l=s1.nextInt();
		int b=s1.nextInt();
		int h=s1.nextInt();
		int vol=l*b*h;
		System.out.println("Volume Of Cube/ Cuboid : "+vol);
	}

}