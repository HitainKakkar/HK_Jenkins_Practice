package com.nagarro.thread;
import java.util.*;

public class Practice {

    
    public static void main(String[] args) {
    	Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();
        
        Thread thread3 = new Thread(() -> {
        	System.out.println("Thread3");
        	
        });
        // Start the threads
        obj1.start();
        obj2.start();
        thread3.start();
        
        Xyz add = (int x, int y) -> x+y;
        // Create a LinkedList object         
        int[] arr = new int[3];
        LinkedList<Integer> ll = new  LinkedList<Integer>();
        LinkedList<String> cars = new LinkedList<String>();
        
        // Create a HashMap object 
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        String originalString = "Hello";
        originalString = "212";
        // Modifying the string using concat method
        String modifiedString = originalString.concat(" World");
    }
}
