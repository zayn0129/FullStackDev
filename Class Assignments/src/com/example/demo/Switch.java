package com.example.demo;

public class Switch {

	public static void main(String[] args) {
		
		int day = 2;
		switch (day) {
		case 1:
		    System.out.println("Saturday");
		    break;
		case 2:
		    System.out.println("Sunday");
		    
		    int days = 4;
		    switch (days) {
		    case 1:
		        System.out.println("Saturday");
		        break;
		    case 2:
		        System.out.println("Sunday");
		       break ;
		     default :
		        System.out.println("Weekend");
		    }
		}
		// TODO Auto-generated method stub

	}

}
