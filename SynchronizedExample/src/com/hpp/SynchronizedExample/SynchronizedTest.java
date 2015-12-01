package com.hpp.SynchronizedExample;

public class SynchronizedTest {
	public static void main(String[] arg) {
		// Test StaticSynchronizedFunction
//		for (int i = 0; i < 10; i++) {
//			new Thread() {
//
//				@Override
//				public void run() {
//					StaticSynchronizedFunction.doSomething();
//				}
//				
//			}.start();
//		}
//		
//		for (int i = 0; i < 10; i++) {
//			new Thread() {
//
//				@Override
//				public void run() {
//					StaticSynchronizedFunction.doSomething1();
//				}
//				
//			}.start();
//		}
		
		// Test SynchronizedObject doSomething
//		SynchronizedObject object = new SynchronizedObject();
//		for (int i = 0; i < 10; i++) {
//			new Thread() {
//				@Override
//				public void run() {
//					object.doSomething();
//				}
//				
//			}.start();
//		}
		
		// Test SynchronizedObject doSomething1
//		SynchronizedObject object1 = new SynchronizedObject();
//		for (int i = 0; i < 10; i++) {
//			new Thread() {
//				@Override
//				public void run() {
//					object1.doSomething1();
//				}
//				
//			}.start();
//		}
		
		// Test SynchronizedObject doSomething2
//		for (int i = 0; i < 10; i++) {
//			new Thread() {
//				@Override
//				public void run() {
//					SynchronizedObject object1 = new SynchronizedObject();
//					object1.doSomething2();
//				}
//				
//			}.start();
//		}
//		
//		SynchronizedObject object2 = new SynchronizedObject();
//		for (int i = 0; i < 10; i++) {
//			new Thread() {
//				@Override
//				public void run() {
//					object2.doSomething2();
//				}
//				
//			}.start();
//		}
		
		SynchronizedObject object3 = new SynchronizedObject();
		Object lock = new Object();
		for (int i = 0; i < 10; i++) {
			new Thread() {
				@Override
				public void run() {
					synchronized(lock) {
						object3.doSomething3();
					}
				}
				
			}.start();
		}
	}
}
