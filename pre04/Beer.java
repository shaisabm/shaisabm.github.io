public class Beer{

  public static String bottles(int n){
    if(n == 0){
      return "99 bottles of beer on the wall, 99 bottles of beer, ya’ take one down, ya’ pass it around, 98 bottles of beer on the wall."; // returing the lyrics
    }
    else{
      return n + " bottles of beer on the wall, " + n + " bottles of beer.\nTake one down and pass it around, " + (n - 1) + " bottles of beer on the"; // returns n plus the lyrics of the song

    }
  }



  public static void main(String[] args){

    bottles(3); // calling the bottles method with the parameter 3
    System.out.println(bottles(0)); // dispaying the return value of the bottles method with the parameter 0
    System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");

    

    
  }








}