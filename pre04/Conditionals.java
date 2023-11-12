import java.util.Scanner;

public class Conditionals {

  public static void main(String[] args) {

    Scanner age = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int yourAge = age.nextInt();

    if (yourAge < 18){
      System.out.print("You are a minor");
    }
    else{
      System.out.print("You are an adult");
    } 
    

   
  }
  

  
}