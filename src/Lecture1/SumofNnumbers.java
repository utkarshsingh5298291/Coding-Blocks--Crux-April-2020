package Lecture1;
import java.util.Scanner;
public class SumofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(counter<=n)
		{
			sum=sum+counter;
			
			counter=counter+1;
			
		}
		
		System.out.println(sum);
	}

}
