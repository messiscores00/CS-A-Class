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
         *     b. extract substring from user expression from beginning to position of 1st X and Convert Substring to number form and store to variable.
         *     c. reset String to everything after 1st X
         *     d. locate index of 2nd X
         *     e. extract substring from user expression from beginning to position of 2nd X and Convert Substring to number form and store to variable.
         *     g. reset String to everything after 2nd X
         *     h. extract substring from user expression from beginning to end and Convert Substring to number form and store to variable.
         * 3. Put variables into quadratic equation
         * 4. Print out.
         */
        
        //1
        System.out.println("Please enter your quadratic formula: ");
        Scanner in = new Scanner(System.in);
        //new = new object using the Scanner constructor that takes in an InputStream
        //System.in is a reference to that input stream

        String exp = in.nextLine();
        //nextline scans the input screen and returns the curent line as a string
        //2
        parsingforABC(exp);
        System.out.println("yes: " + exp);
        //3
        if(b*b - 4 * a * c < 0){
            System.out.println("You answer is an imaginary number");
        }else{
            double X1 = (- b + Math.sqrt(b*b - 4 * a * c))/ 2 * a;
            double X2 = (- b - Math.sqrt(b*b - 4 * a * c))/ 2 * a;
         //4
            System.out.println("X1: " + X1);
            System.out.println("X2: " + X2);
        }
        }
    //2
    public static void parsingforABC(String qf){
        String quadform = qf;
        int firstX = quadform.indexOf("x");
        a = Double.parseDouble(quadform.substring(0, firstX));
        quadform = quadform.substring(firstX + 2, quadform.length()+1);
        int secondX = quadform.indexOf("x");
        b = Double.parseDouble(quadform.substring(0, secondX));
        quadform = quadform.substring(secondX , quadform.length()+1);
        c = Double.parseDouble(quadform.substring(0));
    }
}