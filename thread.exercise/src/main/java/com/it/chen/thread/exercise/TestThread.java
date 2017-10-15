package com.it.chen.thread.exercise;


public class TestThread extends Thread {

	@Override
	public void run(){
		System.out.println("this======"+this.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("current======="+currentThread().getName());
		System.out.println("id======="+getId());
		try {
			throw new InterruptedException("线程终止");
		}catch(InterruptedException exception){
			System.out.println("异常....");
		}
	}
	
}
