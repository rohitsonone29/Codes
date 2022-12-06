package shapewaitnotify;

import java.util.Scanner;

public class MyThread1 implements Runnable{
	
	Scanner sc=new  Scanner(System.in);
	@Override
	public void run()
	{
		System.out.println("inside thread1"); 
		//synchronized(s) {
		try
	     {
	       Thread.sleep(1000);
	       System.out.println("Enter radius of Circle: ");
	       double r=sc.nextDouble();
	       Shape s=new Circle(r);
	       System.out.println("Area of Circle: "+s.calArea());
	       System.out.println("Perimeter of Circle: "+s.calPerimeter());
	       //s.wait();
	       
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
		//}
	}
}