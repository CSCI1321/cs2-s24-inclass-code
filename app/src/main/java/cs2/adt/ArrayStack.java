package cs2.adt;

public class ArrayStack<T> implements Stack<T> {
  private T[] arr;
  private int len;

  public ArrayStack() {
    arr = (T[])new Object[10];
    len = 0;
  }

  public void push(T item) {
    arr[len] = item;
    len += 1;
  }
  public T pop() {
    len -= 1;
    return arr[len];
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
  public T peek() {
    return arr[arr.length - 1];
  }
  public boolean isEmpty() {
    return arr.length == 0;
  }
}
