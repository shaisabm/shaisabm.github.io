import java.util.Scanner;

public class Exercise3 {

  public static Boolean isTriangle (int a, int b, int c) {
    Boolean check = (a+b) > c && (a+c) > b && (b+c) > a; // if the sum of any two sides is greater than the third side, then the triangle is valid
    return check;  
  }
  
  
  public static void main(String[] args) {

    Scanner side1 = new Scanner(System.in);
    System.out.print("What is the lenght of side a: ");
    int a = side1.nextInt(); // side a

    Scanner side2 = new Scanner(System.in);
    System.out.print("What is the lenght of side b: ");
    int b = side2.nextInt(); // side b

    Scanner side3 = new Scanner(System.in);
    System.out.print("What is the lenght of side c: ");
    int c = side3.nextInt(); // side c

    isTriangle(a, b, c); // calling isTrianle method with the parameter a, b, c
    System.out.println("its a triangle: " +isTriangle(a, b, c)); // printing the result of the method

    

    







    
  

   }
}