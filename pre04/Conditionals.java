import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {

    Scanner age = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int yourAge = age.nextInt(); // Asking for your age

    if (yourAge < 18){
      System.out.println("You are a minor"); 
    }
    else{
      System.out.println("You are an adult ");
    } 
    
    if (yourAge %2 == 0){
      System.out.println(yourAge+" is an even number");
    }
      
    else{
      System.out.println(yourAge+" is an odd number");
    }
    
      
    

   
  }
  

  
}