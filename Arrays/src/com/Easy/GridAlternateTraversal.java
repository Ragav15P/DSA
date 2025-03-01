package com.Easy;
import java.util.*;

public class GridAlternateTraversal 
{

	public static void main(String[] args) 
	{
		List<Integer>res=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<m;j+=2)
				{
					if(j%2==0)
					{
						res.add(a[i][j]);
					}
				}
			}
			else
			{
				for(int j=n-1;j>=0;j--)
				{
					if(j%2==1)
					{
						res.add(a[i][j]);
					}
				}
			}
		}
		System.out.println(res);
		

	}

}
