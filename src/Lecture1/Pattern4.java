package Lecture1;
import java.util.*;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=1;
		int nsp=n-1;		
		//row
		int row=1;
		while(row<=n)
		{
			//work
		  int csp=1;
				while(csp<=nsp)
				{
					System.out.print(" ");
					csp++;
				
				}
			//work star
				int cst=1;
				while(cst<nst)
				{
				
					System.out.print("*");
					cst++;
					
				}
				//PREP
				System.out.println();
				nst++;
				nsp--;
				row++;
		}
	}

}
