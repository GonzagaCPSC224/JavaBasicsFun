import java.text.DecimalFormat;

/**
 * a javadoc block level comment
 */

// single line comment

public class Main {
    // every public type in Java has to be in its own file
    // there are 4 access modifiers
    // 1. public (accessible anywhere)
    // 2. private
    // 3. protected
    // 4. package-private

    public static void main(String[] args) {
        // static means class level (we don't need an object to invoke main())
        // static means no "this" reference

        // String[] this is a type, an array of Strings
        // args is the parameter, stores incoming command line arguments
        // when we run a program, we can pass in arguments
        System.out.println(args.length);

        // VARIABLES
        // a variable is either a primitive or a reference
        // 8 primitives
        // 1. char
        char myChar = 'a';
        // can concatenate primitives with strings
        System.out.println("myChar: " + myChar);
        // 2. int
        // 3. double (double precision floating point number)
        // java.lang is a package you get for free
        double myDouble = Math.PI;
        System.out.println("myDouble: " + myDouble);
        // use DecimalFormat class to round decimals to 2 places (for example)
        DecimalFormat df = new DecimalFormat("#0.00");
    }

}
