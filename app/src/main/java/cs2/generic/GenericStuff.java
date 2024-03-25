package cs2.generic;

import java.util.ArrayList;

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

  public static void bubbleSortArray(int[] arr) {
    
  }



  public static void main(String[] args) {
    Double[] myArr = {1.0,2.0,3.0,4.0,5.0};
    System.out.println(myArr);
    ArrayList<Double> myAL = convertArray(myArr);
    System.out.println(myAL);
  }

}
