public class main {
    public static void main(String[] args){
System.out.println("Hello world");
    }
}

/**
 * topic : Contact method
 * main2git 
 */
class main2{
    public static void main(String[] args){
        String firstName = "Nabil";
String MiddleName = "Hasan";
String lastName  = "Alamin";
int age = 19;
System.out.println(firstName.concat(MiddleName + lastName) + age);
    }
}


/**
 * topic : special charecter
 */

class main3{
    public static void main(String[] args){
        String text = "He is a \\ gay";
        String textOne = " She is a \n lesbian";
        String textTwo = "Sheikh hasina aibooo \b na";
        String textThree = "Maybe bangladesh will naver prticipate in \t workd cup";

        System.out.println(text);
        System.out.println(textOne);
        System.out.println(textTwo);
        System.out.println(textThree);
    }
}

/**
 * topic : string builder
 * In the String Concatenation chapter, you learned to join strings with the + operator.

But a String cannot be changed after it is created. When you add text to a string, Java does not change the old string. It creates a new string every time.

A StringBuilder is a string that can be changed. You can add, insert, replace, delete and reverse text, and Java keeps changing the same text. Think of it like a document that you keep editing, instead of writing a new copy for every change.
 */

class main4{
    public static void main(String[] args){
        StringBuilder in = new StringBuilder("Hello");
        in.append("Iam Nabil");
        System.out.println(in);

    }
}
/**
 * name :append 
 * main5
 */
class main5{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("I am Nabil ");
        sb.append(", I am 19 years old");
        sb.append(", i am a frontend developer");
        sb.append(", and");
        sb.append("  I also have background in computer science and technology");

        System.out.println(sb);
    }
}
/**
 * name : Insert, Replace and Delete
 * note : A StringBuilder can also change text in the middle. These methods use positions, just like charAt(). Remember that Java counts positions from 0:

    insert(position, text) inserts text at a position
    replace(start, end, text) replaces the characters from start to end
    delete(start, end) removes the characters from start to end

 */

    class main6{
        public static void main(String[] args){
            StringBuilder nb = new StringBuilder("Hi I am nabil , i am a boy and i have background in diploma in CST , I have a gf ");
             nb.insert(7, "my");
             nb.insert(0, "new");
             nb.reverse();
             System.out.println(nb);
        }
    }