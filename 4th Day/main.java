/**
 * name : Java Strings
 * 
 */

public class main {
    public static void main(String[] args){
        String name = "hello";
        System.out.println("length of text : " + name.length());

    }
}

/**
 * name : Strings method 
 * upperCase and lowerCase 
 * 
 */

class main1{
    public static void main(String[] args){
        String hisName = "Leon";
        String details = "HE IS A STUDENT";
        System.out.println(hisName.toUpperCase());
        System.out.println(details.toLowerCase());
    }
}

/**
 * method name : Finding a Character in a Stringn by indexof()
 * 
 */

class main2{
    public static void main(String[] args){

        String test = "Finding a Character in a String";
System.out.println(test.indexOf("F"));
    
    }

}

/**
 * name : You can use the charAt() method to access a character at a specific position in a string;
 */

class main3{
    public static void main(String[] args){
        String test2 = "You can use the charAt() method to access a character at a specific position in a string:";
        System.out.println(test2.charAt(0));
    }
}

/**
 * name : comparing strings 
 * method : equals()
 */

class main4{
    public static void main(String[] args){
        String useIt = "Shampo";
        String compare = "FaceWash";
        System.out.println(compare.equals(useIt));
    }
}

class main5{
    public static void main(String[] args){
        String subject = "Bangla";
        String comparigSubject = "Bangla";

        System.out.println(subject.equals(comparigSubject));
    }
}

/**
 * name : Removing Whitespace

The trim() method removes whitespace from the beginning and the end of a string:
 */

class main6{
    public static void main(String[] args){
        String subject2 = "  English  ";
        System.out.println("before : ["+subject2+"]");
        System.out.println("after ["+ subject2.trim()+"]");
    }
}