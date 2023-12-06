public class date {
  public static void main(String[] args) {

    int hour = 11;    // hour
    int minute = 59;
    System.out.print("The current time is "); // prints "The current time is "
    System.out.print(hour); // prints hour
    System.out.print(":"); 
    System.out.print(minute); // prints minute
    System.out.println("."); // prints "."
    
    String day = "Thursady"; // day of the week
    String date = "15"; // day of the month
    String month = "july"; // month
    int date = 16; // day of the month
    int year = 2015; // year
    System.out.println("American Format: "+ day+","+month+","+ date +","+year); // prints "American Format: Thursday, july, 16, 2015"
    System.out.println("European Format: "+ day+","+date+","+ month+","+year); // prints "European Format: Thursday, 16, july, 2015"
    
    
  }

  
}