import java.util.Arrays;

public class Max {

 public static int indexOfMax(int[] array) {

   int maxIndex = 0;
   int i;

   for (i = 1 ; i < array.length; i++) {
    if (array[i] > array[maxIndex]) {
      maxIndex = i;
    }
   } return array[maxIndex];
  
 }
   
  
  
  
  
  
  
  
  
  public static void main(String[] args){

    int [] array = {1, 2, 10, 500, 20,99};
    System.out.println(indexOfMax(array));

    }
  }





