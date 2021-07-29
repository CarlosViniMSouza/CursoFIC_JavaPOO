package Java_Tutorial;

public class Lesson10_JavaCondition {

    public static void main(String []args) {

        /*

        __ The else if Statement __

        Use the else if statement to specify a new condition if the first condition is false.

        if (condition1) {
          // block of code to be executed if condition1 is true
        } else if (condition2) {
          // block of code to be executed if the condition1 is false and condition2 is true
        } else {
          // block of code to be executed if the condition1 is false and condition2 is false
        }

        In resume, it's this! A conditionals sequence for specifics goals.

        An Example very single:

            If age < 18 --> Print: "under age"
            If 18 <= age < 60 --> Print: "Adult"
            If age >= 60 --> Print: "old-aged"

         */

        int age = 20;

        if (age >= 1 && age < 18) {
            System.out.println("under age");
        } else if (age >= 18 && age < 60) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("old-aged");
        } else {
            System.out.println("Age Invalid");
        }

        /*

        __ Short Hand If...Else (Ternary Operator) __

        There is also a short-hand if else, which is known as the ternary operator because it consists
        of three operands. It can be used to replace multiple lines of code with a single line.
        It is often used to replace simple if else statements:

        variable = (condition) ? expressionTrue :  expressionFalse;

        See more an example of Conditional Structure in Java Program:

        if financial_account >= 10000 --> Print: "Ok, we can help you in your project!"
        else --> Print: "Sorry, insufficient score!"

         */

        float fin_acc = 20500.75f;
        String resp = (fin_acc >= 10000)? "Ok, we can help you in your project!": "Sorry, insufficient score!";
        System.out.println(resp);

    }
}
