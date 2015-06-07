package Exam2013.listNode;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class StackImpl<T> implements Stack<T> {
    private T item;
    private StackImpl<T> next;

    public StackImpl(T item, StackImpl<T> next) {
        this.next = next;
        this.item = item;
    }

    @Override
    public T top() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public Object push(Object c) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
