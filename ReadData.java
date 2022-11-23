https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
import java.util.Scanner;
import java.io.*;
/*
 * PROJECT I: ReadData.java
 *
 * A sample code which demonstrates how to read data from an ASCII file using
 * the Scanner
 * 
 * The code demonstrates the procedure you should use to read data from the
 * file Project1.data from a similar file you will use for testing. The code
 * also shows how the max and min coordinates are found in the process of
 * reading.
 *
 * You should NOT submit this as part of your project 1 submission, but use it as a guide to help you
 * implement the Project1 class.
 *
 * @author  A. Chester
 * @version 1.1
 */


public class ReadData {
  
  public static void main(String[] args) {
    
    double x,y,rad;
    int lineCount = 0;
    
    //Initialise the max and minimum to something sensible
    double maxX = Double.MIN_VALUE;
    double minX = Double.MAX_VALUE;
    double maxY = Double.MIN_VALUE;
    double minY = Double.MAX_VALUE;
    
    try {
      Scanner scanner = new Scanner(new BufferedReader(new FileReader("Project1.data")));
    
      while(scanner.hasNext()) {
      
        //Read the three valies on each line of the file
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        rad = scanner.nextDouble();
      
        //Increment the linecounter. 
        lineCount++;
      
        // Find max, min for x and y coords
        if (x > maxX) {
          maxX = x;
        }
        if (y > maxY) {
          maxY = y;
        }
        if (x < minX) {
            minX = x;
        }
        if (y < minY) {
          minY = y;
        }
      
      }
    } catch(Exception e) {
      System.err.println("An error has occured. See below for details");
      e.printStackTrace();
    }
    
    System.out.println("Information about the data:");
    System.out.println("  Number of lines in file: " + lineCount);

    System.out.format("  Max x-coord: %10.9f\n", maxX);
    System.out.format("  Min x-coord: %10.9f\n", minX);
    System.out.format("  Max y-coord: %10.9f\n", maxY);
    System.out.format("  Min y-coord: %10.9f\n", minY);
    
  }
  
}