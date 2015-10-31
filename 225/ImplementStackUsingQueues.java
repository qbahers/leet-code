class ImplementStackUsingQueues {
    Queue<Integer> queue = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
        for (int k = 0; k < queue.size() - 1; k++)
            queue.add(queue.poll());
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}