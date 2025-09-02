// stack example ripped from textbook
public class ArrayStack implements Stack {
    public static final int CAPACITY = 1000; 
    private int capacity;
    private Object[] S; 
    private int top = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int cap) {
        capacity = cap;
        S = new Object[capacity];
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(Object obj) throws StackFullException {
        if (size() == capacity)
            throw new StackFullException("Stack Overflow");
        S[++top] = obj;
    }

    public Object top() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException("Stack is empty");
        return S[top];
    }

    public Object pop() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException("Stack is empty");
        Object elem = S[top];
        S[top--] = null;
        return elem;
    }
}
