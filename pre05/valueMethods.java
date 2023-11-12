public class valueMethods {
// https://pythontutor.com/visualize.html#mode=edit
  
  public static int mult(int ab){ // mult(8)
    int m = ab*23; // m = 8*23
    return m; 

    }

  public static int addnums(int a, int b){ // addnums(2, 6)
  int ab = a+b; // Add 2+6
  int abc = mult(ab); // calling method mult
  return abc;

  }


  public static void main(String[] args) {

    int num1 = 2; // Code begins here
    int num2 = 6;

    addnums(num1, num2); // Calling method addnums
    System.out.println(addnums(num1, num2)); // Printing method addnums



  }
}