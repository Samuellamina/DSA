package dataStructures.stacksandqueues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class QueueOperations {
    public static void main(String[] args) {
        // FIFO
        // Enqueue (Adding an item), Adds an item to the back of the queue.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);  // Enqueue 10
        queue.add(20);  // Enqueue 20
        /*Dequeue (Removing an item):
        Removes and returns the item from the front of the queue.*/
        int front = queue.poll();
        // Peek (Look at the front item): Views the item at the front without removing it.
        int front2 = queue.peek();
        //IsEmpty Checks if there are no items in the queue.
        boolean isEmpty = queue.isEmpty();
    }

    public void bfs(int start, List<List<Integer>> graph) {
        boolean[] visited =new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node + "");

            for(int neighbor : graph.get(node)) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Simulating a Queue Using Two Stacks
   /* Normally, a queue operates in a First In, First Out (FIFO) manner,
    while a stack operates in a Last In, First Out (LIFO) way.
    To simulate queue behavior using two stacks, we can balance these two
    opposites by splitting the enqueue and dequeue actions between two stacks.*/
    public static class QueueUsingStacks {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        public void enqueue(int value) {
            stack1.push(value);
        }
        public int dequeue() {
            if (stack2.isEmpty()) {
                // Transfer all elements from stack1 to stack2
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            // If stack2 is still empty after transfer, queue is empty
            if (stack2.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return stack2.pop();
        }
        // Peek the front element
        public int peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }
    }
}
