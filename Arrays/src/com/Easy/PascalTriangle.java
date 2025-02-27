package com.Easy;
import java.util.*;


public class PascalTriangle 
{
	public static List<List<Integer>> pascal(int n)
	{
		List<List<Integer>>res=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			
			List<Integer>row=new ArrayList<>();
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i)
				{
					row.add(1);
				}
				else
				{
					row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
				}
			}
			res.add(row);
		}
		return res;
	}

	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   List<List<Integer>>al=new ArrayList<>();
	   al=pascal(n);
	   System.out.println(al);
	   

	}

}
