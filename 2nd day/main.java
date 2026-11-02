// Java Variables

// Variables are containers for storing data values.

// In Java, there are different types of variables, for example:

//     String - stores text, such as "Hello". String values are surrounded by double quotes
//     int - stores integers (whole numbers), without decimals, such as 123 or -123
//     float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//     char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//     boolean - stores values with two states: true or false

// Declaring (Creating) Variables

// To create a variable in Java, you need to:

//     Choose a type (like int or String)
//     Give the variable a name (like x, age, or name)
//     Optionally assign it a value using =

/**
 * name : Variable Declaration
 * note : It is important that you end the statement with a semicolon ;.
 */

public class main {
    public static void main(String[] args){
        String name = "Hi , my name is Nabil";
        String details = ", I am a Frontend Developer and i also have background in Computer Scinece and Technology";
        String gaol = ", I want to become a successfull frontend developer in future";
        System.out.println(name + details + gaol);
    }
}