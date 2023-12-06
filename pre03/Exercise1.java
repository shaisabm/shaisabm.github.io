public class Exercise1 {

  public static void zoop() {
      baffle(); // calling the method baffle
      System.out.print("You wugga "); // printing the string "You wugga "
      baffle(); // calling the method baffle
  }



  public static void baffle() {
      System.out.print("wug"); // prints wug
      ping(); // calling ping method 
  }

  public static void ping() {
      System.out.println(".");
  }

  public static void main(String[] args) {
      System.out.print("yes, I ");
      zoop(); // calling the zoop method
      System.out.print("you "); // display "you"
      baffle(); // calling the baffle method
  }
  
}
