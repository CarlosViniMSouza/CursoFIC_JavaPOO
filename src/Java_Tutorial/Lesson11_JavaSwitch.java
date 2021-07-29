package Java_Tutorial;

public class Lesson11_JavaSwitch {

    public static void main(String []args) {

        /*
        __ Java Switch Statements __

        Use the switch statement to select one of many code blocks to be executed.

        switch(expression) {
          case x:
            // code block
            break;
          case y:
            // code block
            break;
           case ...:
           // code block (number N)
           break;
          default:
            // code block
        }

        And other form:

        switch (variable) {
            case a -> // code block
            case b -> // code block
            case c -> // code block
            ...
            Default -> // code block
        }

        This is how it works:

        1- The switch expression is evaluated once.
        2- The value of the expression is compared with the values of each case.
        3- If there is a match, the associated block of code is executed.
        4- The break and default keywords are optional, and will be described later in this chapter

        And, for better comprehension, See the program that has the following task:

        --> Choose a number between 1 and 5, each number indicates a different movie:
         */

        int movie = 3;

        switch (movie) {
            case 1 -> System.out.println("Furious & Fast 8");
            case 2 -> System.out.println("The Hobbit - The war of 5 army");
            case 3 -> System.out.println("The Galaxy Guardians 3");
            case 4 -> System.out.println("Black Widow");
            case 5 -> System.out.println("Black Panther");
            default -> System.out.println("Error!");
        }

        /*

        __ The break Keyword __

        When Java reaches a break keyword, it breaks out of the switch block.

        This will stop the execution of more code and case testing inside the block.

        __ The default Keyword __

        The default keyword specifies some code to run if there is no case match:

        NOTE: 'default statement' is used as the last statement in a switch block, it does not need a break.

         */

    }
}
