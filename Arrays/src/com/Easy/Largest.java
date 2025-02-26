package com.Easy;
import java.util.*;

public class Largest {

	public static void main(String[] args) 
	{
		
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int max=Integer.MIN_VALUE;
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   a[i]=s.nextInt();
       }
       for(int j=0;j<n;j++)
       {
    	   if(a[j]>max)
    	   {
    		   max=a[j];
    	   }
       }
       System.out.println(max);
       
	}

}
