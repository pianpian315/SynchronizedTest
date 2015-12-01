package com.hpp.SynchronizedExample;

public class SynchronizedObject {
	/*
	 * 当synchronized作用在方法上时，锁住的便是对象实例（this）
	 * */
	public synchronized void doSomething() {
		System.out.println("task start......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("task end......");
	}
	
	public void doSomething1() {
		// 直接锁定对象实例（this）
		synchronized(this) {
			System.out.println("task1 start......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("task1 end......");
		}
	}
	
	public void doSomething2() {
		// 锁住的对象对应的Class实例
		synchronized(SynchronizedObject.class) {
			System.out.println("task2 start......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("task2 end......");
		}
	}
	
	public void doSomething3() {
		System.out.println("task2 start......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("task2 end......");
	}
}
