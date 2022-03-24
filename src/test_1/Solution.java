package test_1;

import java.util.Scanner;

public class Solution
{
	Scanner Sc = new Scanner(System.in);
	public Solution()
	{
		int A = Sc.nextInt();
		int B = Sc.nextInt();
		
		int N = eucd(Math.max(A, B),Math.min(A, B));
		
		A=A/N; //최대공약수로 두수를 나눠서 몫구하는과정
		B=B/N;
		
		int M = A*B*N; //최소공배수는 최대공약수 * 두수의 몫
		
		System.out.println(N);
		System.out.println(M);
	}
	
	public int eucd(int a,int b) //유클리드 호제법 (A>B)
	{
		int r = a%b;
		if(r==0)
		{
			return b; 
		}
		else
		{
			return eucd(b,r);
		}
	}
}