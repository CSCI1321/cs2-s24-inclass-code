package cs2.generic;

import java.util.ArrayList;

import cs2.util.Vec2;

public class GenericStuff {
  
  public static ArrayList<Integer> convertArrayInteger(int[] arr) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    for(int i=0; i<arr.length; i++) {
      al.add(arr[i]);
    }
    return al;
  }

  public static <T> ArrayList<T> convertArray(T[] arr) {
    ArrayList<T> al = new ArrayList<T>();
    for(int i=0; i<arr.length; i++) {
      al.add(arr[i]);
    }
    return al;
  }

  public static <T extends Comparable<T>> void bubbleSortArray(T[] arr) {
    for(int j=0; j<arr.length; j++) {
      for(int i=0; i<arr.length-1; i++) {
        if(arr[i].compareTo(arr[i+1]) > 0) {
          T tmp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = tmp;
        }
      }
    }
  }

  public static void main(String[] args) {
    Integer[] myArr = {8,7,1,2,3,6,4,5};
    System.out.println(myArr);
    ArrayList<Integer> myAL = convertArray(myArr);
    System.out.println(myAL);

    bubbleSortArray(myArr);
    myAL = convertArray(myArr);
    System.out.println(myAL);

    Vec2[] vecs = {new Vec2(1,3), new Vec2(0,4), new Vec2(4,1)};
    bubbleSortArray(vecs);
    System.out.println(convertArray(vecs));


  }

}
