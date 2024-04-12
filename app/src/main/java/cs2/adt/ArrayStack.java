package cs2.adt;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
  private T[] arr;
  private int len;

  public ArrayStack() {
    arr = (T[])new Object[10];
    len = 0;
  }

  public void push(T item) {
    if(len == arr.length) {
      T[] tmp = (T[])new Object[arr.length * 2];
      for(int i=0; i<arr.length; i++) {
        tmp[i] = arr[i];
      }
      arr = tmp;
    }
    arr[len] = item;
    len += 1;
  }
  public T pop() {
    if(isEmpty()) {
      throw new EmptyStackException();
    }
    len -= 1;
    return arr[len];
  }
  public T peek() {
    if(isEmpty()) {
      throw new EmptyStackException();
    }
    return arr[len - 1];
  }
  public boolean isEmpty() {
    return len == 0;
  }

  /* Original push & pop
  public void push(T item) {
    T[] tmp = (T[])new Object[arr.length + 1];
    for(int i=0; i<arr.length; i++) {
      tmp[i] = arr[i];
    }
    tmp[arr.length] = item;
    arr = tmp;
  }
  public T pop() {
    T[] tmp = (T[])new Object[arr.length - 1];
    for(int i=0; i<tmp.length; i++) {
      tmp[i] = arr[i];
    }
    T toReturn = arr[arr.length - 1];
    arr = tmp;
    return toReturn;
  } */

}
