import java.io.*;
import java.util.*;

public class Voidmethods {

  public static void voidmethods() {   
    System.out.println("Bye World!");
    person("lara", 60);  // Calling the function person
  }

  public static void test(String name) {
    System.out.println("Hello " + name); // Printing the name
  }

  public static void person (String name, int age) { // Function include name and age
  System.out.println("Hello " + name + " you are " + age);

    
  }

  
  public static void main(String[] args){ // Calling all the above functions
  voidmethods(); // calling the voidmethds function
  voidmethods(); // calling the voidmethds function
  test("my good neighbor"); // calling the test function
  person("lara", 60); // calling the person function
  
  }






  
}