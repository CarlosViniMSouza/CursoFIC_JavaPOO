package Java_Methods;

public class Lesson04_JavaRecursion {

    /*
    --> Java Recursion:

    Recursion is the technique of making a function call itself. This technique provides a way to break
    complicated problems down into simple problems which are easier to solve.

    Recursion may be a bit difficult to understand. The best way to figure
    out how it works is to experiment with it. See an example:

     */

    public static int Sum(int num) {

        if(num > 0) {
            return num + Sum(num -1);
        } else {
            return 0;
        }
    }

    /*
    --> Example Explained:

    10 + sum(9)
    10 + ( 9 + sum(8) )
    10 + ( 9 + ( 8 + sum(7) ) )
    ...
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 = 55

    In the actual case: 100 + 99 + 98 + 97 + ... + 0 = 5050
     */

    /*
    --> Halting Condition:

    Just as loops can run into the problem of infinite looping, recursive functions can run into the
    problem of infinite recursion. Infinite recursion is when the function never stops calling itself.

    Every recursive function should have a halting condition, which is the condition where the function
    stops calling itself.

    I'll use the function demonstrated earlier how to example:

     */

    public static int sum(int num, int cond) {

        if(num > 0 && num > cond) {
            return num + sum(num - 1, cond);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result1 = Sum(100);
        int result2 = sum(100, 50);
        System.out.println("The result1 is: " + result1);
        System.out.println("The result2 is: " + result2);
    }
}
