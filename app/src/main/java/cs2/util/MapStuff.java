package cs2.util;

import java.util.*;

public class MapStuff {

  public static void main(String[] args) {
    
    HashMap<Character,String> map = new HashMap<Character,String>();
    map.put('A',"apple");
    map.put('C',"Carrot");
    map.put('B',"banana");
    System.out.println(map);

    System.out.println(map.containsKey('Z'));
    System.out.println(map.containsKey('C'));
    System.out.println(map.containsValue("Carrot"));
    System.out.println(map.containsValue("carrot"));
    System.out.println(map.size());
    System.out.println(map.get('A'));
    System.out.println(map.get('Q'));
    System.out.println(map.remove('B'));
    System.out.println(map);
    System.out.println(map.keySet());

    for(Character c : map.keySet()) {
      System.out.println(c + " is " + map.get(c));
    }

    for(String s : map.values()) {
      System.out.println(s);
    }




  }
}
