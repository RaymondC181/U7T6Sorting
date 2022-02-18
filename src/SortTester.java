import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
//    /* --- SELECTION SORT --- */
//    int[] arr1 = {0,0,0,0,0,0};
//    Sort.selectionSort(arr1);
//    System.out.println(Arrays.toString(arr1));
//
//    /* --- INSERTION SORT --- */
//    int[] arr2 = {0,0,0,0,0,0};
//    Sort.insertionSort(arr2);
//    System.out.println(Arrays.toString(arr2));

      int[] arr2 = {12, 6, 79, 34, 7, 2};
      Sort.selectionSortDescending(arr2);
      System.out.println(Arrays.toString(arr2));

      int[] arr3 = {21, 45, 31, -56, 24, 90};
      Sort.insertionSortDescending(arr3);
      System.out.println(Arrays.toString(arr3));

  }
}
