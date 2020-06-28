package com.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{

    private String abc = "abc";

    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
    }

    public void testNode(){
        Node n = new Node();
        System.out.println(n);
    }

    class Node{
        @Override
        public String toString() {
            return "Node{}";
        }
    }
}
