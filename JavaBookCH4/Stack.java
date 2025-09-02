public interface Stack {
    int size();
    boolean isEmpty();
    void push(Object obj) throws StackFullException;
    Object top() throws StackEmptyException;
    Object pop() throws StackEmptyException;
}
