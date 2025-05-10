package ejercicio2;
import actividades.ExceptionIsEmpty;
import actividades.Queue;

public class QueueArray<E> implements Queue<E> {
    private E[] array;
    private int first;
    private int last;
    private int size;
    private int capacity;
    @SuppressWarnings("unchecked")
    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.array = (E[]) new Object[capacity];
        this.first = 0;
        this.last = -1;
        this.size = 0;
    }
    @Override
    public void enqueue(E x) throws ExceptionIsEmpty {
        if (isFull()) {
            throw new ExceptionIsEmpty("queue llena");
        }
        last = (last + 1);
        if (last == capacity) {
            last = 0;
        }
        array[last] = x;
        size += 1;
    }
    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("queue vacia");
        }
        E data = array[first];
        array[first] = null;
        first = first + 1;
        if (first == capacity) {
            first = 0;
        }
        size -= 1;
        return data;
    }
    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("queue llena");
        }
        return array[first];
    }
    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("queue vacia");
        }
        return array[last];
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queue: ");
        for (int i = 0; i < size; i++) {
            sb.append(array[(first + i) % capacity]).append(" ");
        }
        return sb.toString().trim();
    }
}