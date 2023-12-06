import java.util.Scanner;

public class Exercise2 {

  
   public static boolean isDivisible(int x, int y) {
     Boolean divis = y > 0 || x < 0; // check if y greater than 0 and x less than 0
     return divis; // return divis true or false

   }
  
  
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int x = n.nextInt(); // asking for the first number

    Scanner m = new Scanner(System.in); 
    System.out.print("Enter the second number: ");
    int y = m.nextInt(); // asking for the second number
    
    isDivisible(x,y); // calling the method isDivisible with the parameter x and y

    System.out.println("Fist number divided by second number: " + isDivisible(x,y)); // display the result
  }

}