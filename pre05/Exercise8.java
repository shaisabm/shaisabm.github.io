import java.util.Scanner;

public class Exercise8 {

  public static int ack(int m, int n){

    if (m == 0){
      return n + 1;
    }
    else if (m>0 && n == 0){
      return ack(m-1, 1); 
    }
    else {
      return ack(m-1, ack(m, n-1));
    }
    }


  
  public static void main(String[] args) {

    int numM, numN; // declare variables
    Scanner m = new Scanner(System.in);
    do{                                   // repeat until valid input
      System.out.println("m must be positive. ");
      System.out.print("Enter the value of m (not bigger than 3 to avoid overflowError): ");
      numM = m.nextInt();         // get input
    
    } while (numM < 0);    // repeat until valid input

  

    Scanner n = new Scanner(System.in);
    do{                                    // repeat until valid input
      System.out.println("n must be positive. ");
      System.out.print("Enter the value of n (not bigger than 3 to avoid overflowError): ");
      numN = n.nextInt();     // get input
      
    } while (numN < 0);           // repeat until valid input

    ack(numM, numN);       // call the method ack with parametes numM and numN
    System.out.println("Answer: "+ack(numM, numN)); // print the answer
     
   }
    


   
}