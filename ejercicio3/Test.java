package ejercicio3;
import actividades.ExceptionIsEmpty;
import actividades.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        try {
            PriorityQueue<String, Integer> priorityQueue = new PriorityQueueLinked<>(3);
            priorityQueue.enqueue("Bajo", 0);
            priorityQueue.enqueue("Medio", 1);
            priorityQueue.enqueue("Alto", 2);
            priorityQueue.enqueue("Muy Alto", 2);

            System.out.println(priorityQueue);

            System.out.println("Front: " + priorityQueue.front());
            System.out.println("Back: " + priorityQueue.back());
            System.out.println("Dequeue: " + priorityQueue.dequeue());
            System.out.println("Result: \n" + priorityQueue);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}