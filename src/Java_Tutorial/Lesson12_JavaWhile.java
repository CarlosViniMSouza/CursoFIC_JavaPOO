package Java_Tutorial;

public class Lesson12_JavaWhile {

    public static void main(String []args) {

        /*
        __ Loops __

        Loops can execute a block of code as long as a specified condition is reached.

        Loops are handy because they save time, reduce errors, and they make code more readable.

        __ Java While Loop __

        The while loop through a block of code as long as a specified condition is true:

        ```
        while (condition) {
          // code block to be executed
        }
        ```

        See an example: The variable 'i' will print numbers from 1 to 10.
         */

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        /*
        NOTE: Do not forget to increase the variable used in the condition, otherwise the loop will never end!

        __ The Do/While Loop __

        The do/while loop is a variant of the while loop. This loop will execute the code block once,
        before checking if the condition is true, then it will repeat the loop as long as the condition is true.

        ```
        do {
          // code block to be executed
        }
        while (condition);
        ```

        let's repeat the previous example:

         */
        i = 1;
        System.out.println("\n");

        do {
            System.out.println(i);
            i++;
        } while(i <= 10);

        // DO NOT FORGET TO INCREASE THE VARIABLE USED IN THE CONDITION, OTHERWISE THE LOOP WILL NEVER END!

    }
}
