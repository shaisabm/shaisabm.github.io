import java.util.Arrays;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 public class Seive {
  
   public static void sievePrimes(int n) {
     boolean[] Array = new boolean[n+1];

    for (int i=2; i <= n; i ++) {
      if (Array[i] == false) {
        for (int j = i*i; j <= n; j += i) {
          Array[j] = true;
        }
      }
    }
    for (int i=2; i <= n; i ++) {
      if (Array[i] == false) {
        System.out.println("Prime: "+i);
      }
    }
     
   } 
   


     
   
   
   
   
   
   
   
   
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int n = sc.nextInt();


       sievePrimes(n);


    

    
    }

    



 }










