package com.nagarro.thread;

public class Class2 extends Thread{
	
	@Override
	public void run()
    {
        for(int i=0; i<100; i++)
        System.out.println("Class Two");
    }
}
