
/**
 *  Pascal.java
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




class Pascal{



      // constructor to take value of amount of lines to print for the triangle
	  public Pascal(int n)
	  	{


           toString(n,1);


	  	}





       // method to compute and  store one line of the triangle
	   private static int[] pascal(int [] array , int num)
     {




        // base case will be line one of the triangle
         if(num == 1)
         {

          array[0] = 1;
          return array;

         }


         //assign the constants in pascals triangle
         array[0] = 1;
         array[array.length-1] = 1;


        //iterate through starting at 1 and going to size of array minus one as to not go out of bounds
        for(int i = 1; i<array.length-1; i++)
        {
            array[i] = array[i] + array[i+1];

        }


           // call method on itself until reaches base case
        return pascal( array, num-1);




     }









       // Prints the whole triangle with appropriate spacing
	   private static void toString( int num, int count)
  {

        // result will be the spacing before and after printing the array
       String result = new String();

       //create a new array instantiated with one line of pascals triangle
       int [] array = new int[count];
       array = pascal(array,count);



        //loops and stores appropriate spacing largest to smallest as it moves down the triangle
       for(int i = 0; i<num-count; i++)
            result += " ";


        // base case
       if(count == num)
       {
       	   //print before array for spacing
           System.out.print(result);

           //iterates through the array one last time and prints
           for(int i : array)
           {
              System.out.print( " " +  i  + " " );

           }

       }


        else
       {
        //print appropriate spacing
        System.out.print(result);

        // print one line of the array
        for(int i : array)
        System.out.print(" " +  i + " " );

        // starts new line of the triangle
        System.out.println();

        // call method on its self until base case
        toString( num, count+1);


       }


  }






}