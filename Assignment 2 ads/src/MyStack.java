import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Comparator;
class MyStack<T> {
    private MyList<T> list;

    public MyStack() {
        list = new MyLinkedList<>();
    }

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (list.size() == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        T top = list.getFirst();
        list.removeFirst();
        return top;
    }

    public T peek() {
        if (list.size() == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
