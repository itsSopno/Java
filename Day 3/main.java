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