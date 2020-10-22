package DataStructures;

public class StackImplmentationWithArray {

    private int[] arr;
    private int peekIndex;
    private int capacity;

    StackImplmentationWithArray(int size){
        capacity = size;
        arr = new int[size];
        peekIndex = -1;
    }

    //push , pop, peekp

    public boolean isEmpty(){
        return peekIndex == -1;
    }

    public void push(int val){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("DataStructures.Stack reached maximum capacity, cannot push new values ");
        }
        arr[++peekIndex] = val;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("DataStructures.Stack is Empty, Cannot return peek element");
        }
        return arr[peekIndex];
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("DataStructures.Stack is Empty, Cannot perform pop Operation");
        }
        return arr[peekIndex--];
    }

    public int size(){
        return peekIndex+1;
    }

    public boolean isFull(){
        return peekIndex == capacity-1;
    }


}
