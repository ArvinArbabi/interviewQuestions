public interface Queue {
    int size();
    boolean isEmpty();
    void enqueue(Object obj) throws QueueFullException;
    Object dequeue() throws QueueEmptyException;
    Object front() throws QueueEmptyException;
}
