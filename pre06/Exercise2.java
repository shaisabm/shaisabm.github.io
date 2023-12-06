import java.util.Scanner;

public class Exercise2{

    public static double sqrt(int a) {
        double diff = 0.0001;
        double previousValue = 0;
        double x0 = 6.0;
        
        
      while (true) {
         double x = (x0+a/x0)/2;
         double abs = Math.abs(previousValue-x);
        if(abs <= diff) {
          return x;
      
        } else {
          previousValue = x;
          x0 = x;
           }
    
  } 
}

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = num.nextInt();

      
        System.out.println(sqrt(a));




    }





}



