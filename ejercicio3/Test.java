package ejercicio3;
import actividades.ExceptionIsEmpty;
import actividades.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        try {
            PriorityQueue<String, Integer> priorityQueue = new PriorityQueueLinked<>(4);
            priorityQueue.enqueue("bajo", 0);
            priorityQueue.enqueue("medio", 1);
            priorityQueue.enqueue("alto", 2);
            priorityQueue.enqueue("muy alto 1", 3);
            priorityQueue.enqueue("muy alto 2", 3);

            System.out.println(priorityQueue);

            System.out.println("front: " + priorityQueue.front());
            System.out.println("back: " + priorityQueue.back());
            System.out.println("dequeue: " + priorityQueue.dequeue());
            System.out.println("++++++++++++++");
            System.out.println("result: " + priorityQueue);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}