package cs2.util;

import java.util.*;
import java.io.File;

public class TextAnalysis {
  
  public static HashSet<String> getWords(String filename) {
    HashSet<String> words = new HashSet<String>();
    try {
      File f = new File(filename);
      Scanner fin = new Scanner(f);
      while(fin.hasNextLine()) {
        String line = fin.nextLine();
        String[] parts = line.split("\\s");
        for(int i=0; i<parts.length; i++) {
          parts[i] = parts[i].replaceAll("[^A-Za-z]", "");
          words.add(parts[i].toLowerCase());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(words);
    System.out.println(words.size());
    return words;
  }
  public static void main(String[] args) {
    HashSet<String> temp = getWords("tempest.txt");
    HashSet<String> mid = getWords("midsummer.txt");

    mid.retainAll(temp);
    System.out.println(mid.size());
    System.out.println(mid);
    
    Iterator<String> myIt = mid.iterator();
    while(myIt.hasNext()) {
      System.out.println(myIt.next());
    }

    for(String myWord : mid) {
      System.out.println(myWord);
    }
  }


}
