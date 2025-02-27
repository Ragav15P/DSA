package com.Easy;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);
	       int n=s.nextInt();
	       int j=0;
	  
	       int a[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=s.nextInt();
	       }
	       for(int i=1;i<n;i++)
	       {
	    	   if(a[i]!=a[j])
	    	   {
	    		   a[j+1]=a[i];
	    		   j++;
	    	   }
	       }
	       for(int i=0;i<=j;i++)
	       {
	    	   System.out.println(a[i]+" ");
	       }
	}

}
