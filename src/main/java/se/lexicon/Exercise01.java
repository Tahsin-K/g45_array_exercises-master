package se.lexicon;

import java.util.Arrays;

public class Exercise01 {
public static void main(String [] args) {
  ex1();
}
  /**
   * 1. Write a program which will store elements in an array of type ‘int’ and
   * print it out.
   * Expected output: 11 23 39 etc.
   */
  public static void ex1() {
      int[] numbers = {61, 76, 90, 19, 34,166};
      for(int i=0; i<numbers.length; i++){
          System.out.println(numbers[i]);
      }
  }


}