package com.basic.thread;

/*
 *@author hanyunzhuo
 *@date 2020/6/1 8:55
 */
public class NotifyTest {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    for (int i = 0; i < 100; i++) {

                        System.out.println(i);

                        try {
                            this.wait();
                            this.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }).start();
    }

}
