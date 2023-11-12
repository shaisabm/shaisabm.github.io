public class Craps {
  
  public static int rolls() {
      int randomValue = (int) Math.round(Math.random()*4);
      int[] totalRolls = {2, 3, 12, 7, 11};
      int result = totalRolls[randomValue];
      return result;
     }

  public static void main(String[] args) {
     int result = rolls();
    
    if (result == 7 || result ==  11) { 
     System.out.println(result);
     System.out.println("You won!");
    }
  else {
       System.out.println(result);
       System.out.println("You Lost");
    }
  }
}


  


    





