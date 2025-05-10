package ejercicio1;
import actividades.ExceptionIsEmpty;
import actividades.Stack;

public class Test {
    public static void main(String[] args) {
        try {
            Stack<Integer> intStack = new StackLink<>();
            intStack.push(10);
            intStack.push(20);
            intStack.push(30);
            System.out.println("stack enteros: " + intStack);
            System.out.println("top: " + intStack.top());
            System.out.println("pop: " + intStack.pop());
            System.out.println("result: " + intStack);

            Stack<String> stringStack = new StackLink<>();
            stringStack.push("!!!!");
            stringStack.push("World");
            stringStack.push("Hello");
            System.out.println("stack stirng: " + stringStack);
            System.out.println("top: " + stringStack.top());
            System.out.println("pop: " + stringStack.pop());
            System.out.println("result: " + stringStack);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        } 
    }
}