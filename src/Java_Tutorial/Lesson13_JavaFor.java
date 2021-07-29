package Java_Tutorial;

public class Lesson13_JavaFor {

    public static void main(String []args) {

        /*

        __ Java For Loop __

        When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

        ```
        for (statement 1; statement 2; statement 3) {
          // code block to be executed
        }
        ```

        --> Statement 1 is executed (one time) before the execution of the code block.

        --> Statement 2 defines the condition for executing the code block.

        --> Statement 3 is executed (every time) after the code block has been executed.

        An example: print 10 consecutive numbers:

         */

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println(" ");

        /*
        __ Example explained __

        --> Statement 1 sets a variable before the loop starts (int i = 0).

        --> Statement 2 defines the condition for the loop to run ('i' must be less or equal to 10).
        If the condition is true, the loop will start over again, if it is false, the loop will end.

        --> Statement 3 increases a value (i++) each time the code block in the loop has been executed.

        __ For-Each Loop __

        There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

        ```
        for (type variableName : arrayName) {
          // code block to be executed
        }
        ```

        See an example about fruits:

         */

        String[] fruits = {"apple", "banana", "orange", "strawberries", "peach"};

        for (String i : fruits){
            System.out.println(i);
        }

        /*

        some important words to be addressed:

        __ Java Break __

        You have already seen the break statement used in an earlier chapter of this tutorial.
        It was used to "jump out" of a switch statement.

        The break statement can also be used to jump out of a loop.

        __ Java Continue __

        The continue statement breaks one iteration (in the loop), if a specified condition occurs,
        and continues with the next iteration in the loop.

        NOTE: both words can user Loops 'while()' | 'do .. while()' | 'for()'

         */

    }
}
