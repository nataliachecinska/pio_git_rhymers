package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer realizuje mechanizm prostej wyliczanki
 * opartej na strukturze stosu o stałej pojemności.
 * Pozwala na przechowywanie liczb całkowitych w tablicy.
 */
public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY = -1;
    public static final int FULL_THRESHOLD = CAPACITY - 1;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    /**
     * Wstawia nową wartość do wyliczanki (na górę stosu)
     * Operacja wykonywana jedynie, gdy wyliczanka nie jest pełna
     * * @param value liczba całkowita do dodania
     */
    public void countIn(int value) {
        if (!isFull())
            numbers[++total] = value;
    }

    /**
     * Sprawdza czy wyliczanka nie zawiera żadnych elementów
     * * @return true, jeśli wyliczanka jest pusta
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza czy osiągnięto maksymalny limit pojemności
     * * @return true, jeśli nie ma już miejsca na nowe elementy
     */
    public boolean isFull() {
        return total == FULL_THRESHOLD;
    }

    /**
     * Pozwala podejrzeć ostatnio dodaną wartość bez jej usuwania
     * @return ostatnia wartość na stosie lib wartość EMPTY, jeśli stos pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        final int TOP_VALUE = numbers[total];
        return TOP_VALUE;
    }

    /**
     * Zwraca ostatnio dodaną wartość i zdejmuje ją ze stosu
     * @return usunięta wartość lub EMPTY, jeśli stos pusty
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        final int REMOVED_VALUE = numbers[total--];
        return REMOVED_VALUE;
    }

    /**
     * Zwraca aktualny stan licznika elementów
     * @return  bieżąca wartość zmiennej total wskazująca na indeks ostatniego elementu
     */
    public int getTotal() {
        return total;
    }

}
