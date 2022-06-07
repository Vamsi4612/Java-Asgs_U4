package com.masai;

public class Area extends Shape  {
	
	final double pi = 3.14;
	
	public static void main(String[] args) {
		Area a = new Area();
		int ans1 = a.rectangleArea(5, 4);
		int ans2 = a.squareArea(5);
		int ans3 = a.circleArea(5);
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);

	}

	@Override
	public int rectangleArea(int length, int breadth) {
		int area = length*breadth;
		return area;
	}

	@Override
	public int squareArea(int side) {
		int area = side*side;
		return area;
	}

	@Override
	public int circleArea(int radius) {
		int area = (int)pi*radius;
		return area;
	}
	
	

}
