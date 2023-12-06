public class Exercise3 {

  public class PowerCalculation {
      public static double power(double x, int n) {
          
        double result = 1.0;

          if (n < 0) {
              x = 1 / x;
              n = -n;
          }

          while (n > 0) {
              if (n % 2 == 1) {
                  result *= x;
              }
              x *= x;
              n /= 2;
          }

          return result;
      }
  }

  public static void main(String[] args){
    System.out.println("2 to the 3rd power: " +PowerCalculation.power(2.0, 3));
    

   


  }

  }


