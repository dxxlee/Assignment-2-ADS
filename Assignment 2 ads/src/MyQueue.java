import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Comparator;
class MyQueue<T> {
    private MyList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (list.size() == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        T front = list.getFirst();
        list.removeFirst();
        return front;
    }

    public T peek() {
        if (list.size() == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}