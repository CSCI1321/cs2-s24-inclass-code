package cs2.fileio;

import java.io.File;
import java.util.Scanner;

public class FileReader {
  public static void main(String[] args) {
    try {
      File inFile = new File("tempest.txt");
      Scanner scan = new Scanner(inFile);
      while(scan.hasNextLine()) {
        System.out.println(scan.nextLine());
      }
    } catch(Exception ex) {
      System.out.println("Something went wrong");
    }
  }
}
