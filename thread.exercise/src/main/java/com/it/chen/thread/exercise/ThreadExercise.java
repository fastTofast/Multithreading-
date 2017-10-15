package com.it.chen.thread.exercise;

/**
 * Hello world!
 *
 */
public class ThreadExercise 
{
    public static void main( String[] args )
    {
    	TestThread testThread = new TestThread();
    	testThread.setName("this线程名");
    	Thread thread = new Thread(testThread);
    	thread.setName("current线程名");
    	thread.start();
    	System.out.println(Thread.currentThread());
//    	testThread.start();
        System.out.println( "Hello World!" );
    }
}
