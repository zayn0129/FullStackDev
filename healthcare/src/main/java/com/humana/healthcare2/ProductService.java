package com.humana.healthcare2;

import java.util.ArrayList;

public class ProductService {
	

	public static void main(String[] args) {
		
		
		ArrayList myArrayList= new ArrayList();
		
		myArrayList.add(new String("first value"));
		
		myArrayList.add(2);
		
		myArrayList.add(true);
		
		myArrayList.add(new String("second value"));
		
		myArrayList.add(4);
		
		myArrayList.add(false);
		
		for (int i=0; i < myArrayList.size(); i++) {
			
			System.out.println(myArrayList.get(i));
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
