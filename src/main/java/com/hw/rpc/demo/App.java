package com.hw.rpc.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));

        List<String> list1 = new ArrayList<>();
        list1.add("haha");
        list1.add("xixi");
        list1.add("hehe");

        List<String> list2 = new ArrayList<>();
        list2.add("haha");
        list2.add("hehe");

        System.out.println(list1.containsAll(list2));

    }
}
