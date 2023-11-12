import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner loanPrinciple = new Scanner(System.in); //Asking for the principle $$
        System.out.print("Loan Principle: ");
        Long principle = loanPrinciple.nextLong();

        Scanner numberYear = new Scanner(System.in); //Asking number of years
        System.out.print("Number of years: ");
        byte years = numberYear.nextByte();
        int months = years * 12; // years to months

        Scanner interestRate = new Scanner(System.in);  ////Asking for annual interest rate
        System.out.print("Annual Interest Rate: ");
        double rates = interestRate.nextDouble();
        double monthlyInterest = (rates/100)/12; // annual rates to monthly rates

        double part1 = principle*(monthlyInterest*(Math.pow ((1+monthlyInterest), months))) ; // Numerator of the Mortgage formula
        double part2 = Math.pow((1+monthlyInterest), months) -1; // Denominator of the Mortgage formula
        double monthlyMortgage = part1/part2; //Numerator/Denominator

        String monthlyMortgageInDollar = NumberFormat.getCurrencyInstance().format(monthlyMortgage); //Float to currency format
        System.out.println("Your monthly mortgage is "+monthlyMortgageInDollar); //Display the monthly




    }
}