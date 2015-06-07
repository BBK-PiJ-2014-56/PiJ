package Exam2013.listNode;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public interface ListNode<T> {
    public T getItem();
    public void setItem(T item);
    public ListNode<T> getNext();
    public void setNext(ListNode<T> l);
}

