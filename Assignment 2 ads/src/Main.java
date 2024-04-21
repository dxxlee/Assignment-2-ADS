
public class Main {
    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
        testStack();
        testQueue();
        testMinHeap();
    }

    public static void testArrayList() {
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(4);

        System.out.println("ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        arrayList.remove(2);

        arrayList.sort();

        System.out.println("Sorted ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

    public static void testLinkedList() {
        MyList<String> linkedList = new MyLinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        System.out.println("LinkedList:");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println();

        linkedList.remove(2);

        System.out.println("LinkedList after removing:");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void testStack() {
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println("Stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void testQueue() {
        MyQueue<String> queue = new MyQueue<>();

        queue.enqueue("One");
        queue.enqueue("Two");
        queue.enqueue("Three");

        System.out.println("Queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }

    public static void testMinHeap() {
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        heap.add(5);
        heap.add(3);
        heap.add(8);
        heap.add(1);
        
        System.out.println("MinHeap:");
        while (heap.size() > 0) {
            System.out.print(heap.removeMin() + " ");
        }
        System.out.println();
    }
}