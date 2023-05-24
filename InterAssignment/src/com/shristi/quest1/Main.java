package com.shristi.quest1;
public class Main {
	public static  void main(String[] args) {
		Calculator calculator=(int a,int b)->
		{
			return a+b;
		};
		System.out.println("Addition "+calculator.calculate(10, 20));
		Calculator calculator1=(int a,int b)->
		{
			return a-b;
		};
		System.out.println("Subtraction "+calculator1.calculate(10, 20));
		Calculator calculator2=(int a,int b)->
		{
			return (a*b);
		};
		System.out.println("Product "+calculator2.calculate(10, 20));
		Calculator calculator3=(int a,int b)->
		{
			return a/b;
		};
		System.out.println("Division "+calculator3.calculate(10, 20));
	}
}
