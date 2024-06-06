package com.demo.test;
import java.util.*;


public class IsPrime {
	
	
	
	
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter numbers");
	int [] arr = new int[3];
	for(int i=0;i<3;i++)
	{
		arr[i]= sc.nextInt();
	}	
	for(int i=0;i<3;i++)
	{
		for(int j=2;j<arr.length;j++)
		{
			if(arr[i]%j!=0)
			{
				for(int k=1;k<=10;k++)
				{
					
					System.out.println("no. is prime:"+arr[i]+"table is :" +arr[i]+"*"+k+"="+arr[i]*k);
				}
			}
			else
			{
				int res = arr[i]/10;
				System.out.println("result is :"+res);
			}
		}
	}
	{
		
	}
	
	}
}
	
	