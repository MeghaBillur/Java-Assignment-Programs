package com.shristi.quest2;
public class Basic implements BasicCalculator
{

	@Override
	public void add(int a, int b) {
		System.out.println("Addition "+(a+b));
	}

	@Override
	public void difference(int a, int b) {
		System.out.println("Difference "+(a-b));
	}

	@Override
	public void product(int a, int b) {
		System.out.println("Product "+(a*b));
	}

	@Override
	public void divide(int a, int b) {
		System.out.println("Division "+(a/b));
	}

}
