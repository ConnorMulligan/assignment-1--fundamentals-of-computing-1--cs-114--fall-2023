// Import libraries here
// Connor Mulligan

import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    //Prints out my first inital of first and last name
    System.out.println("CCCCCCCCC     MMM         MMM");
    System.out.println("CC            MMM MM   MM MMM");
    System.out.println("CC            MMM  MM MM  MMM");
    System.out.println("CC            MMM    M    MMM");
    System.out.println("CC            MMM         MMM");
    System.out.println("CC            MMM         MMM");
    System.out.println("CCCCCCCCC     MMM         MMM");


    String inputString;
    Scanner scan = new Scanner(System.in);
    //Defines inputString as what user inputs
    System.out.println("Enter a 5 character string:");
    inputString = scan.nextLine();

    String Character1 = inputString.substring(1,2);
    String Character2 = inputString.substring(2, 3);
    String Character3 = inputString.substring(3, 4);

    //Creates a new string using the input strings characters and displays it
    String NewString = Character3 + Character2 + Character1;
    System.out.println(NewString);

    //Defines inputTemp as whatever integer the user enters
    int inputTemp;
    System.out.println("Enter a temperature in Fahrenheit:");
    inputTemp = scan.nextInt();

    scan.close(); //Closes scanner

    //Converts Fahrenheit to Celsius
    final int BASE = 32;
    final double CONVERSION_FACTOR = 5.0 / 9.0;

    double CelsiusTemp;
    int fahrenheitTemp = inputTemp;  // value to convert

    CelsiusTemp = fahrenheitTemp * CONVERSION_FACTOR - BASE;
    System.out.println(CelsiusTemp); //Prints the temperature in Celsius in the terminal

    Random rand = new Random();
    int Randomint = rand.nextInt(16384);

    System.out.print(CelsiusTemp+NewString+Randomint);

  }
}