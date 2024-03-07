package com.kn.insta;

public class Chatting extends Thread{
	@Override
	public void run(){
		try {
			System.out.println("Chating started");
			
			System.out.println("Chit chat chit chat");
			
			System.out.println("Chating ended");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
