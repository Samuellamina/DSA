package dataStructures.stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Push: Add an element to the top of the stack.
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek/Top: Return the top element without removing it.
        System.out.println("Top element: " + stack.peek());
        stack.pop(); // Pop: Remove the top element from the stack.
        System.out.println("Top element after pop: " + stack.peek()); // Peek again (2)
        // isEmpty: Check if the stack is empty.
        System.out.println("Is the stack empty? " + stack.isEmpty());

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if(c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    // Simulating a Stack Using Two Queues
    /* To simulate a stack using two queues, we need to simulate the Last In,
    First Out (LIFO) behavior using the First In, First Out (FIFO) behavior of a queue.*/
    public static class StackUsingQueues {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        public void push(int value) {
            queue2.add(value);

            while(!queue1.isEmpty()) {
                queue2.add(queue1.remove());
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }
        public int pop() {
            if(queue1.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return queue1.remove();
        }
        public int top() {
            if(queue1.isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return queue1.peek();
        }
    }

    // checking if an expression has balanced parentheses or brackets.
    public boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            } else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            } else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /*Postfix notation (Reverse Polish notation) is another common problem.
    Use a stack to evaluate postfix expressions.*/
    public int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');  // Convert char to int
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
}
