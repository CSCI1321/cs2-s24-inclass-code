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

  public static HashMap<String, Integer> getWordCounts(String filename) {
    HashMap<String, Integer> myMap = new HashMap<String, Integer>();
    try {
      File f = new File(filename);
      Scanner fin = new Scanner(f);
      while(fin.hasNextLine()) {
        String line = fin.nextLine();
        String[] parts = line.split("\\s");
        for(int i=0; i<parts.length; i++) {
          parts[i] = parts[i].replaceAll("[^A-Za-z]", "");
          String currWord = parts[i].toLowerCase();

          if(!currWord.equals("")) {
            if(myMap.containsKey(currWord)) {
              //myMap[currWord] = myMap[currWord] + 1
              myMap.put(currWord, myMap.get(currWord) + 1);
            } else {
              //myMap[currWord] = 1
              myMap.put(currWord, 1);
            }
          }

        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(myMap);
    return myMap;
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

    HashMap<String, Integer> tempCounts = getWordCounts("tempest.txt");

    String freqWord = "ZZZZZ";
    for(String word : tempCounts.keySet()) {
      Integer count = tempCounts.get(word);
      if(tempCounts.get(freqWord) == null || count > tempCounts.get(freqWord)) {
        freqWord = word;
      }
    }
    System.out.println(freqWord + " happens " + tempCounts.get(freqWord) + " times");

    for(Map.Entry<String,Integer> entry : tempCounts.entrySet()) {
      if(entry.getValue() > 100) {
        System.out.println(entry.getKey());
      }
    }
    



  }


}
