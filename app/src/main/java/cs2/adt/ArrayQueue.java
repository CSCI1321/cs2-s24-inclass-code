package cs2.adt;

public class ArrayQueue<T> implements Queue<T> {
  private T[] arr;
  private int len, beg;

  public ArrayQueue() {
    arr = (T[])new Object[10];
    len = 0;
    beg = 0;
  }

  public void enqueue(T item) {
    if(len == arr.length) {
      T[] tmp = (T[])new Object[len * 2];
      for(int i=0; i<len; i++) {
        tmp[i] = arr[(beg + i) % len];
      }
      beg = 0;
      arr = tmp;
    }
    arr[(beg + len) % arr.length] = item;
    len++;
  }
  public T dequeue() {
    beg = (beg + 1) % arr.length;
    len--;
    return arr[beg-1];
  }
  public T peek() {
    return arr[beg];
  }
  public boolean isEmpty(){
    return len == 0;
  }
}
