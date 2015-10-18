// For a more efficient solution, see: http://algs4.cs.princeton.edu/13stacks/QueueWithTwoStacks.java.html

class MyQueue {
    Stack<Integer> stack = new Stack<Integer>();
    Stack <Integer> queue = new Stack<Integer>();
    
    // Push element x to the back of queue.
    public void push(int x) {
        while (!queue.isEmpty()) stack.push(queue.pop());
        queue.push(x);
        while (!stack.isEmpty()) queue.push(stack.pop());
    }

    // Removes the element from in front of queue.
    public void pop() {
        queue.pop();
    }

    // Get the front element.
    public int peek() {
        return queue.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return queue.empty();
    }
}