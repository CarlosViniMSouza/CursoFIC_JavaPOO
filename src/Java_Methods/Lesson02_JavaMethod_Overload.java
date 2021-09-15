package Java_Methods;

public class Lesson02_JavaMethod_Overload {

    /*
    --> Method Overloading

    With method overloading, multiple methods can have the same name with different parameters. Example:

    int myMethod(int x)
    float myMethod(float x)
    double myMethod(double x, double y)

    ** Instead of defining two methods that should do the same thing, it is better to overload one. Example: **

     */

    static int Sum(int n1, int n2) {
        return n1 + n2;
    }

    static double Sum(double v1, double v2) {
        return v1 + v2;
    }

    // Now, for use the methods, we do:
    public static void main(String []args) {

        int test1 = Sum(7, 5);
        double test2 = Sum(5.5, 10.55);
        System.out.println("The First result is: " + test1);
        System.out.println("The second result is: " + test2);

    }

    // Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
}
