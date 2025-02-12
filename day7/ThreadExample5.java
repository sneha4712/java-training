package com.celcom.day7;
//Inter-Thread Communication

class Resuource {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}

class Reader extends Thread {
	Resuource resource;

	Reader(Resuource resource) {
		this.resource = resource;

	}

	@Override
	public void run() {
		synchronized (resource) {
			System.out.println("Reader is waiting for writer to write a data");
			try {
				resource.wait();
			} catch (InterruptedException e) {
				System.out.println("Data from Reader : " + resource.getData());
			}
		}
	}
}

class Writer extends Thread {
	Resuource resource;

	Writer(Resuource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		synchronized (resource) {
			System.out.println("Writer is writing the data");
			resource.setData("Hello Reader");
			resource.notify();
	}
	}
}
public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		Resuource resource = new Resuource();
		
		Reader reader = new Reader(resource);
		reader.start();
		
//		Thread.sleep(1000);
		
		Writer writer = new Writer(resource);
		writer.start();

	}

}

	
