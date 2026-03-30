package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int FULL_THRESHOLD = CAPACITY - 1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    public void countIn(int value) {
        if (!isFull())
            numbers[++total] = value;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL_THRESHOLD;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        final int TOP_VALUE = numbers[total];
        return TOP_VALUE;
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        final int REMOVED_VALUE = numbers[total--];
        return REMOVED_VALUE;
    }

    public int getTotal() {
        return total;
    }

}
