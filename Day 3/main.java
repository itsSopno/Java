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

