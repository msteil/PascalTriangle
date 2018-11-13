/**
 *  PascalTriangle.java
 *
 *  T00049114 Michael Steil
 *  Assignment 5 question 3
 *
 *  This app will print Pascals Triangle using recursion, the constructor takes the amount
 *  of lines to to print and displays result.
 *
 *
 *
 *
 */




public class PascalTriangle {

    public static void main(String[] args)
    	{


            System.out.println(" Pascals Triangle for number 7: ");
            Pascal pascalTriangle = new Pascal(7);

            System.out.println("\n\n\n\n\n Pascal Triangle for number 1:");
            pascalTriangle = new Pascal(1);

            System.out.println("\n\n\n\n\n Pascal Triangle for number 10:");
            pascalTriangle = new Pascal(10);



       }
}
