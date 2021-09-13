package Java_Methods;

public class Lesson01_Parameters {

    /*
        --> Parameters and Arguments:

        Information can be passed to methods as parameter. Parameters act as variables inside the method.

        Parameters are specified after the method name, inside the parentheses. You can add as many parameters
        as you want, just separate them with a comma.

        See an example:
    */

    static void myName(String name) {
        System.out.println("Your name is: " + name);
    }

    /*
    --> Multiple Parameters:

    You can have as many parameters as you like:
     */

    static void MyLogin(String username, int pass) {
        System.out.println("\nYour login: \nUsername = " + username + "\nPassword = " + pass);
    }

    /*
    --> Return Values:

    If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    instead of void, and use the return keyword inside the method:
     */

    static int Sum(int n1, int n2) {
        return (n1 + n2);
    }

    //Execute the Methods:

    public static void main(String []args) {
        myName("CarlosViniMSouza"); // output: Your name is: CarlosViniMSouza
        MyLogin("CarloSouza", 14012765);
        System.out.println("\nThe sum is: " + Sum(10, 15));
    }

}
