package Java_Tutorial;

public class Lesson14_JavaArray {

    public static void main(String []args) {

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

         */

    }
}
