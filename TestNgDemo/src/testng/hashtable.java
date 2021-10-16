package testng;


import java.io.*;
import java.util.*;
import java.util.Map;

public class hashtable {
  public static void main(String args[])
  {
      // No need to mention the
      // Generic type twice
      Hashtable<Integer, String> ht1 = new Hashtable<>();

      // Initialization of a Hashtable
      // using Generics
      Hashtable<Integer, String> ht2
          = new Hashtable<Integer, String>();

      // Inserting the Elements
      // using put() method
      ht1.put(1, "one");
      ht1.put(2, "two");
      ht1.put(3, "three");

      ht2.put(4, "four");
      ht2.put(5, "five");
      ht2.put(6, "six");

      // Print mappings to the console
      
       for (Map.Entry<Integer, String> e : ht2.entrySet())
          System.out.println(e.getKey() + " "
                             + e.getValue());
       for (Map.Entry<Integer, String> e : ht1.entrySet())
           System.out.println(e.getKey() + " "
                              + e.getValue());
  }
}