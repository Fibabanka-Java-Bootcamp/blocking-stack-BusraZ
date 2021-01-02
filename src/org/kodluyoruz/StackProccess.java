package org.kodluyoruz;

import java.util.Stack;

public class StackProccess {


    synchronized void stack_peek(Stack<Integer> stack) {
        if(!stack.empty()){
            Integer element = (Integer) stack.peek();
            System.out.println("Yığındaki eleman: " + element);
            notify();
        }
        for(int i=1;i<5;i++) {
            stack.push(i);
        }
        Integer element = (Integer) stack.peek();
        System.out.println("Yığındaki eleman: " + element);
        notify();
        try {
            while (stack.empty()) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized void stack_pop(Stack<Integer> stack){
        Integer y = (Integer) stack.pop();
        System.out.println("Silinen eleman:" + y);
         notify();
        try {
            while (stack.empty()) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
