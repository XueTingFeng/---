package com.atguigu.linkedlist;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.add("tom");
        stack.add("jack");
        stack.add("smith");

        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }
}
