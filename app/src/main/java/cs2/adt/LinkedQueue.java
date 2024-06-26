package cs2.adt;
import java.lang.*;
import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queue<T> {
  private class Node {
    public T data;
    public Node next;
    public Node(T d, Node n) {
      data = d; next = n;
    }
  }
  private Node head;
  private Node last;

  public LinkedQueue() {
    head = null;
    last = null;
  }

  public void enqueue(T item) {
    if(isEmpty()) {
      head = new Node(item, null);
      last = head;
    } else {
      last.next = new Node(item, null);
      last = last.next;
    }
  }
  public T dequeue() {
    if(isEmpty()) {
      throw new NoSuchElementException();
    }
    T tmp = head.data;
    head = head.next;
    if(head == null) {
      last = null;
    }
    return tmp;
  }
  public T peek() {
    if(isEmpty()) {
      throw new NoSuchElementException();
    }
    return head.data;
  }
  public boolean isEmpty() {
    return head == null && last == null;
  }
  
}
