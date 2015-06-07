package Exam2013.listNode;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public interface Stack<T> {
    public T top();
    public T pop();
    public T push(T c);
    public boolean isEmpty();
}
