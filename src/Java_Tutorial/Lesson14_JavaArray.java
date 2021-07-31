package Java_Tutorial;

public class Lesson14_JavaArray {

    public static void main(String[] args) {

        /*
        __ Java Arrays __

        Arrays are used to store multiple values in a single variable,
        instead of declaring separate variables for each value.

        To declare an array, define the variable type with square brackets:

        ```
        String[] airplanes;
        ```

        We have now declared a variable that holds an array of strings.
        To insert values to it, we can use an array literal - place the values
        in a comma-separated list, inside curly braces:

        ```
        String[] airplanes = {"Cessna 172", "Skyhawk", "Airbus A350 XWB", Boeing 787"};
        ```

        To create an array of integers, you could write:

        ```
        int[] Numbers = {5, 10, 15, 20, 25};
        ```

        __ Access the Elements of an Array __

        You access an array element by referring to the index number.

        This statement accesses the value of the first element in cars. Example:

        ```
        String[] airplanes = {"Cessna 172", "Skyhawk", "Airbus A350 XWB", Boeing 787"};
        System.out.println(airplanes[2]);
        // Outputs Airbus A350 XWB
        ```

        NOTE: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        __ Change an Array Element __

        To change the value of a specific element, refer to the index number:

        ```
        airplanes[0] = "Opel";
        ```

        Now, when you invoke the position '0' he's return the word "Opel" !!

        __ Array Length __

        To find out how many elements an array has, use the length property:

        ```
        String[] airplanes = {"Cessna 172", "Skyhawk", "Airbus A350 XWB", Boeing 787"};
        System.out.println(airplanes.length);   // Outputs 4
        ```

        __ Loop Through an Array __

        You can loop through the array elements with the for loop, and use the length
        property to specify how many times the loop should run.

        The following example outputs all elements in the airplanes array:

        ```
        String[] airplanes = {"Cessna 172", "Skyhawk", "Airbus A350 XWB", Boeing 787"};
        for (int i = 0; i < airplanes.length; i++) {
          System.out.println(airplanes[i]);
        }
        ```

        __ Loop Through an Array with For-Each __

        There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:

        ```
        for (type variable : array_name) {
          <command block>
        }
        ```

        The following example outputs all elements in the airplanes array, using a "for-each" loop:

        Example
        String[] airplanes = {"Cessna 172", "Skyhawk", "Airbus A350 XWB", Boeing 787"};
        for (String i : airplanes) {
          System.out.println(i);
        }

        The example above can be read like this: for each String element (called i - as in index)
        in cars, print out the value of i.

        If you compare the for loop and for-each loop, you will see that the for-each method is
        easier to write, it does not require a counter (using the length property), and it is more readable.

        __ Multidimensional Arrays __

        A multidimensional array is an array containing one or more arrays.

        To create a two-dimensional array, add each array within its own set of curly braces:

        ```
        int[][] listNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        ```

        listNumbers is now an array with two arrays as its elements.

        To access the elements of the myNumbers array, specify two indexes: one for the array,
        and one for the element inside that array. This example accesses the third element (2) in the
        second array (1) of listNumbers:

        We can also use a for loop inside another for loop to get the elements of a two-dimensional
        array (we still have to point to the two indexes).

        An example of using the 'for' loop to run a multidimensional list.

         */

        int[][] listNumbers = {{15, 20, 35, 40}, {55, 60, 75}};
        for (int i = 0; i < listNumbers.length; ++i) {
            for (int j = 0; j < listNumbers[i].length; ++j) {
                System.out.println(listNumbers[i][j]);
            }
        }

    }

    // OK, the introductory part of Java is finished. Soon I will start the part of Classes and Objects in Java.

}

