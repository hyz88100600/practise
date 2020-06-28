package com.basic.stringpool;



/*
 *@author hanyunzhuo
 *@date 2020/6/23 17:03
 *
 * 常量池测试类
 */
public class StringPoolDemo {

    int a = 10;
    final int b = 20;
    static int c = 30;
    static final int d = 40;


    private int e=50;
    private final int f = 60;
    private static int g = 70;
    private static final  int h = 80;

    public void test(){
        String abc = new String("str");
    }

    StringPoolDemo(){
        go();
        System.out.println(a);
    }

    private void go() {
    }


    public static void main(String[] args) {
            StringPoolDemo sp = new StringPoolDemo();

    }
}
