import java.util.Arrays;

public class Array {

  public static void main(String[] args){
    
    int[] list = new int[10]; // A list that has 11 empty slot
    int x = 0;

    for(x = 0; x < 10; x++ ){    // Loop until x is lees than 10
      int randomNum = (int) Math.round((Math.random()*100)); // Generate a random number between 0 and 100
      list[x] = randomNum; // Assign the random number to the list
    System.out.println(Arrays.toString(list)); // Print the list
    
    }
  }
}
    




