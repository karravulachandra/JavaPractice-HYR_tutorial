package Arrays;
//import java.util.Arrays;
import java.util.Scanner;
public class array_avg {
public static void main(String args[]) {
	int a[]=new int[5];
	int a1=0;
	int avg;
	for(int i=0;i<a.length;i++) {
		try (Scanner sc = new Scanner(System.in)) {
			a[i]=sc.nextInt();
		//System.out.println("Hello");
		a1=a1+a[i];
		//System.out.println(Arrays.toString(a));
					}
	avg=a1/a.length;
	System.out.println(avg);
	
}
}
}