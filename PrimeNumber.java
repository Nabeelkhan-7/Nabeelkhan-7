package pkg1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int i,m=0,flag=0;
		if ((n==0)|| (n==1))
		System.out.println("Number is not  Prime");
		else 
		{
		m=n/2;
		for(i=2;i<=m;i++)
		if(n%i==0)	
		{
			System.out.println("Number is not Prime");
			flag=1;
			break;
		}
		if(flag==0)
        System.out.println("Number is Prime");
        }
	}
}
