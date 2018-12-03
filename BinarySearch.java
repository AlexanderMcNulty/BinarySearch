import java.io.*;
import java.util.*;

/*
 * Binary Search:
 * Entry args[0] should be the desired integer value 
 * Entries following are a sorted array of integers
 */

class BinarySearch {
  public static void main(String[] args) {
    
    if(args.length == 0){
      args = new String[]{"3","1","3","4","6","11","30","42"};
    }
        
    int upperbound = args.length;
    int lowerbound = 1;
    int middle = 1;
    int target = Integer.parseInt(args[0]);
    
    while(true) {
      middle = (upperbound+lowerbound)/2;
      if (upperbound < lowerbound) {
        middle = -1;
        break;
      } else if (Integer.parseInt(args[middle]) == target) {
        break;
      } else if (Integer.parseInt(args[middle]) < target){
        lowerbound = middle + 1;
      } else {
        upperbound = middle - 1;
      }
    }
    
    if(middle != -1){
      System.out.println("Index: " + middle);
      System.out.println("Value: " + args[middle]);
    } else {
      System.out.println("Value Not Found: " + target);
    }
  }
}
