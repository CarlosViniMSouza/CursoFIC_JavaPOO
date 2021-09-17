package Java_OOP;

public class Lesson02_Java_Classes_Objetcs {

    /*
    --> Java Classes/Objects

    Remember: Java is an object-oriented programming language.

    Everything in Java is associated with classes and objects, along with its attributes and methods.
    For example: in real life, a car is an object. The car has attributes, such as weight and color,
    and methods, such as drive and brake.

    A Class is like an object constructor, or a "blueprint" for creating objects.

    --> Create a Class

    To create a class, use the keyword 'class'. Example:

    */

    static class calculator {
        int n1 = 10;
        int n2 = 25;
        int result = n1 + n2;
    }

    /*
    --> Create an Object

    In Java, an object is created from a class. We have already created the class named Main,
    so now we can use this to create objects.

    To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

     */

    /*
    --> Multiple Objects

    You can create multiple objects of one class:

     */

    public static void main(String[] args) {

        calculator newObj = new calculator();
        System.out.println("The sum of n1 and n2 is = " + newObj.result); // One object
        System.out.println("The number 1: " + newObj.n1); // Multiples Objects
        System.out.println("The number 1: " + newObj.n2); // Multiples Objects

    }
}
