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


    String inputString; //Creates variable called input string
    Scanner scan = new Scanner(System.in);
    //Defines inputString as what user inputs
    System.out.println("Enter a 5 character string:");
    inputString = scan.nextLine();
    //Makes substrings to defines characters within the 5 letter string
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
    final int BASE = 32;                        //Defines Base
    final double CONVERSION_FACTOR = 5.0 / 9.0; //Defines the Conversion Factor
    double CelsiusTemp;
    int fahrenheitTemp = inputTemp;             //Defines the temp in Fahrenheit as whatever number the user inputs
    CelsiusTemp = fahrenheitTemp * CONVERSION_FACTOR - BASE;

    System.out.println(CelsiusTemp); //Prints the temperature in Celsius in the terminal

    Random rand = new Random();
    int Randomint = rand.nextInt(16384); //Defines Randomint as a random integer bound to 16384 meaning it cant go over

    System.out.println("Random Number Generated. Continuing..."); //Displays Prompt
    System.out.print(CelsiusTemp+NewString+Randomint); //Displays final output combining variables

  } //End of main function
} //End of Assignment 1