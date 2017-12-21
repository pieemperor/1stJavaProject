/*******************************************************************************
 * -----------------------------------------------------------------------------
 * File name: Project1.java
 * Project name: CSCI 1250 Project 1
 * -----------------------------------------------------------------------------
 * Author Name: Dakota Cowell
 * Author E-mail: cowelld@goldmail.etsu.edu
 * Course-Section: CSCI-1250-201
 * Creation Date: 9/15/2015
 * Date of Last Modification: 9/15/2015
 * -----------------------------------------------------------------------------
 */
import java.util.Scanner; //to allow input from the keyboard
/*******************************************************************************
 * Class Name: Project1 <br>
 * Class Purpose: Project 1 <br>
 *
 * <hr>
 * Date created: 9/15/2015 <br>
 * Date last modified: 9/15/2015
 * @author Dakota Cowell
 */
public class Project1
{
  /*****************************************************************************
   * Method Name: main <br>
   * Method Purpose: to develop a simple program in Java that will interact with
   * the user through some dialog. It will ask the user for his/her name and the
   * number of steps taken in a 10 second interval. The program will then
   * calculate the number of steps per minute, hour, day (18 hours assuming 6
   * hours for sleep) and a year. The program will then calculate the number of
   * steps, feet and miles traveled during a 20 year time span. This information
   * will then be neatly displayed to the user.
   * <br>
   *
   * <hr>
   * Date created: 1/24/2011 <br>
   * Date last modified: 2/3/2011 <br>
   * <hr>
   * Notes on specifications, special algorithms, and assumptions:
   *
   * The number of steps taken over a 10 second interval can be entered as a
   * decimal. The output should look exactly like that shown in the examples
   * (pay close attention to line breaks and spacing). This program should be
   * designed such that the 10 second time interval and the 20 year span can
   * easily be changed by the programmer in one place rather than throughout
   * the program
   *
   * <hr>
   * @param String[] args - Command Line Arguments
   */
  public static void main(String[] args)
    {
      Scanner kb = new Scanner(System.in); //create a Scanner


//declare constants
      final double MIN_IN_HOUR = 60;
      final int HOURS_PER_DAY = 18;
      final double STEP_LENGTH = 2.5;
      final int YEAR_LENGTH = 365;
      final int MILE_IN_FEET = 5280;
      final int YEARS = 20;
      final int TIME_INTERVAL = 10;
      final int SECONDS_IN_MINUTE = 60;
      final int SECONDS_TO_MINUTES = SECONDS_IN_MINUTE / TIME_INTERVAL;


  //declare variables
      String name;
      double userSteps;
      double stepsPM;
      double stepsPH;
      double stepsPD;
      double stepsPY;
      double stepsOverTime;
      double feetTraveled;
      double milesTraveled;

//insert stars for readability
      System.out.println("*****************************************************"
                      +  "*************************\n");

//introduce myself and prompt user for name
      System.out.print("Hello, my name is Dakota!  What is your name? ");
      name = kb.nextLine();

//greet user by name and ask for number of steps taken
      System.out.print("Hello, " + name + ". How many steps do you take in a "
                     + TIME_INTERVAL + " second time interval? ");
      userSteps = kb.nextDouble();

//insert stars for readability
      System.out.println("\n***************************************************"
                          +  "***************************");


      System.out.println("\n If you take " + userSteps + " steps in a " +
                      +  TIME_INTERVAL + " second time interval,\n you could "
                      +  "potentially achieve...\n");

//calculate steps per minute by multiplying user steps by (60 / time interval)
      stepsPM = userSteps * SECONDS_TO_MINUTES;
      System.out.println("       Number of steps per minute: " + stepsPM);

//calculate steps per hour by multiplying minutes in hour by steps per minute
      stepsPH = stepsPM * MIN_IN_HOUR;
      System.out.println("         Number of steps per hour: " + stepsPH);

//calculate steps per day by multiplying steps per hour by hours in a day
      stepsPD = stepsPH * HOURS_PER_DAY;
      System.out.println("          Number of steps per day: " + stepsPD);

//calculate steps per year by multiplying steps per day by year length
      stepsPY = stepsPD * YEAR_LENGTH;
      System.out.println("         Number of steps per year: " + stepsPY);


      System.out.println("\n Over a period of " + YEARS + " years,\n you could "
                       + "potentially have traveled... \n");

//calculate steps over time by multiplying steps per year by number of years
      stepsOverTime = stepsPY * YEARS;
      System.out.println("                  Number of steps: " + stepsOverTime);

//calculate feet traveled by multiplying steps over time by step length
      feetTraveled = stepsOverTime * STEP_LENGTH;
      System.out.println("                   Number of feet: " + feetTraveled);

//calculate miles traveled by dividing feet traveled by feet in a mile
      milesTraveled = feetTraveled / MILE_IN_FEET ;
      System.out.println("                  Number of miles: " + milesTraveled);


//insert stars for readability
      System.out.println("*****************************************************"
                          +  "*************************");
  }//end main
}//end Project1
