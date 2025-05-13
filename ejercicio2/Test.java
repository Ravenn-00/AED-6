package ejercicio2;
import actividades.ExceptionIsEmpty;
import actividades.Queue;

public class Test {
    public static void main(String[] args) {
        try {
            Queue<Integer> intQueue = new QueueArray<>();
            intQueue.enqueue(10);
            intQueue.enqueue(20);
            intQueue.enqueue(30);
            System.out.println("queue enteros: " + intQueue);
            System.out.println("front: " + intQueue.front());
            System.out.println("back: " + intQueue.back());
            System.out.println("dequeue: " + intQueue.dequeue());
            System.out.println("result: " + intQueue);

            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

            Queue<String> stringQueue = new QueueArray<>();
            stringQueue.enqueue("Hello");
            stringQueue.enqueue("World");
            stringQueue.enqueue("!!!");
            System.out.println("queue strings: " + stringQueue);
            System.out.println("front: " + stringQueue.front());
            System.out.println("back: " + stringQueue.back());
            System.out.println("dequeue: " + stringQueue.dequeue());
            System.out.println("result: " + stringQueue);

        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}