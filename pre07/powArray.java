import java.util.Arrays;
import java.lang.Math;
 public class powArray {

  public static void main(String[] args){

    int [][] array = new int[4][4];
    int [][] oldArray = new int[4][4];
    int[] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

    int oldlist = 0;
    int li  = 0;
    int x = 0;
    int y = 0;

    while (li<16) {
      int point = (list[li]*list[li]);
      int pointSec = (int) Math.sqrt(point);
      
      array[y][x] = point;
      oldArray[y][x] = pointSec;

      y = y + 1;
      if (y>3){
        y = 0;
        x =x +1;
      }
      li = li +1;

    }
    
    int w;
    System.out.println("Before squareroot");
    for (w = 0 ; w < array.length ; w++){
      System.out.println(Arrays.toString(oldArray[w]));
    }

    int i;
     System.out.println("After squareroot");

    for (i = 0 ; i < array.length ; i++){
      System.out.println(Arrays.toString(array[i]));
   
    }
    
    
    
 }
}

  
  






