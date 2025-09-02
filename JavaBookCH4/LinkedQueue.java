//linked Queue example ripped from textbook

public class LinkedQueue implements Queue {
    private Node head;
    private Node tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(Object obj) {
        Node node = new Node();
        node.setElement(obj);
        node.setNext(null);
        if (size == 0)
            head = node;
        else
            tail.setNext(node);
        tail = node;
        size++;
    }

    public Object dequeue() throws QueueEmptyException {
        if (size == 0)
            throw new QueueEmptyException("Queue is empty.");
        Object obj = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return obj;
    }

    public Object front() throws QueueEmptyException {
        if (size == 0)
            throw new QueueEmptyException("Queue is empty.");
        return head.getElement();
    }
}
