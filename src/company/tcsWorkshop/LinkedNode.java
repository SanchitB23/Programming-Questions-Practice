package company.tcsWorkshop;

public class LinkedNode<T> {
    private LinkedNode<T> next;
    private T data;

    public LinkedNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
