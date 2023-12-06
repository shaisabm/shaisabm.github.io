import java.util.Scanner;

class dataTypes {
  public static void main(String[] args) {

    Scanner name = new Scanner(System.in);
    System.out.print("What is your name? "); // Asking for name
    String userName = name.nextLine(); // userName is the name the user inputs

    Scanner age = new Scanner(System.in); // Asking for age
    System.out.print("What is your age? ");
    int yourAge = age.nextInt(); // yourAge is the age the user inputs

    System.out.print("Your name is " + userName + " and you are " + yourAge + " years old."); // Printing out the name
                                                                                              // and age

  }
}