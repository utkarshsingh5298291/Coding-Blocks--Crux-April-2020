package Lecture1;
import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int nr=2*n-1;
		int nst=1;
				//row
				int row=1;
				while(row<=nr)
				{
					//work
					int cst=1;
					while(cst<=nst)
					{
						System.out.print("*");
						cst++;
					}
					System.out.println();
					if(row<=nr/2)
					{
						nst++;
					}
					else {
						nst--;
					}
					row++;
				}
		
		
		
	}

}
