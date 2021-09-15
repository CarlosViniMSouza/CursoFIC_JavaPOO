package Java_Methods;

public class Lesson03_Scope {

    /*
    --> Block Scope

    Variables declared inside blocks of code are only accessible by the code between the curly braces,
    which follows the line in which the variable was declared: Example:
     */

    public static void main(String[] args) {

        { // This is a block

            int var = 100 + 250;

            System.out.println(var);

        } // The block ends here

    }

    // A block of code may exist on its own or it can belong to an if, while or for statement.
    // In the case of for statements, variables declared in the statement itself are also available
    // inside the block's scope.
}
