import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        System.out.println(df.format(myDouble));
        // 4. boolean
        // true false keywords
        boolean myBool = true;
        System.out.println("myBool: " + myBool);
        // 5. short 6. long 7. float 8. byte

        // STRINGS
        String myString = "hello";
        System.out.println("myString: " + myString);
        System.out.println(myString.length());

        // task 1: declare two variables, one for your first name, one for your last name
        // display <your first name> <your last name> has <#> of characters in it
        // ex: gina sprint has 10 character in it
        String firstName = "gina";
        String lastName = "sprint";
        int totalChars = firstName.length() + lastName.length();
        System.out.println(firstName + " " + lastName + " has " + totalChars + " chars in it");

        // trim() split() charAt() toCharArray()

        // CONSTANTS
        // use final keyword
        // use MACRO_CASE
        final int SIZE = 10;

        // ARRAYS
        // declare and initialize at the same time
        int[] myInts = {6, 3, 6, 3, 8, 9};
        System.out.println(myInts);
        // every class in Java inherits directly or indirectly from Object
        // Object has a method toString() returns a string (hashcode)
        System.out.println(Arrays.toString(myInts));

        // task 2: declare and initialize an array of 4 of your friends' names
        // print out the array, size, last element
        final int NUM_FRIENDS = 4;
        String[] myFriends = new String[NUM_FRIENDS];
        myFriends[0] = "Phoebe";
        myFriends[1] = "Joey";
        myFriends[2] = "Chandler";
        myFriends[3] = "Ross";

        System.out.println(Arrays.toString(myFriends));
        System.out.println(myFriends.length);
        System.out.println(myFriends[myFriends.length - 1]);

        // CONTROL FLOW
        // if/else if/else and switch are the same as C++
        // for, while, do-while loops same as C++
        // both have a range based for loop (for each loop)
        for (String friend : myFriends) { // for each string friend in myFriends
            System.out.println(friend);
        }

        // task 3: print out the first 20 even numbers
        //2 4 6 ...38 40
        // on the same line System.out.print()
        for (int i = 2; i <= 40; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // METHODS
        // methods are functions
        // PA1 all methods are static methods
        // task 4: define/call a method that accepts two strings and returns true if the
        // last character of the two strings is the same, false otherwise
        System.out.println(hasSameLastCharacter("hello", "o"));

        // RANDOM NUMBERS
        Random random = new Random();
        System.out.println(random.nextInt(10)); // [0, bound)

        // USER INPUT
        // use Scanner class
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your favorite number: ");
        int favNum = kb.nextInt();
        System.out.println(favNum);
        kb.nextLine(); // flush the newline character out of the buffer
        System.out.println("Your favorite number is: " + favNum);


        System.out.print("Enter your favorite place: ");
        String favPlace = kb.nextLine();
        System.out.println("Your favorite place: " + favPlace);
    }

    public static boolean hasSameLastCharacter(String first, String second) {
        // null denotes an invalid reference
        if (first != null && second != null) {
            if (first.length() > 0 && second.length() > 0) {
                // safe to compare last characters
                return first.charAt(first.length() - 1) == second.charAt(second.length() - 1);
            }
        }
        return false;
    }

}
