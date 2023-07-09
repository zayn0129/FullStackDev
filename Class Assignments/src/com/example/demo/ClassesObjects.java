package com.example.demo;

//Create a MyClass class
public class  ClassesObjects {
int x ;  // Create a class attribute x

// Create a class constructor for the MyClass class
public ClassesObjects () {
 x = 5 ;  // Set the initial value for the class attribute x to 5
}

public static void main(String[] args) {
 // Create an myObj object of class MyClass (This will call the constructor)
	ClassesObjects myObj = new ClassesObjects(); 
 // Print the value of x
 System.out.println(myObj.x);
}
} 

/*public class  ClassesObjects {
	  public void myMethod() {
	    System.out.println("Hello World");
	  }

	  public static void main(String[] args) {
		  ClassesObjects myObj = new ClassesObjects();
	   myObj .myMethod();
	  }
	} */


/*public class ClassesObjects {
			  int x = 5;

			  public static void main(String[] args) {
				  ClassesObjects  myObj = new ClassesObjects ();
			    System.out.println(myObj.x);
			  }
			

	}*/


