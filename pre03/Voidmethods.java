import java.io.*;
import java.util.*;

public class Voidmethods {

  public static void voidmethods() {
    System.out.println("Bye World!");
    person("lara", 60);
  }

  public static void test(String name) {
    System.out.println("Hello " + name);
  }

  public static void person (String name, int age) {

    System.out.println("Hello " + name + " you are " + age);

    
  }



  
  
  public static void main(String[] args){
    voidmethods();
    voidmethods();
    test("my good neighbor");
    person("lara", 60);
  
  }






  
}