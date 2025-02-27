package com.Easy;
import java.util.*;


public class CheckIfSorted {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	       int n=s.nextInt();
	       boolean flag=true;
	 
	       int a[]=new int[n];
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=s.nextInt();
	       }
	       for(int i=1;i<n;i++)
	       {
	    	   if(a[i]<a[i-1])
	    	   {
	    		   flag=false;
	    		   break;
	    	   }
	       }
	       if(flag)
	       {
	    	   System.out.println("Sorted");
	       }
	       else
	       {
	    	   System.out.println("False");
	       }

	}

}
