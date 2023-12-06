public class Time {
  public static void main(String[] args) {

    int mHour = 0; // mid night
    int mMinute = 0;
    int mSecond = 0;

    int rHour = 24; // End of the day
    int rMinute = 0;
    int rSecond = 0;

    int cHour = 15; // Assuming Current time 
    int cMinute = 59;
    int cSecond = 3;

    int sinceMidh = 3600*(Math.abs(mHour - cHour)); // Midnight to current time
    int sinceMidm = 60 * Math.abs(mMinute - cMinute); // Midnight to current time
    int sinceMids = Math.abs(mSecond - cSecond); // Midnight to current time
    int sinceMid = sinceMidh + sinceMidm + sinceMids; // Midnight to current time
    
    System.out.println("Seconds Since midnight: " + sinceMid+"s"); // Prints the seconds since midnight

    int secondRemining = rHour - cHour; // Seconds remaining in the day
    int minuteRemining = rMinute - cMinute; // Minutes remaining in the day
    int seconds = secondRemining * 3600; // Seconds remaining in the day
    int seconds2 = minuteRemining * 60; // Minutes remaining in the day
    int totalsec = seconds + seconds2 + rSecond; // Seconds remaining in the day

    
    System.out.println("Seconds remaining in the day: " + totalsec + " Seconds"); // Prints the seconds remaining in the day

    float hourConvert = cHour + cMinute*(1/60)+ cSecond*(1/3600); // Converts the current time to hours
      
    float percentage = ((float) hourConvert / (float) 24)*100; // Percentage of the day passed
    System.out.println("Percentage of the day that has passed: " + percentage + "%"); // Prints the percentage of the day passed


    



    
   
    


    



  }


}