package com.Easy;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
	       int n=s.nextInt();
	       int max1=Integer.MIN_VALUE;
	       int max2=Integer.MIN_VALUE;
	       int a[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=s.nextInt();
	       }
	       for(int j=0;j<n;j++)
	       {
	    	   if(a[j]>max1)
	    	   {
	    		   max1=a[j];
	    	   }
	       }
	       for(int j=0;j<n;j++)
	       {
	    	   if(a[j]>max2 && a[j]!=max1)
	    	   {
	    		   max2=a[j];
	    	   }
	       }
	       System.out.println(max2);
	}

}
