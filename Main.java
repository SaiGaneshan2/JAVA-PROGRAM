import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    static int add(int a,int b)
    {
        return a+b;
    }
    static String greet()
    {
        return "sai ganeshan is great";
    }
    static String greet(String name)
    {
        String hello = name + " is a great person";
        return hello;
    }
    public static int[] getArray(int[] arr) {
        return arr;
    }
    public static void main(String[] args)
    {
        int a =0;int b =1;
        int i = add(2,4);
        System.out.println("the sum is "+i);
        String s = greet();
        System.out.println(s);
        String h = greet("sai");
        System.out.println(h);
        int f[] = {1,2,3,4};
        int[] he    = getArray(f);
        System.out.println(Arrays.toString(he));
    }
}