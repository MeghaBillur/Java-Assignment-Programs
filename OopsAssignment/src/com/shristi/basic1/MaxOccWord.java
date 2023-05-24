package com.shristi.basic1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class MaxOccWord {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter a Word");
		String str=sc.next();
		char[] ch=str.toCharArray();
		int[] fr=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			 if(ch[i]==ch[j])
				{
					count++;
					fr[j]=-1;
				}
			if(fr[i]!=-1)
				fr[i]=count;
		}
		for(int i=0;i<ch.length;i++)
			if(fr[i]!=-1)
				System.out.println(ch[i]+"\t"+fr[i]);
	}

}
