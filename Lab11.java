class MyRunnable implements Runnable{
	@Override 
	public void run(){
		try{
			Thread.sleep(500);
			System.out.println("Thread" + Thread.currentThread().getName() + "running ");
			}catch(InterruptedException e){
			e.printStackTrace();
			}
		}
	}

public class Lab11{
	public static void main(String[] args){
		MyRunnable myRunnable=new MyRunnable();
		Thread t1=new Thread(myRunnable);
		Thread t2=new Thread(myRunnable);
		Thread t3=new Thread(myRunnable);
		
		t1.start();
		t2.start();
		t3.start();
	}
}