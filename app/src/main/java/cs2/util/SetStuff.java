package cs2.util;

import java.util.HashSet;
import java.util.Iterator;

public class SetStuff {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
    String h = "Hello";
    String g = "He";
    g += "llo";
    System.out.println(h == g);
    set.add("Hello");
    set.add("Goodbye");
    set.add("there");
    set.add("Hello");
    set.add(h);
    set.add(g);
    System.out.println(set);
    System.out.println(set.contains("there"));
    System.out.println(set.contains("over"));
    System.out.println(set.size());
    System.out.println(set.remove("there"));
    System.out.println(set.remove("over"));
    System.out.println(set);
    System.out.println(set.size());


    System.out.println("------");
    set.add("TheEND");
    System.out.println(set);
    Iterator<String> it = set.iterator();
    while(it.hasNext()) {
      String theNextThing = it.next();
      System.out.println(theNextThing);
      System.out.println(theNextThing);
    }

  }
}
