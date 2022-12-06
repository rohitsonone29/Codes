package shapewaitnotify;

import java.util.Scanner;

public class MyThread2 implements Runnable{
	
	Scanner sc=new  Scanner(System.in);
	Shape s;
	@Override
	public void run()
	{
		System.out.println("inside thread2");
	     try
	     {
	       Thread.sleep(5000);
	       synchronized(s) {
	    	   //s.notify();
	       //System.out.println(s.calPerimeter());
	     }
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
	     
	}
}