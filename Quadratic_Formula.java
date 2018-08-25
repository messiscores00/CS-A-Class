import java.util.Scanner;
import java.lang.Double;
import java.lang.Math;
public class Quadratic_Formula
{
    public static double a;
    public static double b;
    public static double c;
    public static void main(String[] arg){
        /*
         * 1. Promt user for quadratic formula and take in the user's input
         * 2. Begin parsing user expression for a,b,c coefficients
         *     a. locate index of 1st X
         *     b. extract substring from user expression from beginning to position of 1st X 
         *     c. Convert Substring to number form and store to variable.
         *     c. reset String to everything after 1st X
         *     d. locate index of 2nd X
         *     e. extract substring from user expression from beginning to position of 2nd X
         *     f. Convert Substring to number form and store to variable.
         *     
         *     g. reset String to everything after 2nd X
         *     h. extract substring from user expression from beginning to end and Convert Substring to number form and store to variable.
         * 3. Put variables into quadratic equation
         * 4. Print out.
         */
        
        //1
        System.out.println("Please enter your quadratic formula: ");
        //println method is being invoked on the object referenced by System.out
        //class- collection of variables and methods that is respoanisble for some funtion
        Scanner in = new Scanner(System.in);
        //new = new object using the Scanner constructor that takes in an InputStream
        //System.in is a reference to that input strea
        String exp = in.nextLine();
        //nextline scans the input screen and returns the curent line as a string
        
        int firstXPos = exp.indexOf("x");
         
        String aStr = exp.substring(0 , firstXPos);
        
        double aCoeff = Double.parseDouble(aStr);
        
        exp = exp.substring(firstXPos + 3);
        
        int secondXPos = exp.indexOf("x");
        
        String bStr = exp.substring(0 , secondXPos);
        
        double bCoeff = Double.parseDouble(bStr);
        
        double cCoeff;
        
        if(exp.charAt(exp.length() - 1) == 'x'){
            cCoeff = 0;
        }else{
            exp = exp.substring(secondXPos + 1);
        
            cCoeff = Double.parseDouble(exp);
        }
        
        //3
        if(bCoeff*bCoeff - 4 * aCoeff * cCoeff < 0){
            System.out.println("You answer is an imaginary number");
        }else{
            double X1 = ((- bCoeff) + Math.sqrt((bCoeff*bCoeff) - (4 * aCoeff * cCoeff)))/ (2 * aCoeff);
            double X2 = ((- bCoeff) - Math.sqrt((bCoeff*bCoeff) - (4 * aCoeff * cCoeff)))/ (2 * aCoeff);
         //4
            System.out.println("X1: " + X1);
            System.out.println("X2: " + X2);
        }
    }
   }