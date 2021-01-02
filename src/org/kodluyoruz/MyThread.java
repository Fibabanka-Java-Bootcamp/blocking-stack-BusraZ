package org.kodluyoruz;

import java.util.Stack;

public class MyThread extends Thread{
    Stack<Integer> stack = new Stack<Integer>();
    StackProccess dene ;
        MyThread(String name, StackProccess dene){
            super(name);
            this.dene=dene;
        }

        public void run() {
            System.out.println(this.getName() + " is starting");

            try {
                dene.stack_peek(stack);
                Thread.sleep(400);
                dene.stack_pop(stack);


            } catch (InterruptedException e) {
                System.out.println(getName() + " is interrupted");
            }
            System.out.println(getName() + " is terminating");
        }
    }
