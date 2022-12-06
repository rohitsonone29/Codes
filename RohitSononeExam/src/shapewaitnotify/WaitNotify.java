package shapewaitnotify;

public class WaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s=new Circle(5);
		
		MyThread1 t1=new MyThread1(s);
		
		Thread th=new Thread(t1);
		
		th.start();
	
        MyThread2 t2=new MyThread2(s);
		
		Thread th1=new Thread(t2);
		
		th1.start();
		
	}

}
