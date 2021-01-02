package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StackProccess dene = new StackProccess();
        MyThread thread1= new MyThread("Thread1",dene);

        thread1.start();

        try {
            thread1.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
        System.out.println("Main thread is finishing");
    }
}
