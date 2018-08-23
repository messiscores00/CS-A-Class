import java.util.Scanner;
public class Quadratic_Formula
{
    public static void main(String[] arg){
        /*
         * Promt user for quadratic formula
         * Begin parsing user expression for a,b,c coefficients
         *     a. locate index of 1st X
         *     b. extract substring from user expression from beginning to position of 1st X
         *     c. Convert Substring to number form and store to variable.
         *     d. locate index of 2nd X
         *     e. extract substring from 1st X index + 2 to 2nd X.
         *     f. Convert Substring to number form and store to variable.
         *     g. extract substring from 2nd X to end
         *     h. Convert Substring to number form and store to variable.
         * Put variables into quadratic equation
         * Print out.
         */
        System.out.println("Please enter your quadratic formula: ");
        Scanner in = new Scanner(System.in);//new = new object using the Scanner constructor that takes in an InputStream
        //System.in is a reference to that input stream
        String exp = in.nextLine();//nextline scans the input screen and returns the curent line as a string
        
        
    }
}