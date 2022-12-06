package shapewaitnotify;

import java.util.Scanner;

public class MyThread1 implements Runnable{
	
	Scanner sc=new  Scanner(System.in);
	private Shape s;
	
	public MyThread1(Shape s) {
		this.s=s;
	}
	@Override
	public void run()
	{
		System.out.println("inside thread1"); 
		synchronized(this) {
		try
	     {
	       Thread.sleep(1000);
	       System.out.println("Enter radius of Circle: ");
	       double r=sc.nextDouble();
	       System.out.println("Area of Circle: "+s.calArea());
	       //System.out.println("Perimeter of Circle: "+s.calPerimeter());
	       wait();
	       
	     }
	     catch(InterruptedException e)
	     {
	    	 e.printStackTrace();
	     }
		}
	}
}