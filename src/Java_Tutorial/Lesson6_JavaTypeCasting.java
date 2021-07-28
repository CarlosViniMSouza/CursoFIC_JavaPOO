package Java_Tutorial;

public class Lesson6_JavaTypeCasting {

    public static void main(String []args) {

        /*
            ** Java Type Casting **

            Type casting is when you assign a value of one primitive data type to another type.

            In Java, there are two types of casting:

            Widening Casting (automatically) - converting a smaller type to a larger type size:
            ** byte -> short -> char -> int -> long -> float -> double

            Narrowing Casting (manually) - converting a larger type to a smaller size type:
            ** double -> float -> long -> int -> char -> short -> byte

            See 1 example of Widening Casting for better comprehension:

            ```
            int num = 10;
            float value = num;
            System.out.println(value);   // Output: 10.0
            ```
            See 1 example of Narrowing Casting for better comprehension:

            ```
            float numDecimal = 15.75f;
            int numInt = (int) numDecimal;
            System.out.println(numInt);   // Output: 15
            ```
         */

        int num = 10;
        float value = num;
        System.out.println("The result: " + value);   // Output: 10.0

        float numDecimal = 15.75f;
        int numInt = (int) numDecimal;
        System.out.println("The conversion: " + numInt);   // Output: 15

    }
}
