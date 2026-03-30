package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int size;

    private static final int EMPTY = -1;

    public void push(int value) {
        if (last == null)
            last = new Node(value);
        else {
            last.setNext(new Node(value));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
        size++;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        final int TOP_VALUE = last.getValue();
        return TOP_VALUE;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        final int POPPED_VALUE = last.getValue();
        last = last.getPrev();
        size--;
        return POPPED_VALUE;
    }

    public int getSize() {
        return size;
    }

}
