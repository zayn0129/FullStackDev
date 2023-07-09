package com.example.demo;

public class Array {

	public static void main(String[] args) {
		
		String[] cars  = {"Volvo", "BMW", "Ford"};
		
		System.out.println(cars[2]);
		
		String[] carss = {"Volvo", "BMW", "Ford"};
		System.out.println(carss[0]);
		
		String[] carsss = {"Volvo", "BMW", "Ford"};
		carsss[0] ="Opel" ;
		System.out.println(carsss[0]);
		
		String[] carssss = {"Volvo", "BMW", "Ford"};
		System.out.println(carssss.length);
		
		String[] carrs = {"Volvo", "BMW", "Ford"};
		 for (String i	 : carrs ) {
		  System.out.println(i);
		}
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		
		
		
		// TODO Auto-generated method stub

	}

}
