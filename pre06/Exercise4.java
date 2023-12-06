import java.util.Scanner;

public class Exercise4 {
    
  public static int factorial(int n) {
        int result = 1;

        if (n < 0) {
            return -1;
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    System.out.println("factorial: "+factorial(n));


  
}
}
