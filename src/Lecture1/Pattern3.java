package Lecture1;
import java.util.*;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nst=n;
		
		int row=1;
		
		while(row<=n)
		{
		  int cst=1;
				while(cst<=nst)
				{
					System.out.print("*");
					cst++;
				}
			//prep
				System.out.println();
				nst--;
				row++;
		}
	}

}
