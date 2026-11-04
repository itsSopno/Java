/**
 * topic : learing typecasting,
 * note : implicit typecasting
 * main
 * name : Widening Casting
 */
public class main{
    public static void main(String[] args){
        int a = 10;
        double b = a;
        System.out.println("hello world");
        System.out.println(b);
    }
}

/**
 * name : narrow casting;
 * note : explicit typecasting
 */
    
class main2{
    public static void main(String[] args){
double a = 10.10;
int b = (int)a;
System.out.println(b);
    }
}


/**
 * name : real life example of typecasting;
 * note : implicit typecasting
 */

class main3{
    public static void main(String[] args){
        int maxScore = 100;
        int userScore = 90;
        double percentage = (double)userScore / maxScore * 100;
        System.out.println("User percentage is :" + percentage);
    }
}

/**
 * name : Java arethmatic Operator :
 * note : Java Operator is a symbol that is used to perform operations on variables and values.
 * Operator 	Name 	Description 	Example 	Try it
+ 	Addition 	Adds together two values 	x + y 	
- 	Subtraction 	Subtracts one value from another 	x - y 	
* 	Multiplication 	Multiplies two values 	x * y 	
/ 	Division 	Divides one value by another 	x / y 	
% 	Modulus 	Returns the division remainder 	x % y 	
++ 	Increment 	Increases the value of a variable by 1 	++x 	
-- 	Decrement 	Decreases the value of a variable by 1 	--x
 */

class main4{
    public static void main(String[] args){
        int y = 10;
        int x = 5;
        System.out.println(y + x);
        System.out.println(y-x);
        System.out.println(y * x);
        System.out.println(y/x);

        int z = 10 ;
        ++z;
        System.out.println(z);
        int w = 10;
    --w;
    System.out.println(w);
    }
}

/**
 * name : Real life example of counting people in a room;
 * note : implicit typecasting;
 * 
 */
 class main5{
    public static void main(String[] args){
        int peopleInRoom = 0;
        peopleInRoom++;
        System.out.println(peopleInRoom);
        peopleInRoom++;
        System.out.println(peopleInRoom);
        peopleInRoom --;
        System.out.println(peopleInRoom);
    }
 }

 /**
  * name : Assignment Operators
  * topic : Assignment Operators are used to assign values to variables.
  * details : Assignment operators are used to assign values to variables.

In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:
  */

 class main6{
public static void main(String[] args){
    int x = 30;
    int y = 20;
    x += 10;
    x |=10;
    x ^= 10;
    x &=10;
    y >>=10;
    x <<=10;
    System.out.println(x);
    System.out.println(y);
}
 }

//  real life exanmple

class main7{
    public static void main(String[] args){
        int savings = 1000;
        savings += 500;
        System.out.println("Now saving is :" + savings);
    }
}


/**
 * topic name : Comparison Operators
 * note : Comparison operators are used to compare two values.
 */

class main8{
    public static void main(String[] args){
int x = 10;
int y = 20;
System.out.println(x < y);
System.out.println(x > y);
System.out.println(x == y );
System.out.println(x != y);
System.out.println(x<=y);
System.out.println(x >=y);
    }
}

/**
 * topic name : Logical Operators
 * note : Logical operators are used to combine conditional statements.
 */

class main9{
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        System.out.println(x < 15 && y > 15);
        System.out.println(x<29 || y > 15);

    }
}

/**
 * name : real life example of logical operator;
 * topic : login check;
 * 
 */

class main10{
    public static void main(String[] args){
        boolean isAdmin = true;
        boolean isLoggedIn = false;

        System.out.println("Is Regular User && isLoggedIn: " + (isAdmin && isLoggedIn));
    System.out.println("Is Admin || isLoggedIn : " + (isAdmin || isLoggedIn));
    System.out.println("not logged in :" + !isLoggedIn);
    }
}