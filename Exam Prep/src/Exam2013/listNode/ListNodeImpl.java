package Exam2013.listNode;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class ListNodeImpl<T> implements ListNode<T>, Stack{
    private T obj;
    private ListNode<T> nextNode;

    public ListNodeImpl(T obj, ListNode<T> nextNode) {
        this.obj = obj;
        this.nextNode = nextNode;
    }

    @Override
    public T getItem() {
        return obj;
    }

    @Override
    public void setItem(T item) {
        obj = item;
    }

    @Override
    public ListNode<T> getNext() {
        return nextNode;
    }

    @Override
    public void setNext(ListNode<T> l) {
        nextNode = l;
    }
    public static int listSum(ListNode<Integer> head) {
        int sum = head.getItem();
        sum += listSum(head.getNext());
        return sum;
    }
    public static <T> ListNode<T> reverse(ListNode<T> head) {
        Stack s = new StackImpl<T>(head.getItem(), (StackImpl<T>) head.getNext());
        while (head != null) {
            s.push(head.getItem());
            head = head.getNext();
        }

    return head;
    }

    @Override
    public Object top() {
        return null;
    }

    @Override
    public Object pop() {
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
