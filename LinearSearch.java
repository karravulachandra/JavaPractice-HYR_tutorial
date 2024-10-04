package Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item to search");
		int a=sc.nextInt();
		int[] ar=new int[6];
		for(int i=0;i<ar.length;i++) {
			System.out.println("insert array element"+i);
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==a) {
				System.out.println(a+" found at the index "+i);
			}
		}

	}

}
