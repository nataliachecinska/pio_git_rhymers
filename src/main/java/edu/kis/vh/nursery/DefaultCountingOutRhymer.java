package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int stala1 = 12;
    public static final int stala2 = -1;
    public static final int stala3 = 11;
    private final int[] numbers = new int[stala1];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == stala2;
    }

    public boolean isFull() {
        return total == stala3;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
