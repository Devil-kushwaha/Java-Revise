https://nados.io/question/insertion-sort?zen=true

import java.io.*;
import java.util.*;

public class Main {

  public static void insertionSort(int[] arr) {
    //write your code here
    for(int x=0;x<arr.length-1;x++)
    {
      for(int y=x+1;y>=1;y--)
      {
        if(isGreater(arr,y,y-1)==true || arr[y]==arr[y-1])
        {
          break;
        }
        else
        {
          swap(arr,y-1,y);
        }
      }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  // return true if jth element is greater than ith element
  public static boolean isGreater(int[] arr, int j, int i) {
    System.out.println("Comparing " + arr[j] + " and " + arr[i]);
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    insertionSort(arr);
    print(arr);
  }

}