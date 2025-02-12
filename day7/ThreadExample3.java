package com.celcom.day7;

class MyThread1 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Running....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread1());
		System.out.println(t1.getState()); // new
		t1.setName("T1");
		
		Thread t2 = new Thread(new MyThread1());
		
		t2.setName("T2");
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		t1.start(); // starting or running my thread t1
		t2.start();
		
		Thread.sleep(3000);
		
		System.out.println("MAIN END");
		
		t1.suspend();
		System.out.println(t1.getState());
		t1.resume();

	}

}
