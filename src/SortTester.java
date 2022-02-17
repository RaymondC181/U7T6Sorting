import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {0,0,0,0,0,0};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {0,0,0,0,0,0};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
