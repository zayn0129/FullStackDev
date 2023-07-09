package com.humana;

import java.util.ArrayList;

public class ArrayListPractice {
	

	public static void main(String[] args) {
		
		
		ArrayList myArrayList= new ArrayList();
		
		myArrayList.add(new String("first value"));
		
		myArrayList.add(2);
		
		myArrayList.add(true);
		
		for (int i=0; i < myArrayList.size(); i++) {
			
			System.out.println(myArrayList.get(i));
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
