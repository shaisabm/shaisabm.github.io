public class Exercise123{

  public static void countdown(int n) {
      if (n == 0) { // if the parameter is 0
          System.out.println("Blastoff!"); // display blastoff
      } else { // otherwise
          System.out.println(n); // display the parameter
          countdown(n - 1); // recursively call the method with the parameter minus 1
      }
  }


  public static void main(String[] args){
    countdown(4); // calling the method countdown with the parameter 4
  }

    
  




  
}