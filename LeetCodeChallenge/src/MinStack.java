import java.util.Stack;

class MinStack {

    Stack<Integer> tempStack = new Stack();
    Stack<Integer> minStack = new Stack();
    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        if (tempStack.isEmpty()) {
            tempStack.push(x);
            minStack.push(x);
        } else {
            tempStack.push(x);
            int y = minStack.pop();
            minStack.push(y);
            if (x < y)
                minStack.push(x);
            else
                minStack.push(y);
        }
    }

    public void pop() {
        int x = tempStack.pop();
        minStack.pop();
    }

    public int top() {
        return tempStack.pop();
    }

    public int getMin() {
        int x = minStack.pop();
        minStack.push(x);
        return x;
    }
}



