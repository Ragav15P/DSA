package com.Easy;
import java.util.*;

public class RemoveDuplicatesRecursively 
{

	public static void main(String[] args) 
	{
		
       Scanner s=new Scanner(System.in);
       String input=s.next();
       StringBuilder res=new StringBuilder();
       for(char ch : input.toCharArray())
       {
    	   int len=res.length();
    	   if(len>0 && res.charAt(res.length()-1)==ch)
    	   {
    		   res.deleteCharAt(len-1);
    	   }
    	   else
    	   {
    		   res.append(ch);
    	   }
       }
       System.out.println(res.toString());
	}

}
