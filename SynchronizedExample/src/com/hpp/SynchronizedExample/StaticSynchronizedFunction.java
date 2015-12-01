package com.hpp.SynchronizedExample;

/*
 * 当作用在静态方法时锁住的便是对象对应的Class实例，
 * 因为Class数据存在于永久带，因此静态方法锁相当于该类的一个全局锁
 * */
public class StaticSynchronizedFunction {
	public static synchronized void doSomething() {
		System.out.println("task start......");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("task end......");
	}
	
	public static void doSomething1() {
		//锁住的对象对应的Class实例
		synchronized(StaticSynchronizedFunction.class) {
			System.out.println("task start1......");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("task end1......");
		}
	}
}

