package com.test.rg;

import java.util.ArrayList;
import java.util.List;

public class ListAsStackArrayQueue {

    public static class ListAsStack<T> {
        private List<T> stack;

        public ListAsStack() {
            stack = new ArrayList<>();
        }

        public void push(T element) {
            stack.add(element);
        }

        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return stack.remove(stack.size() - 1);
        }

        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return stack.get(stack.size() - 1);
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        ListAsStack<Integer> stack = new ListAsStack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());
    }
}
