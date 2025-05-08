public class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;
    public StackArray(int n){
    this.array = (E[])new Object[n];
    tope = -1;
    }
    public void push(E x){
    
    }
    public E pop() throws ExceptionIsEmpty {

    }
    public E top() throws ExceptionIsEmpty {

    }
    public boolean isEmpty() {
        return this.tope == -1;
    }
    public boolean isFull (){
    
    }    
    public String toString(){
    
    }
}

