package Searching_and_sorting;

import java.util.Arrays;

class Thread1 extends Thread{
	public void run() {
		for(int i=1; i<=25; i++) {
			System.err.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=1; i<=25; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class practice {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}
