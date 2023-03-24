package hi;

import java.util.Scanner;

public class March25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int count=sc.nextInt();
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				if(i==0&j<count||i==count-1&j<count-1||i<count&j==0||i<count&j==count-1||i==j||i+j==count-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
				
		}
		
	}
	
	
	
	}

