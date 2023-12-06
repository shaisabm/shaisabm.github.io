import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {

    Scanner age = new Scanner(System.in);
    System.out.print("Enter your age: "); 
    int yourAge = age.nextInt(); // Asking for your age

    if (yourAge < 18){ // if your age is less than 18
      System.out.println("You are a minor"); // dispaying that you are a minor
    }
    else{
      System.out.println("You are an adult "); // if your age is greater than 18
    } 
    
    if (yourAge %2 == 0){ // if the reminder of your age divide by 2 equals to 0
      System.out.println(yourAge+" is an even number"); // print your age is an even number 
    }
      
    else{ // if the reminder of your age divide by 2 does not equal to 0
      System.out.println(yourAge+" is an odd number"); // display your age is an odd number
    }
    
      
    

   
  }
  

  
}