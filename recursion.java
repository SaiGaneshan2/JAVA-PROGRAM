import java.sql.SQLOutput;
import java.util.*;
public class recursion {
    public static void main(String[] args)
    {
        System.out.println("hello world");
        message();
    }
    public static void message()
    {
        System.out.println("1");
        message2();
    }
    public static void message2()
    {
        System.out.println("2");
        message3();
    }
    public static void message3()
    {
        System.out.println("3");
    }
}
