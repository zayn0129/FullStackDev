package com.example.demo;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5;i++ ) {
			  System.out.println("Yes");
			}
		
		String[] cars = {"Volvo", "BMW", "Ford"};
		 for (String i :cars ) {
		  System.out.println(i);
		}
		 
		 for (int i = 0; i < 10; i++) {
			  if (i == 5) {
			break    ;
			  }
			  System.out.println(i);
			}
		 
		 for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			continue    ;
			  }
			  System.out.println(i);
			}
		 
		 
		// TODO Auto-generated method stub

	}

}
