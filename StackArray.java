public class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;
    public StackArray(int n){
        this.array = (E[])new Object[n];
        tope = -1;
    }
    public void push(E x){
        if (isFull()) {
            System.out.println("stack full");
            return;
        }
        array[++tope] = x;    
    }
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("stack vacio");
        }
        E element = array[tope];
        array[tope--] = null;
        return element;
    }
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("stack vacio");
        }
        return array[tope];
    }
    public boolean isEmpty() {
        return this.tope == -1;
    }
    public boolean isFull (){
        int count = 0;
        for (E e : array) {
            count += 1;
            if(e == null && count == tope) {
                return true;
            }
        }
        return false;
    
    }    
    public String toString(){
        String s = "Array: ";
        for (E e : array) {
            s += e + " ";
            if(e == null)
                return s;
        }
        return s;    
    }
}

